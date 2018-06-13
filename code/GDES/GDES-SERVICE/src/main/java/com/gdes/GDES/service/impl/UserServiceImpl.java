package com.gdes.GDES.service.impl;


import com.gdes.GDES.dao.RoleMapper;
import com.gdes.GDES.dao.UserMapper;
import com.gdes.GDES.model.Permission;
import com.gdes.GDES.model.Role;
import com.gdes.GDES.model.User;
import com.gdes.GDES.model.UserPage;
import com.gdes.GDES.model.utils.MenuUtil;
import com.gdes.GDES.model.utils.ShiroKit;
import com.gdes.GDES.model.utils.TokenUtil;
import com.gdes.GDES.service.UserService;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 *
 */
@Service
public class UserServiceImpl implements UserService {

//    @Autowired
//    private UserMapper userMapperE;

    @Resource
    private UserMapper userMapper;

    @Resource
    private RoleMapper roleMapper;


//    public User getUserByUserName(String idU) {
//        return this.userMapperE.selectUserByUserName(idU);
//    }

//    public Set<String> getRolesByUserName(String idU) {
//        return this.userMapperE.selectRolesByUserName(idU);
//    }

//    public Set<String> getPermissionByUserName(String idU) {
//        return this.userMapperE.selectPermissionByUserName(idU);
//    }


//    分割===================================================

    public User login(String username, String password) {
        User user = userMapper.findByUserName(username);
        // 密码匹配的工作交给 Shiro 去完成
        if (user == null) {
            // 因为缓存切面的原因,在这里就抛出用户名不存在的异常
            throw new UnknownAccountException("用户名不存在(生产环境中应该写:用户名和密码的组合不正确)");
        } else if (user.getStatus() == 0) {
            throw new LockedAccountException("用户已经被禁用，请联系管理员启用该账号");
        }
        return user;
    }


    @Override
    public List<Permission> selectPermissionsByUserId(Integer userId) {
        List<Permission> permissions = userMapper.selectPermissionsByUserId(userId);
        /*if (roleIds.contains(1)){
            //超级管理员
        }*/
        return permissions;
    }

    @Override
    public List<String> selectRoleSnsByUserId(Integer userId) {
        return userMapper.selectRoleSnsByUserId(userId);
    }


    /**
     * 根据用户ID获取菜单列表
     *
     * @param userId
     * @return
     */
    public List<List<Permission>> selectMenusByUserId(Integer userId) {
        List<Integer> roleIds = userMapper.selectRoleIdByUserId(userId);
        List<Permission> permissions = null;
        //如果角色id包含1,说明当前登录用户拥有超级管理员身份
        if (roleIds.contains(1)) {
            permissions = userMapper.selectAllMenus();
        } else {
            permissions = userMapper.selectMenusByUserId(userId);
        }
        List<List<Permission>> list = null;
        if (permissions.size() > 0) {

            list = MenuUtil.getMenus(permissions);
//            list = MenuUtil.getMenus(permissions);

        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).size() == 0) {
                list.remove(i);
                i--;
            }
        }
        return list;
    }


    /**
     * 根据用户名加载用户对象（用于登录使用）
     *
     * @param username
     * @return
     */
    @Override
    public User loadByUsername(String username) {
        return userMapper.loadByUserName(username);
    }

    /**
     * 修改密码
     *
     * @param user
     * @return
     */
    @Override
    public Integer updatePwd(User user) {
        user.setPassword(ShiroKit.md5(user.getPassword(), user.getUsername()));
        return userMapper.updatePwd(user);
    }


    /**
     * 获取用户列表
     *
     * @return
     */
    @Override
    public UserPage selectUserPage(User user) {
        List<User> data = userMapper.selectUserByCondition(user);
        User token = TokenUtil.getUser();
        Role role = roleMapper.selectRoleByUserId(token.getUserId());
        if (role.getId() >= 2) {
            for (int i = 0; i < data.size(); i++) {
                if (data.get(i).getRoleId() == 1 || data.get(i).getRoleId() == 2) {
                    data.remove(i);
                    i--;
                }
            }
        }
        Integer count = userMapper.selectUserCountByCondition();
        UserPage userPage = new UserPage();
        userPage.setCount(count);
        userPage.setData(data);
        return userPage;
    }

    /**
     * 删除选择用户
     *
     * @param user
     * @return
     */
    @Override
    public Integer deleteUserById(User user) {
        int i = userMapper.deleteUserById(user);
        int i1 = userMapper.delectUserRole(user);
        if (i + i1 >= 2) {
            return 1;
        } else {
            return 0;
        }
    }

    /**
     * 添加用户信息,并关联角色表
     *
     * @param user
     * @return
     */
    @Override
    public User add(User user) {
        if (user.getPassword() == null || user.getPassword() == "") {
            user.setPassword("000000");
        }
        // 使用用户名作为盐值，MD5 算法加密
        user.setPassword(ShiroKit.md5(user.getPassword(), user.getUsername()));
        User u = userMapper.findByUserName(user.getUsername());
        //判断要插入的目标对象是否存在
        if (u == null) {
            Date now = new Date();
            int i = userMapper.insert(user);
            int j = userMapper.insertUserRole(user);
        } else {
            user = new User();
        }
        return user;
    }

    /**
     * 修改用户当前状态
     *
     * @param user
     * @return
     */
    @Override
    public Integer updateStatusById(User user) {
        int i = userMapper.updateStatusById(user);
        return i;
    }

    /**
     * 提交用户修改数据
     *
     * @param user
     * @return
     */
    @Override
    public User update(User user) {
        User u = userMapper.findByUserId(user.getUserId());
        user.setId(u.getId());
        user.setDeptname(u.getDeptname());
        user.setRolename(u.getRolename());
        if (!u.equals(user)) {
            if (!(u.getPassword()).equals(user.getPassword())) {
                // 使用用户名作为盐值，MD5 算法加密
                user.setPassword(ShiroKit.md5(user.getPassword(), user.getUsername()));
            }
            /*//修改用户
            int update = userMapper.update(user);
            //删除用户角色关联
            int deleteUserRole = userMapper.delectUserRole(user);
            //重新添加用户角色关联
            int addUserRole = userMapper.addUserRole(user);*/
        }
        //修改用户
        int update = userMapper.update(user);
        //删除用户角色关联
        int deleteUserRole = userMapper.delectUserRole(user);
        //重新添加用户角色关联
        int addUserRole = userMapper.addUserRole(user);
        return user;
    }

    /**
     * 根据id获取用户信息
     *
     * @param userId
     * @return
     */
    @Override
    public User selectUserById(Integer userId) {
        return userMapper.selectUserById(userId);
    }

//    public User getUserInfoByUserId(String idU) {
//        return userMapperE.selectByPrimaryKey();
//    }

}

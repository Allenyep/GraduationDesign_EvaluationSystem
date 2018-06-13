package com.gdes.GDES.dao;


import com.gdes.GDES.model.Permission;
import com.gdes.GDES.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface UserMapper {
    /**
     * 根据用户名获取用户
     *
     * @param username
     * @return
     */
    User findByUserName(@Param("username") String username);

    /**
     * 根据用户id查询权限
     *
     * @param userId
     * @return
     */
    List<Permission> selectPermissionsByUserId(@Param("userId") Integer userId);

    /**
     * 根据用户id查询角色昵称
     *
     * @param userId
     * @return
     */
    List<String> selectRoleSnsByUserId(@Param("userId") Integer userId);

    /**
     * 根据用户id获取角色id
     *
     * @param userId
     * @return
     */
    List<Integer> selectRoleIdByUserId(@Param("userId") Integer userId);

    /**
     * 获取所有菜单列表
     *
     * @return
     */
    List<Permission> selectAllMenus();

    /**
     * 根据用户ID获取菜单列表
     *
     * @param userId
     * @return
     */
    List<Permission> selectMenusByUserId(@Param("userId") Integer userId);

    /**
     * 根据条件获取用户列表
     *
     * @param user
     * @return
     */
    List<User> selectUserByCondition(@Param("user") User user);

    /**
     * 根据条件获取用户总数
     *
     * @return
     */
    Integer selectUserCountByCondition();

    /**
     * 添加用户
     *
     * @param user
     * @return
     */
    int insert(@Param("user") User user);

    /**
     * 添加用户角色关联
     *
     * @param user
     * @return
     */
    int insertUserRole(@Param("user") User user);

    /**
     * 根据id获取用户信息
     *
     * @param userId
     * @return
     */
    User selectUserById(@Param("userId") Integer userId);

    /**
     * 提交用户修改数据
     *
     * @param user
     * @return
     */
    int update(@Param("user") User user);

    /**
     * 删除用户角色关联
     *
     * @param user
     * @return
     */
    int delectUserRole(@Param("user") User user);

    /**
     * 重新添加用户角色关联
     *
     * @param user
     * @return
     */
    int addUserRole(@Param("user") User user);

    /**
     * 修改用户当前状态
     *
     * @param status
     * @return
     */
    int updateStatusById(@Param("user") User user);

    /**
     * 删除选择用户
     *
     * @param user
     * @return
     */
    Integer deleteUserById(@Param("user") User user);
    /**
     * 根据用户名加载用户对象（用于登录使用）
     * @param username
     * @return
     */
    User loadByUserName(@Param("username") String username);

    /**
     * 修改密码
     * @param user
     * @return
     */
    Integer updatePwd(@Param("user") User user);

    /**
     * 根据用户id获取用户
     * @param userId
     * @return
     */
    User findByUserId(@Param("userId") Integer userId);
}

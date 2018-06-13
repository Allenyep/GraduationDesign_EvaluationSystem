package com.gdes.GDES.shiro.realm;


import com.gdes.GDES.model.Permission;
import com.gdes.GDES.model.User;
import com.gdes.GDES.service.UserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *
 */
public class MyRealm extends AuthorizingRealm {

    private static final Logger logger = LoggerFactory.getLogger(MyRealm.class);
    @Resource
    private UserService userService;
//    @Autowired
//    private IPermissionService permissionService;
//
//    @Autowired
//    private IRoleService roleService;




    /**
     * 授权
     *
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        logger.info("--- MyRealm doGetAuthorizationInfo ---");
        System.out.println("--- MyRealm doGetAuthorizationInfo ---");
        // 获得经过认证的主体信息
        User user = (User) principalCollection.getPrimaryPrincipal();
        Integer userId = user.getId();
        List<Permission> permissions = userService.selectPermissionsByUserId(userId);
        List<String> roleSns = userService.selectRoleSnsByUserId(userId);

        List<String> resStrList = new ArrayList<>();
        for (Permission permission : permissions) {
            if (permission != null) {
                resStrList.add(permission.getUrl());
            }
        }

        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.setRoles(new HashSet<>(roleSns));
        info.setStringPermissions(new HashSet<>(resStrList));

        // 以上完成了动态地对用户授权
        logger.debug("role => " + roleSns);
        logger.debug("permission => " + resStrList);

        return info;
    }

    /**
     * 认证
     *
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        logger.info("--- MyRealm doGetAuthenticationInfo ---");
        System.out.println("--- MyRealm doGetAuthenticationInfo ---");
        String username = authenticationToken.getPrincipal().toString();
        String password = new String((char[]) authenticationToken.getCredentials());
        // 以后我们使用 Spring 管理 Shiro 的时候，就不必要这样得到 UserService 了
        // userService = (IUserService) InitServlet.getBean("userService");
        // User user = userService.login(username,password);
        // 这里应该使用 load 方法，比对用户名的密码的环节应该交给 Shiro 这个框架去完成

        // 在测试调试的时候发现,这里还是应该使用 login 判断,因为登录不成功的原因有很多,
        // 可以在登录的逻辑里面抛出各种异常
        // 再到 subject.login(token) 里面去捕获对应的异常
        // 显示不同的消息到页面上
        User user = userService.login(username, password);
        if (user != null) {
            // 第 1 个参数可以传一个实体对象，然后在认证的环节可以取出
            // 第 2 个参数应该传递在数据库中“正确”的数据，然后和 token 中的数据进行匹配
            SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user, user.getPassword(), getName());
            // 设置盐值
            info.setCredentialsSalt(ByteSource.Util.bytes(username.getBytes()));
            return info;
        }
        return null;
    }


















    @Override
    public String getName() {
        return "MyRealm";
    }

    /**
     * doGetAuthorizationInfo 授权操作
     * 为当前登录的用户授予角色和权限
     * @param principalCollection
     * @return
     */
//    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
////        // 获取需要授权的用户名
////        String userName = (String) principalCollection.getPrimaryPrincipal();
////        // 创建授权对象
////        SimpleAuthorizationInfo authzInfo = new SimpleAuthorizationInfo();
////        // 查询当前用户名角色并授权
////        authzInfo.setRoles(this.userService.getRolesByUserName(userName));
////        // 查询当前用户名权限并授权
////        authzInfo.setStringPermissions(this.userService.getPermissionByUserName(userName));
////        return authzInfo;
//
//        User user = (User) principalCollection.getPrimaryPrincipal();
////
//        List<String> permissions = new ArrayList<String>();
//        List<String> roles = new ArrayList<>();
////
////        if("admin".equals(user.getName())){
//////            //拥有所有权限
////            permissions.add("*:*");
//////            //查询所有角色
////            roles = roleService.getAllRolename();
////        }else{
////            //根据用户id查询该用户所具有的角色
//            roles = roleService.getRoleSnByUserId(user.getIdU());
////            //根据用户id查询该用户所具有的权限
//            permissions = permissionService.getPermissionResourceByUserId(user.getIdU());
////        }
////
//        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
//        info.addStringPermissions(permissions);
//        info.addRoles(roles);
//        return info;
//    }

    /**
     * doGetAuthenticationInfo 认证操作
     * 验证当前登录的用户
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
//    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
////        // 获取需要验证的用户名
////        String userName = (String) authenticationToken.getPrincipal();
////        // 查询数据库中是否存在该用户名
////        User user = this.userService.getUserByUserName(userName);
////        if (user != null) {
////            // 存在
//////            AuthenticationInfo authcInfo = new SimpleAuthenticationInfo(user.getUsername(), user.getPswd(), "xx");
////            AuthenticationInfo authcInfo = new SimpleAuthenticationInfo(user.getIdU(), user.getPassword(), getName());
////            return authcInfo;
////        }
////        // 不存在
////        return null;
//
//        //从token中获取登录的用户名， 查询数据库返回用户信息
//        String username = (String) authenticationToken.getPrincipal();
////        User user = userDAO.getUserByUsername(username);
//        User user = userService.getUserByUserName(username);
//        if(user == null){
//            return null;
//        }
//        //ByteSource.Util.bytes(user.getUsername()), 加密
//        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user, user.getPassword()
//                ,ByteSource.Util.bytes(user.getIdU()),getName());
//        return info;
//    }


    //清除缓存
//    public void clearCached() {
//        //获取当前登录的用户凭证，然后清除
//        PrincipalCollection principalCollection= SecurityUtils.getSubject().getPrincipals();
//        super.clearCache(principalCollection);
//    }
}

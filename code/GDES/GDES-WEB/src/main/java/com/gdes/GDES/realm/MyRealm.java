package com.gdes.GDES.realm;



import com.gdes.GDES.model.User;
import com.gdes.GDES.service.IPermissionService;
import com.gdes.GDES.service.IRoleService;
import com.gdes.GDES.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class MyRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;
    @Autowired
    private IPermissionService permissionService;

    @Autowired
    private IRoleService roleService;



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
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
//        // 获取需要授权的用户名
//        String userName = (String) principalCollection.getPrimaryPrincipal();
//        // 创建授权对象
//        SimpleAuthorizationInfo authzInfo = new SimpleAuthorizationInfo();
//        // 查询当前用户名角色并授权
//        authzInfo.setRoles(this.userService.getRolesByUserName(userName));
//        // 查询当前用户名权限并授权
//        authzInfo.setStringPermissions(this.userService.getPermissionByUserName(userName));
//        return authzInfo;

        User user = (User) principalCollection.getPrimaryPrincipal();
//
        List<String> permissions = new ArrayList<String>();
        List<String> roles = new ArrayList<>();
//
//        if("admin".equals(user.getName())){
////            //拥有所有权限
//            permissions.add("*:*");
////            //查询所有角色
//            roles = roleService.getAllRolename();
//        }else{
//            //根据用户id查询该用户所具有的角色
            roles = roleService.getRoleSnByUserId(user.getIdU());
//            //根据用户id查询该用户所具有的权限
            permissions = permissionService.getPermissionResourceByUserId(user.getIdU());
//        }
//
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.addStringPermissions(permissions);
        info.addRoles(roles);
        return info;
    }

    /**
     * doGetAuthenticationInfo 认证操作
     * 验证当前登录的用户
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
//        // 获取需要验证的用户名
//        String userName = (String) authenticationToken.getPrincipal();
//        // 查询数据库中是否存在该用户名
//        User user = this.userService.getUserByUserName(userName);
//        if (user != null) {
//            // 存在
////            AuthenticationInfo authcInfo = new SimpleAuthenticationInfo(user.getUsername(), user.getPswd(), "xx");
//            AuthenticationInfo authcInfo = new SimpleAuthenticationInfo(user.getIdU(), user.getPassword(), getName());
//            return authcInfo;
//        }
//        // 不存在
//        return null;

        //从token中获取登录的用户名， 查询数据库返回用户信息
        String username = (String) authenticationToken.getPrincipal();
//        User user = userDAO.getUserByUsername(username);
        User user = userService.getUserByUserName(username);
        if(user == null){
            return null;
        }
        //ByteSource.Util.bytes(user.getUsername()), 加密
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user, user.getPassword()
                ,ByteSource.Util.bytes(user.getIdU()),getName());
        return info;
    }


    //清除缓存
    public void clearCached() {
        //获取当前登录的用户凭证，然后清除
        PrincipalCollection principalCollection= SecurityUtils.getSubject().getPrincipals();
        super.clearCache(principalCollection);
    }
}

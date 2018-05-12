package com.gdes.GDES.realm;


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
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 */
public class MyRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;

    /**
     * 为当前登录的用户授予角色和权限
     * @param principalCollection
     * @return
     */
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        // 获取需要授权的用户名
        String userName = (String) principalCollection.getPrimaryPrincipal();
        // 创建授权对象
        SimpleAuthorizationInfo authzInfo = new SimpleAuthorizationInfo();
        // 查询当前用户名角色并授权
        authzInfo.setRoles(this.userService.getRolesByUserName(userName));
        // 查询当前用户名权限并授权
        authzInfo.setStringPermissions(this.userService.getPermissionByUserName(userName));
        return authzInfo;
    }

    /**
     * 验证当前登录的用户
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        // 获取需要验证的用户名
        String userName = (String) authenticationToken.getPrincipal();
        // 查询数据库中是否存在该用户名
        User user = this.userService.getUserByUserName(userName);
        if (user != null) {
            // 存在
//            AuthenticationInfo authcInfo = new SimpleAuthenticationInfo(user.getUsername(), user.getPswd(), "xx");
            AuthenticationInfo authcInfo = new SimpleAuthenticationInfo(user.getIdU(), user.getPassword(), "xx");
            return authcInfo;
        }
        // 不存在
        return null;
    }
}

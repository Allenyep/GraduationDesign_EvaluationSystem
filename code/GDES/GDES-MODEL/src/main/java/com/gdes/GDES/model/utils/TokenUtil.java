package com.gdes.GDES.model.utils;


import com.gdes.GDES.model.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;


public class TokenUtil {
    /**
     * 登录
     *
     *
     * @param user
     * @param rememberMe @return
     */
    public static User login(User user, boolean rememberMe) {
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(), user.getPassword());
        token.setRememberMe(rememberMe);
        subject.login(token);
        return getUser();
    }

    /**
     * 获取当前登录的用户User对象
     *
     * @return
     */
    public static User getUser() {
        return (User) SecurityUtils.getSubject().getPrincipal();
    }
}

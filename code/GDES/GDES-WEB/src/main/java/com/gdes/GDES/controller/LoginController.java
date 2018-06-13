package com.gdes.GDES.controller;

import com.gdes.GDES.model.User;
import com.gdes.GDES.model.utils.TokenUtil;
import com.gdes.GDES.service.UserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author xiyifen
 * @date 2018/5/31 10:36
 */
@RequestMapping(value = "/userlogin")
@Controller
public class LoginController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(User user, boolean rememberMe, Model model) {
        String msg = null;
        System.out.println("+++++++++++++++++++++++");
        System.out.println(user.getUsername()+user.getPassword());
        try {
            //用户登录
            user = TokenUtil.login(user, rememberMe);

        } catch (Exception e) {
            /*User login = userService.login(user.getUsername(), user.getPassword());
            if (login.getStatus() == 0) {
                msg = "用户已经被禁用，请联系管理员启用该账号";
            } else {
                msg = "用户名或密码不正确";
            }*/
            msg = "用户名或密码不正确";
        } finally {
            if (msg == null) {
//                return "admin/index";
                return "redirect:/admin/pagejump/index.do";
            }

            model.addAttribute("msg", msg);
            return "index";
        }
    }
}

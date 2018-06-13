package com.gdes.GDES.controller;

import com.gdes.GDES.model.Permission;
import com.gdes.GDES.model.User;
import com.gdes.GDES.model.utils.TokenUtil;
import com.gdes.GDES.service.UserService;
//import com.gdes.GDES.util.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author xiyifen
 * @date 2018/5/31 13:24
 */
@RequestMapping("/admin/pagejump")
@Controller
public class PageJunpController {
    @Autowired
    private UserService userService;

    /**
     * 跳转到index主页
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(Model model) {
        //获取用户信息
        User user = TokenUtil.getUser();
        Integer userId = user.getId();
        List<List<Permission>> list= userService.selectMenusByUserId(userId);
        //System.out.println(list);
        model.addAttribute("list", list);
//        return "index";
        return "home";
    }

    /**
     * 跳转到welcome页面
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String welcome(Model model) throws Exception {
        return "welcome";
    }
}
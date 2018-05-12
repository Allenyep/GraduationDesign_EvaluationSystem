package com.gdes.GDES.controller;

import com.gdes.GDES.model.User;
import com.gdes.GDES.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by SongLiuxin on 2017/9/7.
 */
@Controller
@RequestMapping("/usertest")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("home")
    public String home (Model model){
        model.addAttribute("menuSelected1", "home");
        return "student/home";}
    @RequestMapping("/studentInfo")
    public String studentInfo (Model model){
        model.addAttribute("menuSelected1", "studentInfo");
        return "student/studentInfo";
    }

    @RequestMapping("/error.do")
    public String error() {
        return "/permission/404";
    }



    @RequestMapping(value = "{pageName1}/{pageName2}"+".do", method = RequestMethod.GET)
    public ModelAndView toPage(@PathVariable("pageName1") String pageName1, @PathVariable("pageName2") String pageName2) {
        System.out.println(pageName1);
        System.out.println("====================================");
        System.out.println(pageName2);
        ModelAndView mv = new ModelAndView(pageName1+"/"+pageName2);
        return mv;
    }


//    @RequestMapping(value = "{pageName1}", method = RequestMethod.GET)
//    public ModelAndView toPage(@PathVariable("pageName1") String pageName1) {
//        ModelAndView mv = new ModelAndView(pageName1);
//        return mv;
//    }


    /*---------------------------------------------------------------*/

    /**
     * 登录界面跳转
     * @return
     */
//    @RequiresRoles("admin")
//    @RequiresPermissions("admin:create")
    @RequestMapping("/index.do")
    public String index() {
        return "permission/index";
    }

    /**
     * 用户登录
     * @param user
     * @param request
     * @return
     */
    @RequestMapping("/login.do")
    public String login(User user, HttpServletRequest request) {

        System.out.println("=================================================================");
        System.out.println(user.getIdU()+user.getPassword());
        // 获取subject对象
        Subject subject = SecurityUtils.getSubject();
        // 实例化用户名密码令牌
        UsernamePasswordToken token = new UsernamePasswordToken(user.getIdU(), user.getPassword());
//        UsernamePasswordToken token = new UsernamePasswordToken("java", "111111");
        try {
            // 使用subject对象进行登陆
            subject.login(token);
            // 获取session
            Session session = subject.getSession();
            // 输出session
            System.out.println("sessionId:" + session.getId() + ";sessionHost:" + session.getHost() +";sessionTimeout:%s" + session.getTimeout());
            session.setAttribute("info", "session的数据");
//            return "redirect:success.do";
//            return "permission/main";
            return "permission/success";
        } catch (Exception e) {
            // 验证失败
            e.printStackTrace();
            request.setAttribute("user", user);
            request.setAttribute("errorMsg", "用户名或密码错误");
            return "index";
        }
    }



    /**
     * 权限验证失败跳转
     * @return
     */
    @RequestMapping("/unauthorized.do")
    public String unauthorized() {
        return "permission/unauthorized";
    }

    /**
     * 显示所有human
     * @param request
     * @return
     */
//    @RequestMapping("/success.do")
//    public String listAll(HttpServletRequest request) {
//        request.setAttribute("humans", this.userService.queryAll());
//        return "permission/list";
//    }

    /**
     * form界面跳转
     * @return
     */
    @RequestMapping("/form.do")
    public String form() {
        return "permission/form";
    }

    /**
     * 新增human
     * @param human
     * @return
     */
//    @RequestMapping(value = "/submit.do", method = RequestMethod.POST)
//    public String submit(Human human) {
//        this.userService.addHuman(human);
//        System.out.println(human.toString());
//        return "redirect:success.do";
//    }



    /**
     * 修改human
     * @param human
     * @return
     */
//    @RequestMapping("/update.do")
//    public String update(Human human) {
//        this.userService.updateHuman(human);
//        return "redirect:success.do";
//    }

    /**
     * 删除human
     * @param id
     * @return
     */
//    @RequestMapping("/del.do/{id}")
//    public String del(@PathVariable Integer id) {
//        System.out.println(id);
//        this.userService.delHuman(id);
//        return "redirect:/user/success.do";
//    }

    /**
     * 修改界面跳转并数据回显
     * @param id
     * @param request
     * @return
     */
//    @RequestMapping("/edit.do/{id}")
//    public String edit(@PathVariable Integer id, HttpServletRequest request) {
//        Human human = this.userService.queryById(id);
//        request.setAttribute("human", human);
//        return "form";
//    }

    /**
     * 注销用户
     * @return
     */
    @RequestMapping("/logout.do")
    public String logout() {
        Subject subject = SecurityUtils.getSubject();
        if (subject.isAuthenticated()) {
            // 销毁session，清理缓存
            subject.logout();
        }
//        return "redirect:index.do";
        return "permission/login1";
    }

}

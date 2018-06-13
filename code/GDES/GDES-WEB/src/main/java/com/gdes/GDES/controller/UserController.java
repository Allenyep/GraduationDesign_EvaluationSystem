package com.gdes.GDES.controller;

import com.gdes.GDES.model.Dept;
import com.gdes.GDES.model.Role;
import com.gdes.GDES.model.User;
import com.gdes.GDES.model.UserPage;
import com.gdes.GDES.service.DeptService;
import com.gdes.GDES.service.RoleService;
import com.gdes.GDES.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author xiyifen
 * @date 2018/5/31 18:26
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @Autowired
    private DeptService deptService;

    @Autowired
    private RoleService roleService;

    /**
     * 跳转到用户列表
     *
     * @return
     */
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(String msg,Model model) {
        /*if (msg!=null&&msg!=""){
            model.addAttribute("msg","用户添加成功!");
        }*/
        return "/user/list";
    }

    /**
     * 根据条件获取用户列表
     *
     * @param user
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public UserPage list(User user) {
        return userService.selectUserPage(user);
    }


    /**
     * 跳转到用户添加页面
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addIndex(Model model) {
        List<Dept> depts = deptService.selectDepts();
        List<Role> roles = roleService.selectRoles();

        model.addAttribute("depts", depts);
        model.addAttribute("roles", roles);
        return "/user/add";
    }

    /**
     * 添加用户---提交
     *
     * @param user
     * @param model
     * @return
     */

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(User user, Model model) {
        User add = userService.add(user);
        if (add.getUsername() == null) {
            List<Dept> depts = deptService.selectDepts();
            List<Role> roles = roleService.selectRoles();
            model.addAttribute("depts", depts);
            model.addAttribute("roles", roles);
            model.addAttribute("user", user);
            model.addAttribute("msg", "登录已存在,请修改登录名!");
            return "/user/add";
        } else {
            return "redirect:/user/index.do?msg=success";
        }
    }

    /**
     * 跳转到用户修改页面
     *
     * @param userId
     * @param model
     * @return
     */
    @RequestMapping(value = "/update/{userId}", method = RequestMethod.GET)
    public String updateInex(@PathVariable("userId") Integer userId, Model model) {
        User user = userService.selectUserById(userId);
        List<Dept> depts = deptService.selectDepts();
        List<Role> roles = roleService.selectRoles();
        model.addAttribute("depts", depts);
        model.addAttribute("roles", roles);
        model.addAttribute("user", user);
        return "/user/update";
    }

    /**
     * 提交用户修改数据
     *
     * @param user
     * @return
     */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(User user, Model model) {
        User update = userService.update(user);
        if(update!=null){
            model.addAttribute("msg", "用户修改成功!");
            return "redirect:/user/index.do?msg=success";
        }else{
            List<Dept> depts = deptService.selectDepts();
            List<Role> roles = roleService.selectRoles();
            model.addAttribute("depts", depts);
            model.addAttribute("roles", roles);
            model.addAttribute("user", user);
            model.addAttribute("msg", "用户失败成功!");
            return "user/update";
        }
    }

    /**
     * 修改用户当前状态
     * @param user
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/updateState",method = RequestMethod.POST)
    public String updateState(User user) {
        Integer i=userService.updateStatusById(user);
        if (i==1) {
            return "success";
        }else {
            return "error";
        }
    }

    /**
     * 删除选择用户
     * @param user
     * @return
     */
    @ResponseBody
    @RequestMapping(value="/deleteUserById",method = RequestMethod.POST)
    public String deleteUserById(User user){
        Integer i=userService.deleteUserById(user);
        if (i==1) {
            return "success";
        }else {
            return "error";
        }
    }
}

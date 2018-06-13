package com.gdes.GDES.controller;

import com.gdes.GDES.model.Permission;
import com.gdes.GDES.model.PermissionPage;
import com.gdes.GDES.service.PermissionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.management.monitor.MonitorSettingException;
import java.util.List;

/**
 * @author xiyifen
 * @date 2018/6/8 10:17
 */
@Controller
@RequestMapping(value = "/admin/menu")
public class MenuController {

    @Resource
    private PermissionService permissionService;


    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(String msg, Model model) {
        if (msg != null) {
            if ("error1".equals(msg)) {
                model.addAttribute("msg","当前菜单不可禁用");
            }
        }
        return "menu/list";
    }

    /**
     * 根据条件获取菜单列表
     * @param permission
     * @return
     */
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ResponseBody
    public PermissionPage list(Permission permission) {
        return permissionService.selectMenuPage(permission);
    }

    /**
     * 挑转到菜单添加页面
     * @param model
     * @return
     */
    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String addIndex(Model model) {
        List<Permission> menus=permissionService.selectNoSetMenus();
        List<Permission> parantMenus=permissionService.selectAllPermissions();
        model.addAttribute("menus", menus);
        model.addAttribute("parantMenus", parantMenus);
        return "/menu/add";
    }

    /**
     * 添加菜单
     * @param permission
     * @param model
     * @return
     */
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String add(Permission permission, Model model) {
        Integer update = permissionService.updatePermissionById(permission);
        if (update == 0) {
            //添加失败
            model.addAttribute("permission", permission);
            model.addAttribute("msg", "菜单添加失败，请重新添加");
            return "/menu/add";
        }else {
            return "redirect:/admin/menu/index.do?msg=success";
        }
    }

    @RequestMapping(value = "/update/{permissionId}",method = RequestMethod.GET)
    public String updateIndex(@PathVariable("permissionId") Integer permissionId, Model model) {
        Permission permission = permissionService.selectPermissionById(permissionId);
        List<Permission> menus=permissionService.selectNoSetMenus();
        List<Permission> parantMenus=permissionService.selectAllPermissions();
        model.addAttribute("menus", menus);
        model.addAttribute("parantMenus", parantMenus);
        model.addAttribute("permission", permission);
        return "/menu/update";
    }




}

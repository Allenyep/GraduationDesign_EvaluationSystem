package com.gdes.GDES.model.utils;

import com.gdes.GDES.model.Permission;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiyifen
 * @date 2018/5/31 13:35
 */
public class MenuUtil {
    public static List<List<Permission>> getMenus(List<Permission> resources) {
        //系统菜单列表
        List<Permission> adminList = new ArrayList<Permission>();
        //监控菜单列表
        List<Permission> monitorList = new ArrayList<Permission>();
        //预警菜单列表
        List<Permission> warningList = new ArrayList<Permission>();
        //分析菜单列表
        List<Permission> analysisList = new ArrayList<Permission>();
        //决策菜单列表
        List<Permission> decidingList = new ArrayList<Permission>();
        //菜单列表集合
        List<List<Permission>> list = new ArrayList<List<Permission>>();
        Permission menu = new Permission();
        for (Permission resource : resources) {
            if (resource.getParantid() == 0) {
                menu.setMenuname(resource.getMenuname());
                menu.setId(resource.getId());
                menu.setUrl(resource.getUrl());
                menu.setZindex(resource.getZindex());
                menu.setParantid(resource.getParantid());
                menu.setChildMenu(getMenus(resource.getId(), resources));
                if (menu.getId() == 1000) {
                    monitorList.add(menu);
                } else if (menu.getId() == 2000) {
                    warningList.add(menu);
                } else if (menu.getId() == 3000) {
                    analysisList.add(menu);
                } else if (menu.getId() == 4000) {
                    decidingList.add(menu);
                } else if (menu.getId() == 5000) {
                    adminList.add(menu);
                }
            }
            menu = new Permission();
        }
        list.add(monitorList);
        list.add(warningList);
        list.add(analysisList);
        list.add(decidingList);
        list.add(adminList);
        return list;
    }

    public static List<Permission> getMenus(Integer id, List<Permission> resources) {
        List<Permission> lists = new ArrayList<Permission>();
        for (Permission resource : resources) {
            Permission menu = new Permission();
            Integer parantid = resource.getParantid();
            if (id.equals(parantid)) {
                menu.setMenuname(resource.getMenuname());
                menu.setId(resource.getId());
                menu.setUrl(resource.getUrl());
                menu.setZindex(resource.getZindex());
                menu.setParantid(resource.getParantid());
                menu.setChildMenu(getMenus(resource.getId(), resources));
                lists.add(menu);
            }
        }
        return lists;
    }
}
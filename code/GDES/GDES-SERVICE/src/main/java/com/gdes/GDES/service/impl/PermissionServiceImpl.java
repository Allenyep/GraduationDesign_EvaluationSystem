package com.gdes.GDES.service.impl;

import com.gdes.GDES.dao.FeaturesMapper;
import com.gdes.GDES.dao.PermissionMapper;
import com.gdes.GDES.model.Features;
import com.gdes.GDES.model.Permission;
import com.gdes.GDES.model.PermissionPage;
import com.gdes.GDES.service.IPermissionService;
import com.gdes.GDES.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class PermissionServiceImpl implements PermissionService {

    @Resource
    private PermissionMapper permissionMapper;


    @Override
    public Permission selectPermission() {
        List<Permission> permissions = permissionMapper.selectPermission();
        List<Permission> permissions0 = getFirstPermissions(permissions);
        Permission permission = new Permission();
        permission.setChildMenu(permissions0);
        return permission;
    }

    /**
     * 根据条件获取权限列表
     *
     * @param permission
     * @return
     */
    @Override
    public PermissionPage selectPermissionPage(Permission permission) {
        List<Permission> permissions = permissionMapper.selectPermissionsByCondition(permission);
        Integer count = permissionMapper.selectPermissionsCountByCondition(permission);
        PermissionPage permissionPage = new PermissionPage();
        permissionPage.setCount(count);
        permissionPage.setData(permissions);
        return permissionPage;
    }


    /**
     * 添加权限&菜单
     *
     * @param permission
     * @return
     */
    @Override
    public Integer add(Permission permission) {
        Integer flag = permission.getFlag();
        if (flag == null) {
            permission.setFlag(0);
        }
        Integer i = null;
        try {
            i = permissionMapper.add(permission);
        } catch (Exception e) {
            return 0;
        }
        return i;
    }


    /**
     * 根据条件获取权限列表
     *
     * @param permission
     * @return
     */
    @Override
    public PermissionPage selectMenuPage(Permission permission) {
        List<Permission> permissions = permissionMapper.selectMenusByCondition(permission);
        Integer count = permissionMapper.selectMenusCountByCondition(permission);
        PermissionPage permissionPage = new PermissionPage();
        permissionPage.setCount(count);
        permissionPage.setData(permissions);
        return permissionPage;
    }

    /**
     * 获取未生成菜单的选项,排除'系统管理'和'系统资源'
     *
     * @return
     */
    @Override
    public List<Permission> selectNoSetMenus() {
        return permissionMapper.selectNoSetMenus();
    }

    /**
     * 获取所有父级菜单
     *
     * @return
     */
    @Override
    public List<Permission> selectAllPermissions() {
        List<Permission> allPermission = permissionMapper.selectAllPermissions();
        for (int i = 0; i < allPermission.size(); i++) {
            if (allPermission.get(i).getParantid() != 0) {
                //一级菜单
                Permission permission = allPermission.get(i);
                permission.setMenuname("|---" + permission.getMenuname());
            }
        }
        return allPermission;
    }

    /**
     * 菜单的添加,修改
     *
     * @param permission
     * @return
     */
    @Override
    public Integer updatePermissionById(Permission permission) {
        return permissionMapper.updatePermissionById(permission);
    }

    /**
     * 根据id获取权限数据
     *
     * @param permissionId
     * @return
     */
    @Override
    public Permission selectPermissionById(Integer permissionId) {
        return permissionMapper.selectPermissionById(permissionId);
    }

    /**
     * 根据id修改菜单启用状态
     *
     * @param permission
     * @return
     */
    @Override
    public Integer updateFlagById(Permission permission) {
        return permissionMapper.updateFlagById(permission);
    }

    /**
     * 根据id删除权限
     *
     * @param permission
     * @return
     */
    @Override
    public Integer deletePermissionById(Permission permission) {
        return permissionMapper.deletePermissionById(permission);
    }

    /**
     * 更新角色,删除授权并重新进行授权
     *
     *
     * @param permission
     * @return
     */
    @Override
    public Integer update(Permission permission) {
        return permissionMapper.update(permission);
    }

    /**
     * 删除菜单
     *
     * @param permission
     * @return
     */
    @Override
    public Integer deleteMenuById(Permission permission) {
        return permissionMapper.updateMenuById(permission);
    }

    /**
     * 获取顶级菜单
     *
     * @param permissions
     * @return
     */
    private List<Permission> getFirstPermissions(List<Permission> permissions) {
        List<Permission> permissions1 = new ArrayList<Permission>();
        //顶级权限
        for (Permission permission : permissions) {
            //设置顶级权限
            if (permission.getParantid() == null || "".equals(permission.getPermission()) || permission.getParantid() == 0) {
                List<Permission> permissions2 = getPermissions(permissions, permission);
                permission.setChildMenu(permissions2);
                permissions1.add(permission);
                //System.out.println("顶级权限" + permissions1);
            }
        }
        return permissions1;
    }

    /**
     * 递归调用菜单
     *
     * @param permissions
     * @param permission
     * @return
     */
    private List<Permission> getPermissions(List<Permission> permissions, Permission permission) {
        List<Permission> permissions2 = new ArrayList<Permission>();
        //一级权限
        for (Permission permission2 : permissions) {
            if (permission.getId().equals(permission2.getParantid())) {
                permissions2.add(permission2);
                List<Permission> permissions3 = getPermissions(permissions, permission2);
                permission2.setChildMenu(permissions3);
                //System.out.println("权限" + permissions2);
            }
        }
        return permissions2;
    }
}



//
//    @Autowired
//    private FeaturesMapper featuresMapper;
//
//
//    /**
//     * 获取所有权限
//     * @return
//     */
//    public Permission selectPermissions() {
//        return null;
//    }
//
//    public List<String> getPermissionResourceByUserId(String idU) {
//        return featuresMapper.selectPermissionByUserName(idU);
//    }
//
//    public List<String> getAllResources() {
//        return featuresMapper.getAllResources();
//    }
//
//    public void save(Features features) {
//        featuresMapper.savaFeatures(features);
//    }


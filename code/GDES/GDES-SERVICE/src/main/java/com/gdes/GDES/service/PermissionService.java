package com.gdes.GDES.service;

import com.gdes.GDES.model.Permission;
import com.gdes.GDES.model.PermissionPage;
import org.apache.ibatis.annotations.Param;

import java.util.LinkedList;
import java.util.List;

/**
 * @author xiyifen
 * @date 2018/6/8 10:19
 */
public interface PermissionService {
    /**
     * 获取所有权限
     *
     * @return
     */
    Permission selectPermission();

    /**
     * 根据条件获取权限列表
     *
     * @param permission
     * @return
     */
    PermissionPage selectPermissionPage(Permission permission);

    /**
     * 添加权限&菜单
     *
     * @param permission
     * @return
     */
    Integer add(Permission permission);

    /**
     * 根据条件获取权限列表
     *
     * @param permission
     * @return
     */
    PermissionPage selectMenuPage(Permission permission);

    /**
     * 获取未生成菜单的选项,排除'系统管理'和'系统资源'
     *
     * @return
     */
    List<Permission> selectNoSetMenus();

    /**
     * 获取所有父级菜单
     *
     * @return
     */
    List<Permission> selectAllPermissions();

    /**
     * 菜单的添加,修改
     *
     * @param permission
     * @return
     */
    Integer updatePermissionById(Permission permission);

    /**
     * 根据id获取权限数据
     *
     * @param permissionId
     * @return
     */
    Permission selectPermissionById(Integer permissionId);

    /**
     * 根据id修改菜单启用状态
     *
     * @param permission
     * @return
     */
    Integer updateFlagById(Permission permission);

    /**
     * 根据id删除权限
     *
     * @param permission
     * @return
     */
    Integer deletePermissionById(Permission permission);

    /**
     * 更新角色,删除授权并重新进行授权
     *
     *
     * @param permission
     * @return
     */
    Integer update(Permission permission);

    /**
     * 删除菜单
     * @param permission
     * @return
     */
    Integer deleteMenuById(Permission permission);
}




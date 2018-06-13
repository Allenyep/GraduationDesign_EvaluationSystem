package com.gdes.GDES.dao;

import com.gdes.GDES.model.Permission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author xiyifen
 * @date 2018/6/3 10:10
 */
public interface PermissionMapper {


    /**
     * 获取所有权限
     * @return
     */

    List<Permission> selectPermission();

    List<Permission> selectPermissionsByCondition(@Param("permission") Permission permission);

    /**
     * 根据条件获取权限总数
     * @param permission
     * @return
     */
    Integer selectPermissionsCountByCondition(@Param("permission") Permission permission);

    /**
     * 获取菜单列表
     * @param permission
     * @return
     */
    List<Permission> selectMenusByCondition(@Param("permission") Permission permission);


    Integer selectMenusCountByCondition(@Param("permisson") Permission permission);


    /**
     * 添加权限&菜单
     *
     * @param permission
     * @return
     */
    Integer add(@Param("permission") Permission permission);

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
     * 菜单添加(权限数据修改)
     *
     * @param permission
     * @return
     */
    Integer updatePermissionById(@Param("permission") Permission permission);

    /**
     * 获取最大排序
     *
     * @param permission
     * @return
     */
    Integer selectMaxZindexByParantid(@Param("permission") Permission permission);

    /**
     * 根据id获取权限数据
     *
     * @param permissionId
     * @return
     */
    Permission selectPermissionById(@Param("permissionId") Integer permissionId);

    /**
     * 根据id修改菜单启用状态
     *
     * @param permission
     * @return
     */
    Integer updateFlagById(@Param("permission") Permission permission);

    /**
     * 根据id删除权限
     *
     * @param permission
     * @return
     */
    Integer deletePermissionById(@Param("permission") Permission permission);

    /**
     * 更新角色,删除授权并重新进行授权
     *
     *
     * @param permission
     * @return
     */
    Integer update(@Param("permission") Permission permission);
    /**
     * 删除菜单
     *
     * @param permission
     * @return
     */
    Integer updateMenuById(@Param("permission") Permission permission);
}




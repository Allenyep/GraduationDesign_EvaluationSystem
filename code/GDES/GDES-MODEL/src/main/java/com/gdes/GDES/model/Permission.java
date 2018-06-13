package com.gdes.GDES.model;



import com.gdes.GDES.model.utils.PageBean;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import lombok.extern.log4j.Log4j;

import java.io.Serializable;
import java.util.List;


//@Data
//@Log4j
//@NoArgsConstructor
//@AllArgsConstructor
public class Permission extends PageBean implements Serializable {
    private static final long serialVersionUID = 1L;
    protected Integer id;
    /**
     * 权限ID
     */
    protected Integer permissionId;
    /**
     * 权限名
     */
    protected String name;
    /**
     * 权限生成的菜单名
     */
    protected String menuname;
    /**
     * 资源权限字符串
     */
    protected String permission;
    /**
     * 资源访问路径
     */
    protected String url;
    /**
     * 是否生成菜单,0:默认不生成菜单,1:生成菜单
     */
    protected Integer flag;
    /**
     * 菜单排序
     */
    protected Integer zindex;
    /**
     * 父级菜单id
     */
    protected Integer parantid;
    /**
     * 子菜单list
     */
    protected List childMenu;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getZindex() {
        return zindex;
    }

    public void setZindex(Integer zindex) {
        this.zindex = zindex;
    }

    public Integer getParantid() {
        return parantid;
    }

    public void setParantid(Integer parantid) {
        this.parantid = parantid;
    }

    public List getChildMenu() {
        return childMenu;
    }

    public void setChildMenu(List childMenu) {
        this.childMenu = childMenu;
    }
}

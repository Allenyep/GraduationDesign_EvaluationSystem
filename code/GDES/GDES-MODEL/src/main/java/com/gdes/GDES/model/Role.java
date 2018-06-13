package com.gdes.GDES.model;



import com.gdes.GDES.model.utils.PageBean;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import lombok.extern.log4j.Log4j;

import java.io.Serializable;


//@Data
//@Log4j
//@NoArgsConstructor
//@AllArgsConstructor
public class Role extends PageBean implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * ID
     */
    protected Integer id;
    /**
     * 角色ID
     */
    protected Integer roleId;
    /**
     * 角色名
     */
    protected String name;
    /**
     * 角色字符串
     */
    protected String sn;
    /**
     * 备注
     */
    protected String remark;
    /**
     * 角色拥有的权限
     */
    protected String permission;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", roleId=" + roleId +
                ", name='" + name + '\'' +
                ", sn='" + sn + '\'' +
                ", remark='" + remark + '\'' +
                ", permission='" + permission + '\'' +
                '}';
    }
}

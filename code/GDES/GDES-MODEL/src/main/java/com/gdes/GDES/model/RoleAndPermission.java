package com.gdes.GDES.model;


//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import lombok.extern.log4j.Log4j;


//@Data
//@Log4j
//@NoArgsConstructor
//@AllArgsConstructor
public class RoleAndPermission {
    /**
     * 角色ID
     */
    protected Integer roleId;
    /**
     * 权限ID
     */
    protected Integer permissionId;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    @Override
    public String toString() {
        return "RoleAndPermission{" +
                "roleId=" + roleId +
                ", permissionId=" + permissionId +
                '}';
    }
}

package com.gdes.GDES.service.impl;


import com.gdes.GDES.dao.RoleMapper;
import com.gdes.GDES.model.Role;
import com.gdes.GDES.model.RoleAndPermission;
import com.gdes.GDES.model.RolePage;
import com.gdes.GDES.model.User;
import com.gdes.GDES.model.utils.TokenUtil;
import com.gdes.GDES.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Service
@Transactional
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;

    /**
     * 获取角色列表
     *
     * @return
     */
    @Override
    public List<Role> selectRoles() {
        User user = TokenUtil.getUser();
        Role role= roleMapper.selectRoleByUserId(user.getUserId());
        List<Role> roles = roleMapper.selectRoles();
        if (role.getId()>=2){
            for (int i = 0; i < roles.size(); i++) {
                if (roles.get(i).getId()==1||roles.get(i).getId()==2){
                    roles.remove(i);
                    i--;
                }
            }
        }
        return roles;
    }

    /**
     * 获取角色列表(分页)
     *
     * @param role
     * @return
     */
    @Override
    public RolePage selectRolePage(Role role) {
        List<Role> data = roleMapper.selectRoleByCondition(role);
        for (Role role1 : data) {
            List<Role> roles = roleMapper.selectPermissionByRoleId(role1.getRoleId());
            String permission = "";
            for (Role role2 : roles) {
                if (role2 != null) {
                    permission += role2.getPermission() + " ";
                }
            }
            role1.setPermission(permission);
            //System.out.println(permission);
        }
        Integer count = roleMapper.selectRoleCountByCondition(role);
        RolePage rolePage = new RolePage();
        rolePage.setCount(count);
        rolePage.setData(data);
        return rolePage;
    }

    /**
     * 添加角色信息,并进行授权
     *
     * @param role
     * @return
     */
    @Override
    public Role add(Role role) {
        //添加角色,并返回主键
        int i = roleMapper.add(role);
        //进行授权
        if (role.getPermission() != null) {
            String[] permissions = role.getPermission().split(",");
            List<RoleAndPermission> roleAndPermissions = new ArrayList<RoleAndPermission>();
            for (int j = 0; j < permissions.length; j++) {
                RoleAndPermission roleAndPermission = new RoleAndPermission();
                Integer permission = Integer.parseInt(permissions[j]);
                roleAndPermission.setRoleId(role.getRoleId());
                roleAndPermission.setPermissionId(permission);
                roleAndPermissions.add(roleAndPermission);
            }
            int j = roleMapper.batchAddRoleAndPermission(roleAndPermissions);
        }
        return role;
    }

    /**
     * 根据ID修改角色信息
     *
     * @param roleId
     * @return
     */
    @Override
    public Role selectRoleById(Integer roleId) {
        Role role = roleMapper.selectRoleById(roleId);
        List<Role> roles = roleMapper.selectPermissionByRoleId(roleId);
        String permission = "";
        for (Role role2 : roles) {
            if (role2 != null) {
                permission += role2.getPermission() + " ";
            }
        }
        role.setPermission(permission);
        return role;
    }

    /**
     * 修改角色,删除授权并重新授权
     *
     * @param role
     * @return
     */
    @Override
    public Role update(Role role) {
        //修改角色
        int a= roleMapper.update(role);
        //删除角色授权
        int b= roleMapper.delectPermissionByRoleId(role.getRoleId());
        //进行授权
        if (role.getPermission() != null) {
            String[] permissions = role.getPermission().split(",");
            List<RoleAndPermission> roleAndPermissions = new ArrayList<RoleAndPermission>();
            for (int j = 0; j < permissions.length; j++) {
                RoleAndPermission roleAndPermission = new RoleAndPermission();
                Integer permission = Integer.parseInt(permissions[j]);
                roleAndPermission.setRoleId(role.getRoleId());
                roleAndPermission.setPermissionId(permission);
                roleAndPermissions.add(roleAndPermission);
            }
            int c= roleMapper.batchAddRoleAndPermission(roleAndPermissions);
        }
        return role;
    }
    /**
     * 删除角色,并删除授权
     * @param role
     * @return
     */
    @Override
    public Integer deleteRoleById(Role role) {
        int i= roleMapper.deleteRoleById(role.getRoleId());
        int j= roleMapper.delectPermissionByRoleId(role.getRoleId());
        if (i + j >= 2) {
            return 1;
        }else{
            return 0;
        }
    }
}

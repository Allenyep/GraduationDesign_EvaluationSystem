package com.gdes.GDES.service.impl;

import com.gdes.GDES.dao.RoleMapper;
import com.gdes.GDES.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements IRoleService {
    @Autowired
    private RoleMapper roleMapper;

    public List<String> getAllRolename() {
        return roleMapper.getAllRolename();
    }



    public List<String> getRoleSnByUserId(String idU) {
        return roleMapper.selectRolesByUserName(idU);
    }
}

package com.gdes.GDES.service.impl;



import com.gdes.GDES.dao.UserMapper;
import com.gdes.GDES.model.User;
import com.gdes.GDES.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Louie on 2017-03-22.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapperE;

    public User getUserByUserName(String idU) {
        return this.userMapperE.selectUserByUserName(idU);
    }

    public Set<String> getRolesByUserName(String idU) {
        return this.userMapperE.selectRolesByUserName(idU);
    }

    public Set<String> getPermissionByUserName(String idU) {
        return this.userMapperE.selectPermissionByUserName(idU);
    }

//    public User getUserInfoByUserId(String idU) {
//        return userMapperE.selectByPrimaryKey();
//    }

}

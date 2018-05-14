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
    private UserMapper userMapper;

    public User getUserByUserName(String idU) {
        return this.userMapper.selectUserByUserName(idU);
    }

    public Set<String> getRolesByUserName(String idU) {
        return this.userMapper.selectRolesByUserName(idU);
    }

    public Set<String> getPermissionByUserName(String idU) {
        return this.userMapper.selectPermissionByUserName(idU);
    }

    public User getUserInfoByUserId(String idU) {
        return null;
    }
//
//    public List<Human> queryAll() {
//        return this.userDao.selectAll();
//    }
//
//    public void addHuman(Human human) {
//        this.userDao.insertHuman(human);
//    }
//
//    public void updateHuman(Human human) {
//        this.userDao.updateHuman(human);
//    }
//
//    public void delHuman(int id) {
//        this.userDao.deleteHuman(id);
//    }
//
//    public Human queryById(int id) {
//        return this.userDao.queryById(id);
//    }
}

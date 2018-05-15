package com.gdes.GDES.service;


import com.gdes.GDES.model.User;

import java.util.Set;

/**
 * 业务
 * Created by Louie on 2017-03-22.
 */
public interface UserService {

    /**
     * 根据用户名查询用户
     * @param userName
     * @return
     */
    User getUserByUserName(String idU);

    /**
     * 根据用户名查询角色信息
     * @param userName
     * @return
     */
    Set<String> getRolesByUserName(String idU);

    /**
     * 根据用户名查询权限信息
     * @param userName
     * @return
     */
    Set<String> getPermissionByUserName(String idU);

//    User getUserInfoByUserId(String idU);
//
//    /**
//     * 查询所有human
//     * @return
//     */
//    List<Human> queryAll();
//
//    /**
//     * 新增human
//     * @param human
//     */
//    void addHuman(Human human);

    /**
     * 修改human
     * @param human
     */
//    void updateHuman(Human human);

    /**
     * 删除human
     * @param id
     */
//    void delHuman(int id);

    /**
     * 根据id查询Human
     * @param id
     * @return
     */
//    Human queryById(int id);
}

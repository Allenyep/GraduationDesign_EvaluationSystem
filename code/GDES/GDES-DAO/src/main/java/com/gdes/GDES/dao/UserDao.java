package com.gdes.GDES.dao;


import com.gdes.GDES.model.User;

import java.util.Set;

/**
 * Created by Louie on 2017-03-22.
 */
public interface UserDao {

    /**
     * 根据用户名查询用户
     * @param userName
     * @return
     */
//    User selectUserByUserName(String userName);
    User selectUserByUserName(String idU);

    /**
     * 根据用户名查询角色信息
     * @param userName
     * @return
     */
    Set<String> selectRolesByUserName(String idU);

    /**
     * 根据用户名查询权限信息
     * @param userName
     * @return
     */
    //todo
    Set<String> selectPermissionByUserName(String idU);


    User getUserInfoByUserId(String idU);

    /**
     * 查询所有human
     * @return
     */
//    List<Human> selectAll();
//
//    /**
//     * 新增human
//     * @param human
//     */
//    void insertHuman(Human human);
//
//    /**
//     * 修改human
//     * @param human
//     */
//    void updateHuman(Human human);
//
//    /**
//     * 删除human
//     * @param id
//     */
//    void deleteHuman(int id);
//
//    /**
//     * 根据id查询Human
//     * @param id
//     * @return
//     */
//    Human queryById(int id);
}

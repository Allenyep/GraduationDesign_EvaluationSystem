package com.gdes.GDES.service;


import com.gdes.GDES.model.Permission;
import com.gdes.GDES.model.User;
import com.gdes.GDES.model.UserPage;

import java.util.List;

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
//    User getUserByUserName(String idU);

    /**
     * 根据用户名查询角色信息
     * @param userName
     * @return
     */
//    Set<String> getRolesByUserName(String idU);

    /**
     * 根据用户名查询权限信息
     * @param userName
     * @return
     */
//    Set<String> getPermissionByUserName(String idU);



    /**
     * 登录逻辑
     * 1、先根据用户名查询用户对象
     * 2、如果有用户对象，则继续匹配密码
     * 如果没有用户对象，则抛出异常
     *
     * @param username
     * @param password
     * @return
     */
    User login(String username, String password);

    /**
     * 根据用户id查询权限列表
     *
     * @param userId
     * @return
     */
    List<Permission> selectPermissionsByUserId(Integer userId);

    /**
     * 根据用户id查询角色昵称
     *
     * @param userId
     * @return
     */
    List<String> selectRoleSnsByUserId(Integer userId);

    /**
     * 根据用户ID获取菜单列表
     *
     * @param userId
     * @return
     */
    List<List<Permission>> selectMenusByUserId(Integer userId);

    /**
     * 根据用户名加载用户对象（用于登录使用）
     * @param username
     * @return
     */
    User loadByUsername(String username);

    /**
     * 修改密码
     * @param user
     * @return
     */
    Integer updatePwd(User user);


    /**
     * 获取用户列表
     *
     * @return
     */
    UserPage selectUserPage(User user);

    Integer deleteUserById(User user);

    public User add(User user);

    /**
     * 修改用户当前状态
     *
     * @param user
     * @return
     */
    Integer updateStatusById(User user);

    /**
     * 提交用户修改数据
     *
     * @param user
     * @return
     */
    User update(User user);


    /**
     * 根据id获取用户信息
     *
     * @param userId
     * @return
     */
    User selectUserById(Integer userId);


    /**
     * 根据用户名加载用户对象（用于登录使用）
     * @param username
     * @return
     */

}

package com.gdes.GDES.dao;

import com.gdes.GDES.model.User;
import com.gdes.GDES.model.UserExample;
import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(String idU);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(String idU);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);



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
}
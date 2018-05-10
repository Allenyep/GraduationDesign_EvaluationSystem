package com.gdes.GDES.dao;

import com.gdes.GDES.model.Userrole;
import com.gdes.GDES.model.UserroleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserroleMapper {
    long countByExample(UserroleExample example);

    int deleteByExample(UserroleExample example);

    int insert(Userrole record);

    int insertSelective(Userrole record);

    List<Userrole> selectByExample(UserroleExample example);

    int updateByExampleSelective(@Param("record") Userrole record, @Param("example") UserroleExample example);

    int updateByExample(@Param("record") Userrole record, @Param("example") UserroleExample example);
}
package com.gdes.GDES.dao;

import com.allen.model.Userfeatures;
import com.allen.model.UserfeaturesExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserfeaturesMapper {
    long countByExample(UserfeaturesExample example);

    int deleteByExample(UserfeaturesExample example);

    int insert(Userfeatures record);

    int insertSelective(Userfeatures record);

    List<Userfeatures> selectByExample(UserfeaturesExample example);

    int updateByExampleSelective(@Param("record") Userfeatures record, @Param("example") UserfeaturesExample example);

    int updateByExample(@Param("record") Userfeatures record, @Param("example") UserfeaturesExample example);
}
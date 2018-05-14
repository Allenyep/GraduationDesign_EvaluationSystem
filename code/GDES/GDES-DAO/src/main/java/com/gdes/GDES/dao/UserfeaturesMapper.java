package com.gdes.GDES.dao;

import com.gdes.GDES.model.Userfeatures;
import com.gdes.GDES.model.UserfeaturesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserfeaturesMapper {
    long countByExample(UserfeaturesExample example);

    int deleteByExample(UserfeaturesExample example);

    int insert(Userfeatures record);

    int insertSelective(Userfeatures record);

    List<Userfeatures> selectByExample(UserfeaturesExample example);

    int updateByExampleSelective(@Param("record") Userfeatures record, @Param("example") UserfeaturesExample example);

    int updateByExample(@Param("record") Userfeatures record, @Param("example") UserfeaturesExample example);
}
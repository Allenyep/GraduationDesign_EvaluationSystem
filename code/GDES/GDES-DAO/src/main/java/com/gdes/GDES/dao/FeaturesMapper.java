package com.gdes.GDES.dao;

import com.gdes.GDES.model.Features;
import com.gdes.GDES.model.FeaturesExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FeaturesMapper {
    long countByExample(FeaturesExample example);

    int deleteByExample(FeaturesExample example);

    int deleteByPrimaryKey(Integer idF);

    int insert(Features record);

    int insertSelective(Features record);

    List<Features> selectByExample(FeaturesExample example);

    Features selectByPrimaryKey(Integer idF);

    int updateByExampleSelective(@Param("record") Features record, @Param("example") FeaturesExample example);

    int updateByExample(@Param("record") Features record, @Param("example") FeaturesExample example);

    int updateByPrimaryKeySelective(Features record);

    int updateByPrimaryKey(Features record);
}
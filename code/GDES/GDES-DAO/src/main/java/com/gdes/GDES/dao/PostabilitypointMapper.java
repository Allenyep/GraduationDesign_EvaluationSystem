package com.gdes.GDES.dao;

import com.allen.model.Postabilitypoint;
import com.allen.model.PostabilitypointExample;
import com.allen.model.PostabilitypointKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PostabilitypointMapper {
    long countByExample(PostabilitypointExample example);

    int deleteByExample(PostabilitypointExample example);

    int deleteByPrimaryKey(PostabilitypointKey key);

    int insert(Postabilitypoint record);

    int insertSelective(Postabilitypoint record);

    List<Postabilitypoint> selectByExample(PostabilitypointExample example);

    Postabilitypoint selectByPrimaryKey(PostabilitypointKey key);

    int updateByExampleSelective(@Param("record") Postabilitypoint record, @Param("example") PostabilitypointExample example);

    int updateByExample(@Param("record") Postabilitypoint record, @Param("example") PostabilitypointExample example);

    int updateByPrimaryKeySelective(Postabilitypoint record);

    int updateByPrimaryKey(Postabilitypoint record);
}
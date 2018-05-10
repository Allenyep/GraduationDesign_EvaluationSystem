package com.gdes.GDES.dao;

import com.gdes.GDES.model.Postabilitypoint;
import com.gdes.GDES.model.PostabilitypointExample;
import com.gdes.GDES.model.PostabilitypointKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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
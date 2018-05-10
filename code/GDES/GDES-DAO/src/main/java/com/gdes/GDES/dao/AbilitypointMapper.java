package com.gdes.GDES.dao;

import com.gdes.GDES.model.Abilitypoint;
import com.gdes.GDES.model.AbilitypointExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AbilitypointMapper {
    long countByExample(AbilitypointExample example);

    int deleteByExample(AbilitypointExample example);

    int deleteByPrimaryKey(Integer idAp);

    int insert(Abilitypoint record);

    int insertSelective(Abilitypoint record);

    List<Abilitypoint> selectByExample(AbilitypointExample example);

    Abilitypoint selectByPrimaryKey(Integer idAp);

    int updateByExampleSelective(@Param("record") Abilitypoint record, @Param("example") AbilitypointExample example);

    int updateByExample(@Param("record") Abilitypoint record, @Param("example") AbilitypointExample example);

    int updateByPrimaryKeySelective(Abilitypoint record);

    int updateByPrimaryKey(Abilitypoint record);
}
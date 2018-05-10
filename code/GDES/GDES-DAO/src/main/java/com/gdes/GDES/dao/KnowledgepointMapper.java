package com.gdes.GDES.dao;

import com.gdes.GDES.model.Knowledgepoint;
import com.gdes.GDES.model.KnowledgepointExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KnowledgepointMapper {
    long countByExample(KnowledgepointExample example);

    int deleteByExample(KnowledgepointExample example);

    int deleteByPrimaryKey(Integer idKp);

    int insert(Knowledgepoint record);

    int insertSelective(Knowledgepoint record);

    List<Knowledgepoint> selectByExample(KnowledgepointExample example);

    Knowledgepoint selectByPrimaryKey(Integer idKp);

    int updateByExampleSelective(@Param("record") Knowledgepoint record, @Param("example") KnowledgepointExample example);

    int updateByExample(@Param("record") Knowledgepoint record, @Param("example") KnowledgepointExample example);

    int updateByPrimaryKeySelective(Knowledgepoint record);

    int updateByPrimaryKey(Knowledgepoint record);
}
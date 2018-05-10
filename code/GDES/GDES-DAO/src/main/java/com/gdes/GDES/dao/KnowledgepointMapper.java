package com.gdes.GDES.dao;

import com.allen.model.Knowledgepoint;
import com.allen.model.KnowledgepointExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface KnowledgepointMapper {
    long countByExample(KnowledgepointExample example);

    int deleteByExample(KnowledgepointExample example);

    int deleteByPrimaryKey(Integer idKp);

    int insert(Knowledgepoint record);

    int insertSelective(Knowledgepoint record);

    List<Knowledgepoint> selectByExampleWithBLOBs(KnowledgepointExample example);

    List<Knowledgepoint> selectByExample(KnowledgepointExample example);

    Knowledgepoint selectByPrimaryKey(Integer idKp);

    int updateByExampleSelective(@Param("record") Knowledgepoint record, @Param("example") KnowledgepointExample example);

    int updateByExampleWithBLOBs(@Param("record") Knowledgepoint record, @Param("example") KnowledgepointExample example);

    int updateByExample(@Param("record") Knowledgepoint record, @Param("example") KnowledgepointExample example);

    int updateByPrimaryKeySelective(Knowledgepoint record);

    int updateByPrimaryKeyWithBLOBs(Knowledgepoint record);

    int updateByPrimaryKey(Knowledgepoint record);
}
package com.gdes.GDES.dao;

import com.gdes.GDES.model.Questionsoption;
import com.gdes.GDES.model.QuestionsoptionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface QuestionsoptionMapper {
    long countByExample(QuestionsoptionExample example);

    int deleteByExample(QuestionsoptionExample example);

    int deleteByPrimaryKey(Integer idO);

    int insert(Questionsoption record);

    int insertSelective(Questionsoption record);

    List<Questionsoption> selectByExample(QuestionsoptionExample example);

    Questionsoption selectByPrimaryKey(Integer idO);

    int updateByExampleSelective(@Param("record") Questionsoption record, @Param("example") QuestionsoptionExample example);

    int updateByExample(@Param("record") Questionsoption record, @Param("example") QuestionsoptionExample example);

    int updateByPrimaryKeySelective(Questionsoption record);

    int updateByPrimaryKey(Questionsoption record);
}
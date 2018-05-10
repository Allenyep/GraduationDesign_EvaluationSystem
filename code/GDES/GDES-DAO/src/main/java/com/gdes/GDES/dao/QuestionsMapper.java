package com.gdes.GDES.dao;

import com.gdes.GDES.model.Questions;
import com.gdes.GDES.model.QuestionsExample;
import com.gdes.GDES.model.QuestionsWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface QuestionsMapper {
    long countByExample(QuestionsExample example);

    int deleteByExample(QuestionsExample example);

    int deleteByPrimaryKey(String idQ);

    int insert(QuestionsWithBLOBs record);

    int insertSelective(QuestionsWithBLOBs record);

    List<QuestionsWithBLOBs> selectByExampleWithBLOBs(QuestionsExample example);

    List<Questions> selectByExample(QuestionsExample example);

    QuestionsWithBLOBs selectByPrimaryKey(String idQ);

    int updateByExampleSelective(@Param("record") QuestionsWithBLOBs record, @Param("example") QuestionsExample example);

    int updateByExampleWithBLOBs(@Param("record") QuestionsWithBLOBs record, @Param("example") QuestionsExample example);

    int updateByExample(@Param("record") Questions record, @Param("example") QuestionsExample example);

    int updateByPrimaryKeySelective(QuestionsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(QuestionsWithBLOBs record);

    int updateByPrimaryKey(Questions record);
}
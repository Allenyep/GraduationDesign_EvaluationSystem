package com.gdes.GDES.dao;

import com.gdes.GDES.model.*;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface QuestionspointMapper {
    long countByExample(QuestionspointExample example);

    int deleteByExample(QuestionspointExample example);

    int deleteByPrimaryKey(QuestionspointKey key);

    int insert(Questionspoint record);

    int insertSelective(Questionspoint record);

    List<Questionspoint> selectByExample(QuestionspointExample example);

    Questionspoint selectByPrimaryKey(QuestionspointKey key);

    int updateByExampleSelective(@Param("record") Questionspoint record, @Param("example") QuestionspointExample example);

    int updateByExample(@Param("record") Questionspoint record, @Param("example") QuestionspointExample example);

    int updateByPrimaryKeySelective(Questionspoint record);

    int updateByPrimaryKey(Questionspoint record);
}
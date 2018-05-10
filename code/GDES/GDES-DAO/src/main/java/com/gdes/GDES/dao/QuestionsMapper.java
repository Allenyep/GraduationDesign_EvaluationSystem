package com.gdes.GDES.dao;

import com.gdes.GDES.model.Questions;
import com.gdes.GDES.model.QuestionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionsMapper {
    long countByExample(QuestionsExample example);

    int deleteByExample(QuestionsExample example);

    int deleteByPrimaryKey(String idQ);

    int insert(Questions record);

    int insertSelective(Questions record);

    List<Questions> selectByExample(QuestionsExample example);

    Questions selectByPrimaryKey(String idQ);

    int updateByExampleSelective(@Param("record") Questions record, @Param("example") QuestionsExample example);

    int updateByExample(@Param("record") Questions record, @Param("example") QuestionsExample example);

    int updateByPrimaryKeySelective(Questions record);

    int updateByPrimaryKey(Questions record);
}
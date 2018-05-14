package com.gdes.GDES.dao;

import com.gdes.GDES.model.Questionstyle;
import com.gdes.GDES.model.QuestionstyleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionstyleMapper {
    long countByExample(QuestionstyleExample example);

    int deleteByExample(QuestionstyleExample example);

    int insert(Questionstyle record);

    int insertSelective(Questionstyle record);

    List<Questionstyle> selectByExample(QuestionstyleExample example);

    int updateByExampleSelective(@Param("record") Questionstyle record, @Param("example") QuestionstyleExample example);

    int updateByExample(@Param("record") Questionstyle record, @Param("example") QuestionstyleExample example);
}
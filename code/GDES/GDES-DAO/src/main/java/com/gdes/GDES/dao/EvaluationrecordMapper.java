package com.gdes.GDES.dao;

import com.gdes.GDES.model.Evaluationrecord;
import com.gdes.GDES.model.EvaluationrecordExample;
import com.gdes.GDES.model.EvaluationrecordKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EvaluationrecordMapper {
    long countByExample(EvaluationrecordExample example);

    int deleteByExample(EvaluationrecordExample example);

    int deleteByPrimaryKey(EvaluationrecordKey key);

    int insert(Evaluationrecord record);

    int insertSelective(Evaluationrecord record);

    List<Evaluationrecord> selectByExample(EvaluationrecordExample example);

    Evaluationrecord selectByPrimaryKey(EvaluationrecordKey key);

    int updateByExampleSelective(@Param("record") Evaluationrecord record, @Param("example") EvaluationrecordExample example);

    int updateByExample(@Param("record") Evaluationrecord record, @Param("example") EvaluationrecordExample example);

    int updateByPrimaryKeySelective(Evaluationrecord record);

    int updateByPrimaryKey(Evaluationrecord record);
}
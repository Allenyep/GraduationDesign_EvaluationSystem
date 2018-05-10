package com.gdes.GDES.dao;

import com.allen.model.Scoredetail;
import com.allen.model.ScoredetailExample;
import com.allen.model.ScoredetailKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ScoredetailMapper {
    long countByExample(ScoredetailExample example);

    int deleteByExample(ScoredetailExample example);

    int deleteByPrimaryKey(ScoredetailKey key);

    int insert(Scoredetail record);

    int insertSelective(Scoredetail record);

    List<Scoredetail> selectByExample(ScoredetailExample example);

    Scoredetail selectByPrimaryKey(ScoredetailKey key);

    int updateByExampleSelective(@Param("record") Scoredetail record, @Param("example") ScoredetailExample example);

    int updateByExample(@Param("record") Scoredetail record, @Param("example") ScoredetailExample example);

    int updateByPrimaryKeySelective(Scoredetail record);

    int updateByPrimaryKey(Scoredetail record);
}
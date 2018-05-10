package com.gdes.GDES.dao;

import com.gdes.GDES.model.Scoredetail;
import com.gdes.GDES.model.ScoredetailExample;
import com.gdes.GDES.model.ScoredetailKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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
package com.gdes.GDES.dao;

import com.allen.model.Majorb;
import com.allen.model.MajorbExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MajorbMapper {
    long countByExample(MajorbExample example);

    int deleteByExample(MajorbExample example);

    int deleteByPrimaryKey(Integer idMb);

    int insert(Majorb record);

    int insertSelective(Majorb record);

    List<Majorb> selectByExample(MajorbExample example);

    Majorb selectByPrimaryKey(Integer idMb);

    int updateByExampleSelective(@Param("record") Majorb record, @Param("example") MajorbExample example);

    int updateByExample(@Param("record") Majorb record, @Param("example") MajorbExample example);

    int updateByPrimaryKeySelective(Majorb record);

    int updateByPrimaryKey(Majorb record);
}
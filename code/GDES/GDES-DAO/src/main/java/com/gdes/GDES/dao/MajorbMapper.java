package com.gdes.GDES.dao;

import com.gdes.GDES.model.Majorb;
import com.gdes.GDES.model.MajorbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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
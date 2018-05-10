package com.gdes.GDES.dao;

import com.gdes.GDES.model.Studentpost;
import com.gdes.GDES.model.StudentpostExample;
import com.gdes.GDES.model.StudentpostKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentpostMapper {
    long countByExample(StudentpostExample example);

    int deleteByExample(StudentpostExample example);

    int deleteByPrimaryKey(StudentpostKey key);

    int insert(Studentpost record);

    int insertSelective(Studentpost record);

    List<Studentpost> selectByExample(StudentpostExample example);

    Studentpost selectByPrimaryKey(StudentpostKey key);

    int updateByExampleSelective(@Param("record") Studentpost record, @Param("example") StudentpostExample example);

    int updateByExample(@Param("record") Studentpost record, @Param("example") StudentpostExample example);

    int updateByPrimaryKeySelective(Studentpost record);

    int updateByPrimaryKey(Studentpost record);
}
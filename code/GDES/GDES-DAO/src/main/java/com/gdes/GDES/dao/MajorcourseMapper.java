package com.gdes.GDES.dao;

import com.gdes.GDES.model.MajorcourseExample;
import com.gdes.GDES.model.MajorcourseKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MajorcourseMapper {
    long countByExample(MajorcourseExample example);

    int deleteByExample(MajorcourseExample example);

    int deleteByPrimaryKey(MajorcourseKey key);

    int insert(MajorcourseKey record);

    int insertSelective(MajorcourseKey record);

    List<MajorcourseKey> selectByExample(MajorcourseExample example);

    int updateByExampleSelective(@Param("record") MajorcourseKey record, @Param("example") MajorcourseExample example);

    int updateByExample(@Param("record") MajorcourseKey record, @Param("example") MajorcourseExample example);
}
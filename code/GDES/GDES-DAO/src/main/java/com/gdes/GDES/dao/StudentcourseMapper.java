package com.gdes.GDES.dao;

import com.gdes.GDES.model.Studentcourse;
import com.gdes.GDES.model.StudentcourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentcourseMapper {
    long countByExample(StudentcourseExample example);

    int deleteByExample(StudentcourseExample example);

    int insert(Studentcourse record);

    int insertSelective(Studentcourse record);

    List<Studentcourse> selectByExample(StudentcourseExample example);

    int updateByExampleSelective(@Param("record") Studentcourse record, @Param("example") StudentcourseExample example);

    int updateByExample(@Param("record") Studentcourse record, @Param("example") StudentcourseExample example);
}
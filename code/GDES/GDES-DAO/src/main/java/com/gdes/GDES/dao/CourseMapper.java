package com.gdes.GDES.dao;

import com.gdes.GDES.model.Course;
import com.gdes.GDES.model.CourseExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CourseMapper {
    long countByExample(CourseExample example);

    int deleteByExample(CourseExample example);

    int deleteByPrimaryKey(String idC);

    int insert(Course record);

    int insertSelective(Course record);

    List<Course> selectByExample(CourseExample example);

    Course selectByPrimaryKey(String idC);

    int updateByExampleSelective(@Param("record") Course record, @Param("example") CourseExample example);

    int updateByExample(@Param("record") Course record, @Param("example") CourseExample example);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);



//    ===================
    List<Course> selectAll();

    //按课程分类查询
    List<Course> getCourseBYCourseType(String courseType);

    //按课程分类查询
    List<Course> findCourseByCourseType(@Param("courseType") String courseType);

    //模糊查询
    List<Course> findCourseBynameC(@Param("nameC") String nameC);


    int deleteByCourseCode(Integer courseCode);
}
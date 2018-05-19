package com.gdes.GDES.service;

import com.gdes.GDES.model.Course;

import java.util.List;

public interface ICourseService {

    public List<Course> selectAllCourse(String courseType);

    public int addCourse(Course course);

    //按课程分类查询
    public List<Course> getCourseBYCourseType(String courseType);

    public List<Course> findCourseBynameC(String namec);

    public void deleteByCourseCode(String key);

    public Course selectCourseByidC(String idC);


}

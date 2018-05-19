package com.gdes.GDES.service.impl;

import com.gdes.GDES.dao.CourseMapper;
import com.gdes.GDES.model.Course;
import com.gdes.GDES.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements ICourseService {

    @Autowired
    private CourseMapper courseMapper;

    public List<Course> selectAllCourse(String courseType) {
//        return courseMapper.selectAll();
        return courseMapper.findCourseByCourseType(courseType);
    }

    public int addCourse(Course course){
        int i = courseMapper.insertSelective(course);

        return i;

    }

    public List<Course> getCourseBYCourseType(String courseType) {
        return courseMapper.getCourseBYCourseType(courseType);
    }

    public List<Course> findCourseBynameC(String namec) {
        return courseMapper.findCourseBynameC(namec);
    }

    public void deleteByCourseCode(String key) {
//        int i = courseMapper.deleteByCourseCode(courseCode);
         courseMapper.deleteByPrimaryKey(key);

    }

    public Course selectCourseByidC(String idC) {
        return  courseMapper.selectByPrimaryKey(idC);
    }


}

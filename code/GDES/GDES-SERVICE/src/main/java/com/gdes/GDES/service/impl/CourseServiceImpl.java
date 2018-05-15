package com.gdes.GDES.service.impl;

import com.gdes.GDES.dao.CourseMapper;
import com.gdes.GDES.model.Course;
import com.gdes.GDES.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements ICourseService{

    @Autowired
    private CourseMapper courseMapper;

    public List<Course> selectAllCourse() {
        return courseMapper.selectAll();
    }
}

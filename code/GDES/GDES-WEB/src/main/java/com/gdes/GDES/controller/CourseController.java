package com.gdes.GDES.controller;

import com.gdes.GDES.model.Course;
import com.gdes.GDES.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private ICourseService courseService;

    @RequestMapping("/allCourse.do")
    public String getALLCourse(Model model){
        List<Course> courses = courseService.selectAllCourse();
        model.addAttribute("course",courses);
        return "courseadmin/course";
    }
}

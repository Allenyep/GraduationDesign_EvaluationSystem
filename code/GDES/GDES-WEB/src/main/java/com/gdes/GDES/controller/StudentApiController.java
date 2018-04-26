package com.gdes.GDES.controller;

import com.gdes.GDES.model.Student;
import com.gdes.GDES.model.utils.ResultVo;
import com.gdes.GDES.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by songl on 2017/8/10.
 */
@Controller
@RequestMapping("/studentApi/")
public class StudentApiController {
    @Resource
    private StudentService studentService;
    @RequestMapping("findAllStudentInfo")
    public @ResponseBody
    ResultVo findAllStudentInfo (@RequestParam("id") String id){
        System.out.println(id);
        Student student=new Student();
        //不做过多验证判断
        if ("0".equals(id)){student=null;}
        else {student.setId(new Integer(id));}
        return studentService.findAllStudent(student);
    }
}

package com.gdes.GDES.controller;

import com.gdes.GDES.model.Course;
import com.gdes.GDES.model.Msg;
import com.gdes.GDES.model.utils.UUid;
import com.gdes.GDES.service.ICourseService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private ICourseService courseService;

    @RequestMapping("/selectCourse.do")
    public String getALLCourse(String courseType,Model model){
        System.out.println("=================================");
        System.out.println(courseType);
//        List<Course> courses = courseService.selectAllCourse(courseType);
//        model.addAttribute("course",courses);
        return "courseadmin/course";
    }


    @RequestMapping("/selectCourseByidC.do")
    public String getCourseByidC(String idC,Model model){
        Course course = courseService.selectCourseByidC(idC);
        model.addAttribute("course",course);
        System.out.println("99999999999999999999999999999");
        return "courseadmin/course";
    }

    /**
     * 根据课程分类查询
     * @param courseType
     * @return
     */
    @RequestMapping(value = "/selectCourse1.do",method = RequestMethod.GET)
    @ResponseBody
    public Msg getCourse(@RequestParam(value = "pn", defaultValue = "1") Integer pn,
                         String courseType){

//        PageHelper.startPage(pn,5);
//        System.out.println("=================================");
//        System.out.println(courseType);
//        System.out.println(pn);
//        List<Course> courses = courseService.selectAllCourse(courseType);
//        PageInfo pageInfo=new PageInfo(courses,5);
//
////        model.addAttribute("course",courses);
//        return Msg.success().add("pageInfo",pageInfo);

        // 这不是一个分页查询
        // 引入PageHelper分页插件
        // 在查询之前只需要调用，传入页码，以及每页的大小

        PageHelper.startPage(pn, 5);
        // startPage后面紧跟的这个查询就是一个分页查询
        List<Course> emps = courseService.selectAllCourse(courseType);
        // 使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
        // 封装了详细的分页信息,包括有我们查询出来的数据，传入连续显示的页数
        PageInfo page = new PageInfo(emps, 5);
        System.out.println("=======================================");
        System.out.println(pn);
        return Msg.success().add("pageInfo", page);
    }

    /**
     * 根据课程名模糊查询
     * @param nameC
     * @return
     */

    @RequestMapping("/findCourseBynameC.do")
    @ResponseBody
    public Msg findCourseBynameC(@RequestParam(value = "pn", defaultValue = "1") Integer pn,
                                 String nameC){
        System.out.println("++++++++++++++++++++++");
        System.out.println(nameC);
        PageHelper.startPage(pn,5);
        List<Course> courses = courseService.findCourseBynameC(nameC);
        PageInfo pageInfo=new PageInfo(courses,5);

        return Msg.success().add("pageInfo",pageInfo);
    }
//    @RequestMapping("/findCourseBynameC.do")
//    @ResponseBody
//    public List<Course> findCourseBynameC(String nameC){
//        System.out.println("++++++++++++++++++++++");
//        System.out.println(nameC);
//
//        List<Course> courses = courseService.findCourseBynameC(nameC);
//        return courses;
//    }

    @RequestMapping("/deleteCourseByCourseCode.do")
    public String deleteByCourseCode(String idC) {
        System.out.println("9999999999999999999999999999999");
        System.out.println(idC);
        courseService.deleteByCourseCode(idC);

//        System.out.println("8989898989898");
//        System.out.println(i);
        return "courseadmin/course";

    }

    @RequestMapping("/addCourse.do")
    public String addCourse(Course course, Model model){
        System.out.println(course.getNameC());
        System.out.println(course.getCourseCode());
        course.setIdC(UUid.getUUID());
        int i = courseService.addCourse(course);
        if (i == 1) {
            model.addAttribute("msg","添加课程成功");
        }else {
            model.addAttribute("msg","添加课程失败");
        }
//        System.out.println(course.getNameC());
        return "redirect:selectCourse.do";
    }




    @RequestMapping("/selectCourseBycourseType.do?courseType={corseType}")
    public String selectCourseBYcourseType(String courseType,Model model) {
        List<Course> courseBYCourseType = courseService.getCourseBYCourseType(courseType);
        model.addAttribute("course",courseBYCourseType);
        return "courseadmin/course";

    }




    @RequestMapping(value="/deleteByidC.do",method=RequestMethod.GET)
    @ResponseBody
    public Msg deleteEmp(String idC){//@PathVariable("idC")
//        //批量删除
//        if(idC.contains("-")){
//            List<Integer> del_ids = new ArrayList<>();
//            String[] str_ids = idC.split("-");
//            //组装id的集合
//            for (String string : str_ids) {
//                del_ids.add(Integer.parseInt(string));
//            }
//            employeeService.deleteBatch(del_ids);
//        }else{
//            Integer id = Integer.parseInt(idC);
//            employeeService.deleteEmp(id);
            courseService.deleteByCourseCode(idC);
//        }
        return Msg.success();
    }
}

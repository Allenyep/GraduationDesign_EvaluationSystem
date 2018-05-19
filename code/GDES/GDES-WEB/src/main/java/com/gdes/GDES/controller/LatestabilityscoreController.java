package com.gdes.GDES.controller;

import com.gdes.GDES.model.*;
import com.gdes.GDES.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/las/")
public class LatestabilityscoreController {
    @Resource
    private LatestabilityscoreService latestabilityscoreService;

    @Resource
    private ScoredetailService scoredetailService;

    @Resource
    private StudentpostService studentpostService;

    @Resource
    private MajorService majorService;

    @Resource
    private StudentService studentService;

    /**
     * 按学生id查询能力得分
     * @param id_s
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("listbystudentid")
    public String listByStudentId(String id_s, Model model) throws Exception {
        List<Latestabilityscore> latestAbilityScores = latestabilityscoreService.queryByStudentId(id_s);
        model.addAttribute("scorebystudentid", latestAbilityScores);
        return "student/ability_score";
    }

    /**
     * 能力点得分比例
     * @param id_s
     * @param model
     * @return
     */
    @RequestMapping("scoreproportion")
    public String scoreProportion(String id_s, Model model) throws Exception {
        //饼图
        List<Latestabilityscore> latestAbilityScores = latestabilityscoreService.queryByStudentId(id_s);
        model.addAttribute("scorebystudentid", latestAbilityScores);
        //折线图
        List<Scoredetail> scoreDetailList = scoredetailService.queryByStudentId(id_s);
        model.addAttribute("detailline", scoreDetailList);
        //雷达图
        List<Studentpost> studentpostList = studentpostService.getListByStudentId(id_s);
        model.addAttribute("studentpost", studentpostList);
        return "student/charts";
    }

    /**
     * 教师功能
     */
    /**
     *
     * 按专业查询
     * @param id_m
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("allbymajorid")
    public String queryStudentListByMajorId(String id_m, Model model) throws Exception {
        Major major = majorService.queryByMajorId(id_m);
        model.addAttribute("major", major);
        List<Latestabilityscore> latestabilityscores = latestabilityscoreService.getListByMajorId(id_m);
        model.addAttribute("allbymajorid", latestabilityscores);

        System.out.println(999999999);

        return "teacher/studentabilityscore";
    }

    @RequestMapping("scorecharts")
    public String scoreCharts(String id_s, Model model) throws Exception {
        //某个学生能力饼图
        List<Latestabilityscore> latestAbilityScores = latestabilityscoreService.queryByStudentId(id_s);
        model.addAttribute("scorep", latestAbilityScores);
        //某个学生能力折线图
        List<Scoredetail> scoreDetailList = scoredetailService.queryByStudentId(id_s);
        model.addAttribute("scorel", scoreDetailList);
        //某个学生能力雷达图
        List<Studentpost> studentpostList = studentpostService.getListByStudentId(id_s);
        model.addAttribute("scorez", studentpostList);
        //某个学生能力学生个人信息
        Student student = studentService.queryStudentById(id_s);
        Major major = majorService.queryByMajorId(student.getIdM());
        student.setMajor(major);
        model.addAttribute("student", student);
        return "teacher/charts";
    }

}

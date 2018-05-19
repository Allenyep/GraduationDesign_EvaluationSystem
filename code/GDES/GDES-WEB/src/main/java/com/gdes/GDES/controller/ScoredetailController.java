package com.gdes.GDES.controller;

import com.gdes.GDES.model.Major;
import com.gdes.GDES.model.Scoredetail;
import com.gdes.GDES.model.Student;
import com.gdes.GDES.service.MajorService;
import com.gdes.GDES.service.ScoredetailService;
import com.gdes.GDES.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/scoredetail/")
public class ScoredetailController {

    @Resource
    private ScoredetailService scoredetailService;

    @Resource
    private StudentService studentService;

    @Resource
    private MajorService majorService;

    @RequestMapping("scoredetail")
    public String studentScoreDetail(String id_s, Integer id_ap, Model model) throws Exception {
        List<Scoredetail> scoredetailList = scoredetailService.queryByAbilityId(id_s, id_ap);
        model.addAttribute("detail", scoredetailList);
        return "student/score_detail";
    }

    @RequestMapping("tscoredetail")
    public String studentAPDetail(String id_s, Integer id_ap, Model model) throws Exception {
        List<Scoredetail> scoredetailList = scoredetailService.queryByAbilityId(id_s, id_ap);
        model.addAttribute("detail", scoredetailList);
        //某个学生能力学生个人信息
        Student student = studentService.queryStudentById(id_s);
        Major major = majorService.queryByMajorId(student.getIdM());
        student.setMajor(major);
        model.addAttribute("student", student);
        return "teacher/score_detail";
    }

    public String getIntArrayApId(String id_s, Model model) throws Exception{
        //int[] apidarray = scoredetailService.getApIdNotRepeat(id_s);
        //model.addAttribute("arrayapid", apidarray);
        return "";
    }
}

package com.gdes.GDES.controller;

import com.gdes.GDES.model.Evaluationrecord;
import com.gdes.GDES.model.Major;
import com.gdes.GDES.model.Teacher;
import com.gdes.GDES.service.EvaluationrecordService;
import com.gdes.GDES.service.MajorService;
import com.gdes.GDES.service.TeacherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/evaluationrecord/")
public class EvaluationrecordController {

    @Resource
    private EvaluationrecordService evaluationrecordService;

    @Resource
    private MajorService majorService;

    @Resource
    private TeacherService teacherService;

    @RequestMapping("listbymajorid")
    public String getListByMajorId(String id_t, Model model) throws Exception {
        try {
            Teacher teacher = teacherService.getTeacherById(id_t);
            Major major = majorService.queryByMajorId(teacher.getIdM());
            model.addAttribute("major", major);
            List<Evaluationrecord> evaluationrecordList = evaluationrecordService.getListInStudentIdList(teacher.getIdM());
            model.addAttribute("listbymajor", evaluationrecordList);
            if(evaluationrecordList.size()==0) {
                return "redirect:/loading/tprofile.do?idT="+id_t+"&flag=norecord";
            } else {
                return "teacher/evaluationrecord";
            }
        } catch (Exception e) {
            return "redirect:/loading/tprofile.do?idT="+id_t+"&flag=norecord";
        }
    }
}

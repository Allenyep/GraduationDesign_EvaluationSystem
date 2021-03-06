package com.gdes.GDES.controller;

import com.gdes.GDES.model.Major;
import com.gdes.GDES.model.Studentpost;
import com.gdes.GDES.service.MajorService;
import com.gdes.GDES.service.StudentService;
import com.gdes.GDES.service.StudentpostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/studentpost/")
public class StudentpostController {
    @Resource
    private StudentpostService studentpostService;

    @Resource
    private MajorService majorService;

    @RequestMapping("listbymajorid")
    public String getListByMajorId(String id_m, String id_t, Model model) throws Exception {
        try {
            List<Studentpost> studentpostList = studentpostService.getListByMajorId(id_m);
            model.addAttribute("postlist", studentpostList);
            Major major = majorService.queryByMajorId(id_m);
            model.addAttribute("major", major);
            if(studentpostList.size()==0) {
                return "redirect:/loading/tprofile.do?idT="+id_t+"&flag=tnopost";
            } else {
                return "teacher/studentpost";
            }
        } catch (Exception e) {
            return "redirect:/loading/tprofile.do?idT="+id_t+"&flag=tnopost";
        }

    }
}

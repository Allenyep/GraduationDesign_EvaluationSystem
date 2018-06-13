package com.gdes.GDES.controller;

import com.gdes.GDES.model.Teacher;
import com.gdes.GDES.model.User;
import com.gdes.GDES.model.utils.TokenUtil;
import com.gdes.GDES.service.TeacherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/loading/")
public class LoadingController {

    @Resource
    private TeacherService teacherService;

    /**
     * student
     */
    @RequestMapping("scoretable")
    public String loading4(Model model) throws Exception {
        User user = TokenUtil.getUser();
        String idS = user.getUsername();
        model.addAttribute("idS",idS);
        String scoretable = "scoretable";
        model.addAttribute("p", scoretable);
        return "student/loading";
    }

    @RequestMapping("scorecharts")
    public String loading5(Model model) throws Exception {
        User user= TokenUtil.getUser();
        model.addAttribute("idS",user.getUsername());
        String scoretable = "scorecharts";
        model.addAttribute("p", scoretable);
        return "student/loading";
    }

    @RequestMapping("sprofile")
    public String loading7(String idS, String flag, Model model) throws Exception {
        User user = TokenUtil.getUser();
        if(idS==null) {
            idS = user.getUsername();
        }
        model.addAttribute("idS",idS);
        model.addAttribute("flag", flag);
        String sprofile = "sprofile";
        model.addAttribute("p", sprofile);
        return "student/loading";
    }

    @RequestMapping("recordlist")
    public String loading8(Model model) {
        String recordlist = "recordlist";
        model.addAttribute("p", recordlist);
        return "student/loading";
    }

    @RequestMapping("examzhengshi")
    public String loading9(Model model) {
        String examzhengshi = "examzhengshi";
        model.addAttribute("p", examzhengshi);
        return "student/loading";
    }

    @RequestMapping("examlianxi")
    public String loading10(Model model) {
        String examlianxi = "examlianxi";
        model.addAttribute("p", examlianxi);
        return "student/loading";
    }

    /**
     * teacher
     */

    @RequestMapping("execut")
    public String loading6(String[] idEr,String[] idQ,String[] scoreHtp, String[] questionscore,
                           String idT, Model model) throws Exception {
        model.addAttribute("idEr", idEr[0]);
        model.addAttribute("idQ", idQ);
        model.addAttribute("scoreHtp", scoreHtp);
        model.addAttribute("questionscore", questionscore);
        model.addAttribute("idT", idT);
        String execut = "execut";
        model.addAttribute("p", execut);
        return "teacher/loading";
    }

    @RequestMapping("tabilityscore")
    public String loading1(Model model) throws Exception {
        User user = TokenUtil.getUser();
        String idT = user.getUsername();
        model.addAttribute("idT",idT);
        Teacher teacher = teacherService.getTeacherById(idT);
        String idM = teacher.getIdM();
        model.addAttribute("idM",idM);
        String abilityscore = "abilityscore";
        model.addAttribute("p", abilityscore);
        return "teacher/loading";
    }

    @RequestMapping("record")
    public String loading2(Model model) throws Exception {
        User user = TokenUtil.getUser();
        model.addAttribute("idT",user.getUsername());
        String record = "record";
        model.addAttribute("p", record);
        return "teacher/loading";
    }

    @RequestMapping("stupost")
    public String loading3(Model model) throws Exception {
        User user=TokenUtil.getUser();
        String idT = user.getUsername();
        model.addAttribute("idT", idT);
        Teacher teacher = teacherService.getTeacherById(idT);
        String idM = teacher.getIdM();
        model.addAttribute("idM",idM);
        String stupost = "stupost";
        model.addAttribute("p", stupost);
        return "teacher/loading";
    }

    @RequestMapping("tprofile")
    public String loading8(String flag, Model model) throws Exception {
        User user = TokenUtil.getUser();
        String idT = user.getUsername();
        model.addAttribute("idT",idT);
        model.addAttribute("flag", flag);
        String tprofile = "tprofile";
        model.addAttribute("p", tprofile);
        return "teacher/loading";
    }
}

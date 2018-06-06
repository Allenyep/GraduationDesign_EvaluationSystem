package com.gdes.GDES.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/loading/")
public class LoadingController {

    /**
     * student
     */
    @RequestMapping("scoretable")
    public String loading4(String idS, Model model) throws Exception {
        model.addAttribute("idS",idS);
        String scoretable = "scoretable";
        model.addAttribute("p", scoretable);
        return "student/loading";
    }

    @RequestMapping("scorecharts")
    public String loading5(String idS, Model model) throws Exception {
        model.addAttribute("idS",idS);
        String scoretable = "scorecharts";
        model.addAttribute("p", scoretable);
        return "student/loading";
    }

    @RequestMapping("sprofile")
    public String loading7(String idS, String flag, Model model) throws Exception {
        model.addAttribute("idS",idS);
        model.addAttribute("flag", flag);
        String sprofile = "sprofile";
        model.addAttribute("p", sprofile);
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
    public String loading1(String idM, String idT, Model model) throws Exception {
        model.addAttribute("idT", idT);
        model.addAttribute("idM",idM);
        String abilityscore = "abilityscore";
        model.addAttribute("p", abilityscore);
        return "teacher/loading";
    }

    @RequestMapping("record")
    public String loading2(String idT, Model model) throws Exception {
        model.addAttribute("idT",idT);
        String record = "record";
        model.addAttribute("p", record);
        return "teacher/loading";
    }

    @RequestMapping("stupost")
    public String loading3(String idM, String idT, Model model) throws Exception {
        model.addAttribute("idT", idT);
        model.addAttribute("idM",idM);
        String stupost = "stupost";
        model.addAttribute("p", stupost);
        return "teacher/loading";
    }

    @RequestMapping("tprofile")
    public String loading8(String idT, String flag, Model model) throws Exception {
        model.addAttribute("idT",idT);
        model.addAttribute("flag", flag);
        String tprofile = "tprofile";
        model.addAttribute("p", tprofile);
        return "teacher/loading";
    }
}

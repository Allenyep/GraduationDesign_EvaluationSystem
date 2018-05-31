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
    @RequestMapping("execut")
    public String loading6(Model model) throws Exception {
        String execut = "execut";
        model.addAttribute("p", execut);
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
    @RequestMapping("tabilityscore")
    public String loading1(String idM, Model model) throws Exception {
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
    public String loading3(String idM, Model model) throws Exception {
        model.addAttribute("idM",idM);
        String stupost = "stupost";
        model.addAttribute("p", stupost);
        return "teacher/loading";
    }
}

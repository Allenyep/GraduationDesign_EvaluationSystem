package com.gdes.GDES.controller;

import com.gdes.GDES.model.Latestabilityscore;
import com.gdes.GDES.model.Scoredetail;
import com.gdes.GDES.model.Studentpost;
import com.gdes.GDES.service.LatestabilityscoreService;
import com.gdes.GDES.service.ScoredetailService;
import com.gdes.GDES.service.StudentpostService;
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
}

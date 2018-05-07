package com.gdes.GDES.controller;

import com.gdes.GDES.model.LatestAbilityScore;
import com.gdes.GDES.service.LatestAbilityScoreService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * 控制器
 */
@Controller
@RequestMapping("/latestabilityscore/")
public class LatestAbilityScoreController {
    @Resource
    private LatestAbilityScoreService latestAbilityScoreService;

    @RequestMapping("listbystudentid")
    public String listByStudentId(String id_s, Model model) {
        List<LatestAbilityScore> latestAbilityScores = latestAbilityScoreService.getAbilityScoreListById(id_s);
        //向model中保存数据
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
    public String scoreProportion(String id_s, Model model) {
        List<LatestAbilityScore> latestAbilityScores = latestAbilityScoreService.getAbilityScoreListById(id_s);
        //向model中保存数据
        model.addAttribute("scorebystudentid", latestAbilityScores);
        return "student/charts";
    }
}

package com.gdes.GDES.controller;

import com.gdes.GDES.model.LatestAbilityScore;
import com.gdes.GDES.model.ScoreDetail;
import com.gdes.GDES.service.ScoreDetailService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/scoredetail/")
public class ScoreDetailController {

    @Resource
    private ScoreDetailService scoreDetailService;

    @RequestMapping("scoredetail")
    public String studentScoreDetail(LatestAbilityScore latestAbilityScore, Model model) {
        List<ScoreDetail> scoreDetailList = scoreDetailService.getScoreDetailListByAbilityId(latestAbilityScore);
        model.addAttribute("detail", scoreDetailList);
        return "student/score_detail";
    }
}

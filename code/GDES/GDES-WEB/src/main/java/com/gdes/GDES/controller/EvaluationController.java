package com.gdes.GDES.controller;

import com.gdes.GDES.model.*;
import com.gdes.GDES.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/evaluation/")
public class EvaluationController {

    @Resource
    private EvaluationService evaluationService;

    @Resource
    private EvaluationrecordService evaluationrecordService;

    /*@RequestMapping("executing")
    public String executing(String[] idQ, String[] answerscore, String[] questionscore ,String erid, String teacherid) throws Exception {
        evaluationService.pExecuting(idQ, answerscore, questionscore, erid, teacherid);
        List<Evaluationrecord> evaluationrecord = evaluationrecordService.getListByErId(erid);
        String studentid = evaluationrecord.get(0).getIdS();
        return "redirect:/las/scoreproportion.do?id_s="+studentid;
    }*/

}

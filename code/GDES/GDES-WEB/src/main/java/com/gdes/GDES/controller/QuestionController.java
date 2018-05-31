package com.gdes.GDES.controller;

import com.gdes.GDES.model.*;
import com.gdes.GDES.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/question/")
public class QuestionController {

    @Resource
    private KnowledgepointService kps;

    @Resource
    private QuestionsService qs;

    @Resource
    private QuestionspointService qps;

    @Resource
    private QuestionsoptionService qos;

    @Resource
    private HistorytestpaperService htps;

    /**
     * 学生查看试题详情
     * @param idQ
     * @param idEr
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("shitidetail")
    public String shitidetail(String idQ, String idEr, Model model)throws Exception{
        Questions q=qs.queryByPrimary(idQ);
        model.addAttribute("que",q);
        //是否是选择题，读取选择题选项
        if(q.getStyleQ().equals("1")){
            List<Questionsoption> questionsoptions=qos.queryByidQ(q.getIdQ());
            model.addAttribute("oplist",questionsoptions);
        }
        List<Historytestpaper> historytestpapers = htps.queryQuestionByIdQandIdEr(idQ, idEr);
        model.addAttribute("mhtps", historytestpapers);
        return "student/shitiform";
    }

    @RequestMapping("teachershitidetail")
    public String tshitidetail(String idQ, String idEr, Model model)throws Exception{
        Questions q=qs.queryByPrimary(idQ);
        model.addAttribute("que",q);
        //是否是选择题，读取选择题选项
        if(q.getStyleQ().equals("1")){
            List<Questionsoption> questionsoptions=qos.queryByidQ(q.getIdQ());
            model.addAttribute("oplist",questionsoptions);
        }
        List<Historytestpaper> historytestpapers = htps.queryQuestionByIdQandIdEr(idQ, idEr);
        model.addAttribute("mhtps", historytestpapers);

        List<Questionspoint> qs= qps.queryByQuestionId(idQ);
        List<Knowledgepoint> Allkplist=kps.queryAllKnowledgepoint();
        List<Knowledgepoint> reslist=new ArrayList<>();
        for(Questionspoint qp:qs){
            for(Knowledgepoint kp:Allkplist){
                if(qp.getIdKp().equals(kp.getIdKp())){
                    reslist.add(kp);
                }
            }
        }
        model.addAttribute("kplist",reslist);
        model.addAttribute("Allkplist",Allkplist);

        return "teacher/viewshiti";
    }
}

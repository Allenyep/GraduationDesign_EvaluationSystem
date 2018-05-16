package com.gdes.GDES.controller;

import com.gdes.GDES.model.Knowledgepoint;
import com.gdes.GDES.model.Questions;
import com.gdes.GDES.model.Questionsoption;
import com.gdes.GDES.model.Questionspoint;
import com.gdes.GDES.service.KnowledgepointService;
import com.gdes.GDES.service.QuestionsService;
import com.gdes.GDES.service.QuestionspointService;
import com.gdes.GDES.service.TeacherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 教师页面
 * Created by Allen on 2018/5/11.
 */
@Controller
@RequestMapping("/teacher/")
public class TeacherController {
    //知识点
    @Resource
    private KnowledgepointService kps;

    @Resource
    private QuestionsService qs;

    @Resource
    private QuestionspointService qps;

    //TODO:试题选项服务层


    /*==================*/
    /*知识点控制*/
    //通过教师课程加载初始页面
    @RequestMapping("knowledgepoint")
    public String init(String message, Model model) throws Exception {
        List<Knowledgepoint> list=kps.queryAllKnowledgepoint();
        model.addAttribute("konwlist",list);
        for(Knowledgepoint kp:list){
            System.out.println(kp.getNameKp());
        }

        model.addAttribute("message",message);
        return "teacher/knowledgepoint";
    }

    //添加知识点
    @RequestMapping("addkonwpoint")
    public String addkonwpoint(String nameKp,String proportionKp,
                               String idC,Model model)throws Exception{
        Knowledgepoint kp=new Knowledgepoint();
        kp.setProportionKp(proportionKp);
        kp.setNameKp(nameKp);
        //TODO:能力点配置
        kp.setIdAp(1);
        kp.setIdC(idC);

        String str=kps.addKonwledgepoint(kp);

        model.addAttribute("message",str);

//        return "teacher/knowledgepoint";
        return "redirect:knowledgepoint.do";
    }

    //删除
    @RequestMapping("delKonwledgepoint")
    public String delKonwledgepoint(String idKp,Model model)throws Exception{
        int idKpInt=Integer.valueOf(idKp);
        Knowledgepoint kp=new Knowledgepoint();
        kp.setIdKp(idKpInt);
        String str=kps.deleteKonwledgepoint(kp);

        model.addAttribute("message",str);

        return "redirect:knowledgepoint.do";
    }

    //修改知识点
    @RequestMapping("updateKnowledgepoint")
    public String updateKnowledgepoint(String idKp,String nameKp,
                                       String proportionKp,Model model)throws Exception{
        Knowledgepoint kp=new Knowledgepoint();
        kp.setIdKp(Integer.valueOf(idKp));
        kp.setNameKp(nameKp);
        kp.setProportionKp(proportionKp);

        System.out.println(nameKp);

        String str=kps.updateKonwledgepoint(kp);
        model.addAttribute("message",str);

        return "redirect:knowledgepoint.do";
    }

    /*============*/
    /*试题控制*/
    //试题列表
    @RequestMapping("shitilist")
    public String knowpoint(String message, Model model)throws Exception{
        List<Questions> list=qs.queryAllQusetion();
        model.addAttribute("qlist",list);
        model.addAttribute("message",message);
        return "teacher/chuti";
    }


    //试题详情页，加载试题对应知识点
    @RequestMapping("shitidetail")
    public String shitidetail(String idQ,Model model)throws Exception{
        Questions q=qs.queryByPrimary(idQ);
        model.addAttribute("que",q);
        //TODO:是否是选择题，读取选择题选项
        if(q.getStyleQ().equals("1")){
            List<Questionsoption> questionsoptions;
        }

        List<Questionspoint> qs= qps.queryByQuestionId(idQ);
        List<Knowledgepoint> Allkplist=kps.queryAllKnowledgepoint();
        List<Knowledgepoint> reslist=new ArrayList<>();
        for(Questionspoint qp:qs){
            for(Knowledgepoint kp:Allkplist){
                if(qp.getIdKp()==kp.getIdKp()){
                    reslist.add(kp);
                }
            }
        }
        model.addAttribute("kplist",reslist);
        model.addAttribute("Allkplist",Allkplist);

        return "teacher/shitiform";
    }

    //更新试题页面,试题内容，试题答案，试题知识点
    //TODO：选择题
    @RequestMapping("updateshiti")
    public String updateshiti(){
        return null;
    }
}

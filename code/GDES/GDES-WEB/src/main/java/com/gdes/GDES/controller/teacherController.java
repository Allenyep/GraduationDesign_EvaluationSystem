package com.gdes.GDES.controller;

import com.gdes.GDES.model.Knowledgepoint;
import com.gdes.GDES.service.KnowledgepointService;
import com.gdes.GDES.service.TeacherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * 教师页面
 * Created by Allen on 2018/5/11.
 */
@Controller
@RequestMapping("/teacher/")
public class teacherController {
    //知识点
    @Resource
    private KnowledgepointService kps;



    //通过教师课程加载初始页面
    @RequestMapping("knowledgepoint")
    public String init(String id_s, Model model) throws Exception {
        List<Knowledgepoint> list=kps.queryAllKnowledgepoint();
        model.addAttribute("konwlist",list);
        for(Knowledgepoint kp:list){
            System.out.println(kp.getNameKp());
        }

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

    @RequestMapping("delKonwledgepoint")
    public String delKonwledgepoint(String idKp,Model model)throws Exception{
        int idKpInt=Integer.valueOf(idKp);
        Knowledgepoint kp=new Knowledgepoint();
        kp.setIdKp(idKpInt);
        String str=kps.deleteKonwledgepoint(kp);

        model.addAttribute("message",str);

//        return "teacher/knowledgepoint";
        return "redirect:knowledgepoint.do";
    }

}

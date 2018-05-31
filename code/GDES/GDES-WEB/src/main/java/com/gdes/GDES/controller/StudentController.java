package com.gdes.GDES.controller;

import com.gdes.GDES.model.Historytestpaper;
import com.gdes.GDES.model.Questions;
import com.gdes.GDES.model.utils.Exam;
import com.gdes.GDES.service.HistorytestpaperService;
import com.gdes.GDES.service.QuestionsService;
import com.gdes.GDES.service.QuestionsoptionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 学生控制器
 * Created by Allen on 2018/5/19.
 */
@Controller
@RequestMapping("/student/")
public class StudentController {
    @Resource
    private HistorytestpaperService htps;

    @Resource
    private QuestionsService qs;

    @Resource
    private QuestionsoptionService qos;

    //学生发送做题请求
    //练习测评,从题库中选取未做过的试题进行计算，时间不写入
    //TODO:考虑选择知识点进行测评
    @RequestMapping(value = "examlianxi")
    private String  examlianxi(String idS, Model model)throws Exception{
        //练习测评出题算法
        List<Questions> qlist=qs.queryAllQusetion();
        List<Questions> res;
        List<Historytestpaper> htplist=htps.queryByStudentid(idS);

        res=Exam.Examlianxi(qlist,htplist);

        for(Questions q:res){
            if(q.getStyleQ().equals("1")){
                q.setQuestionsO(qos.queryByidQ(q.getIdQ()));
            }
        }

        model.addAttribute("examlist",res);


        return "/student/addtest";
    }

    //正式测评，从题库中随机选取试题进行计算，计入时间
    //随机:获取题目长度，然后抽取10道试题
    @RequestMapping("examzhengshi")
    private String examzhengshi(String idS,Model model)throws Exception{
        List<Questions> qlist=qs.queryAllQusetion();
        List<Questions> res=Exam.Examzhengshi(qlist,10);
        model.addAttribute("examlist",res);

        return "/student/addtestzs";
    }

    //接收测评题目列表
    //先生成测评记录->添加历史试卷表
    //接收题目编号，学生答案，学生id，教师id
    @RequestMapping("submitexam")
    private String submitexam(String[] idQ,String[] answerHtp,String idS,
                              String idT)throws Exception{
        return null;
    }
}

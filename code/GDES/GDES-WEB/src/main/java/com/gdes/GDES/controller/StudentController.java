package com.gdes.GDES.controller;

import com.gdes.GDES.model.*;
import com.gdes.GDES.model.utils.TokenUtil;
import com.gdes.GDES.service.*;
import com.gdes.GDES.model.Historytestpaper;
import com.gdes.GDES.model.Questions;
import com.gdes.GDES.model.utils.Exam;
import com.gdes.GDES.service.HistorytestpaperService;
import com.gdes.GDES.service.QuestionsService;
import com.gdes.GDES.service.QuestionsoptionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
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
    private StudentService studentService;

    @Resource
    private TeacherService teacherService;

    @Resource
    private UserService userService;

    @Resource
    private EvaluationrecordService evaluationrecordService;

    @Resource
    private LatestabilityscoreService latestabilityscoreService;

    @Resource
    private QuestionsoptionService qos;

    //学生发送做题请求
    //练习测评,从题库中选取未做过的试题进行计算，时间不写入
    //TODO:考虑选择知识点进行测评
    @RequestMapping(value = "examlianxi")
    private String  examlianxi(Model model)throws Exception{
        User user = TokenUtil.getUser();
        String idS=user.getUsername();
        //练习测评出题算法
        List<Questions> qlist=qs.queryAllQusetion();
        List<Questions> res;
        List<Questions> lianxilist=new ArrayList<>();
        List<Historytestpaper> htplist=htps.queryByStudentid(idS);

        res=Exam.Examlianxi(qlist,htplist);

        //练习测评只出5道题
        for(int i=0;i<5;i++){
            lianxilist.add(res.get(i));
        }

        for(Questions q:lianxilist){
            if(q.getStyleQ().equals("1")){
                q.setQuestionsO(qos.queryByidQ(q.getIdQ()));
            }
        }

        model.addAttribute("examlist",lianxilist);
        model.addAttribute("idS",idS);

        //学生所属教师
        Student student = studentService.queryStudentById(idS);
        List<Teacher> teacher = teacherService.getTeacherByMajorId(student.getIdM());
        model.addAttribute("tea", teacher);

        return "/student/addtest";

    }

    //正式测评，从题库中随机选取试题进行计算，计入时间
    //随机:获取题目长度，然后抽取10道试题
    @RequestMapping("examzhengshi")
    private String examzhengshi(Model model)throws Exception{
        //试题
        List<Questions> qlist=qs.queryAllQusetion();
        List<Questions> res=Exam.Examzhengshi(qlist,10);
        model.addAttribute("examlist",res);
        //学生
        User user = TokenUtil.getUser();
        String idS = user.getUsername();
        model.addAttribute("stu", idS);
        //学生所属教师
        Student student = studentService.queryStudentById(idS);
        List<Teacher> teacher = teacherService.getTeacherByMajorId(student.getIdM());
        model.addAttribute("tea", teacher);

        return "/student/addtestzs";
    }

    //进入试题测评概况页
    //根据学生id和ender不为空查
    //查询数据库试题完成情况
    @RequestMapping("recordlist")
    private String recordlist(Model model)throws Exception{
        User user=TokenUtil.getUser();
        String idS=user.getUsername();
        List<Evaluationrecord> erlist= evaluationrecordService.queryEvaluationrecordByIdSandEndEr(idS);
        List<Historytestpaper> htplist=htps.queryByStudentid(idS);
        //注入Question属性
        for(Historytestpaper htp:htplist){
            String idQ=htp.getIdQ();
            htp.setQuestions(qs.queryByPrimary(idQ));
        }
        int studenttestNum=htplist.size();
        List<Integer> scoreSumstudent=new ArrayList<>();
        List<Integer> scoreSum=new ArrayList<>();
        for(Evaluationrecord er:erlist){
            int temp1=0,temp2=0;
            for(Historytestpaper htp:htplist){
                if(er.getIdEr().equals(htp.getIdEr())){
                    temp1+=Integer.valueOf(htp.getScoreHtp()==null?"0":htp.getScoreHtp());
                    temp2+=Integer.valueOf(htp.getQuestions().getScoreQ()==null?"0":htp.getQuestions().getScoreQ());
                }
            }
            scoreSumstudent.add(temp1);
            scoreSum.add(temp2);
        }

        //TODO:统计计算试卷得分 课程,占比问题
        int questionNum=qs.queryQuestionByCourse("2").size();

        model.addAttribute("scoreSumstudent",scoreSumstudent);
        model.addAttribute("scoreSum",scoreSum);
        model.addAttribute("stutestNum",studenttestNum);
        model.addAttribute("questionNum",questionNum);
        model.addAttribute("erlist",erlist);


        return "/student/historytest";
    }

    /**
     * 学生首页界面
     */
    @RequestMapping("profile")
    public String profile(String idS, String flag, Model model) throws Exception {
        model.addAttribute("flag", flag);
        Student student = studentService.queryStudentById(idS);
        model.addAttribute("student", student);
//        User user = userService.getUserByUserName(idS);
//        model.addAttribute("user", user);
        List<Evaluationrecord> evaluationrecords = evaluationrecordService.evaluateList(idS);
        model.addAttribute("evaluatetimes", evaluationrecords); //测评记录
        List<Evaluationrecord> practise = evaluationrecordService.practiseList(idS);
        model.addAttribute("practisetimes", practise); //练习记录
        List<Integer> apcount = latestabilityscoreService.getAbilityPointIdList(idS);
        model.addAttribute("apcount", apcount);
        return "student/profile";
    }

}

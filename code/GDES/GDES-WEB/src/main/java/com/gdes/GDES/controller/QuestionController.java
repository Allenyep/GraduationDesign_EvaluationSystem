package com.gdes.GDES.controller;

import com.gdes.GDES.model.utils.TokenUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.gdes.GDES.model.*;
import com.gdes.GDES.service.*;
import com.gdes.GDES.model.Evaluationrecord;
import com.gdes.GDES.model.Historytestpaper;
import com.gdes.GDES.model.Questions;
import com.gdes.GDES.model.Student;
import com.gdes.GDES.service.EvaluationrecordService;
import com.gdes.GDES.service.HistorytestpaperService;
import com.gdes.GDES.service.QuestionsService;
import com.gdes.GDES.service.StudentService;
import org.springframework.ui.Model;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


/**
 * 试题提交
 * Created by Allen on 2018/5/14.
 */
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
    private StudentService ss;

    @Resource
    private EvaluationrecordService ers;

    @Resource
    private HistorytestpaperService htps;

    @Resource
    private EvaluationService evaluationService;

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
    public String tshitidetail(String idQ, String idEr, Model model)throws Exception {
        Questions q = qs.queryByPrimary(idQ);
        model.addAttribute("que", q);
        //是否是选择题，读取选择题选项
        if (q.getStyleQ().equals("1")) {
            List<Questionsoption> questionsoptions = qos.queryByidQ(q.getIdQ());
            model.addAttribute("oplist", questionsoptions);
        }
        List<Historytestpaper> historytestpapers = htps.queryQuestionByIdQandIdEr(idQ, idEr);
        model.addAttribute("mhtps", historytestpapers);

        List<Questionspoint> qs = qps.queryByQuestionId(idQ);
        List<Knowledgepoint> Allkplist = kps.queryAllKnowledgepoint();
        List<Knowledgepoint> reslist = new ArrayList<>();
        for (Questionspoint qp : qs) {
            for (Knowledgepoint kp : Allkplist) {
                if (qp.getIdKp().equals(kp.getIdKp())) {
                    reslist.add(kp);
                }
            }
        }
        model.addAttribute("kplist", reslist);
        model.addAttribute("Allkplist", Allkplist);

        return "teacher/viewshiti";
    }

    //接收测评题目列表
    //先生成测评记录->添加历史试卷表
    //接收题目编号，学生答案，学生id，教师id
    @RequestMapping("examlianxiupload")
    public String examlianxiupload(String[] idQ, String[] answerHtp,
                                   String[] idO,String[] istrueO,
                                   String idS,String idT,
                                   Model model)throws Exception{
        String idEr= ers.addEvaluationrecord(idS,idT);
        for(String an:answerHtp)
            System.out.println(an);

        for(int i=0;i<idQ.length;i++){
            Historytestpaper htp=new Historytestpaper();
            htp.setIdEr(idEr);
            htp.setIdT(idT);
            htp.setIdS(idS);
            htp.setIdQ(idQ[i]);
            htp.setAnswerHtp(answerHtp[i]);

            htps.addHistorytestpaper(htp);
        }
        model.addAttribute("idS",idS);
        //TODO:提交完成返回首页
        return "redirect:/student/profile.do";
    }

    //根据教师id查询待批改试题
    //待批改试题列表，结束时间为空
    @RequestMapping("pigailist")
    public String pigailist(Model model)throws Exception{
        User user= TokenUtil.getUser();
        List<Evaluationrecord> erlist= ers.queryByendErIsNull(user.getUsername());
        System.out.println("登录名"+user.getUsername());
        for(Evaluationrecord er:erlist){
            Student s=ss.queryStudentById(er.getIdS());
            er.setStudent(s);
        }
        model.addAttribute("erlist",erlist);
        model.addAttribute("idT",user.getUsername());
        return "teacher/pigailist";
    }

    @RequestMapping("pigaidetail")
    public String pigaidetail(String idEr,Model model)throws Exception{
        List<Historytestpaper> htplist= htps.queryByidEr(idEr);
        List<Questions> qAlllist=qs.queryAllQusetion();
        List<Questions> qlist=new ArrayList<>();
        for(Historytestpaper htp:htplist){
            for(Questions q:qAlllist){
                if(htp.getIdQ().equals(q.getIdQ())){
                    qlist.add(q);
                    htp.setQuestions(q);
                    //可能会出错，加快查询
                    break;
                }
            }
        }
        model.addAttribute("htplist",htplist);
        model.addAttribute("qlist",qlist);

        User user = TokenUtil.getUser();
        String idT = user.getUsername();
        model.addAttribute("idT",idT);

        return "teacher/pigaidetail";
    }

    //这里是学生,教师查看已批改完成试卷
    @RequestMapping("historydetail")
    public String historydetail(String idEr,Model model)throws Exception{
        List<Historytestpaper> htplist= htps.queryByidEr(idEr);
        List<Questions> qAlllist=qs.queryAllQusetion();
        for(Historytestpaper htp:htplist){
            for(Questions q:qAlllist){
                if(htp.getIdQ().equals(q.getIdQ())){
                    htp.setQuestions(q);
                    //可能会出错，加快查询
                    break;
                }
            }
        }
        model.addAttribute("htplist",htplist);

        return "/student/historytestdeatil";
    }


    //提交批改试题需要填写测评记录结束时间
    //先更新历史试题，再更新测评记录时间
    @RequestMapping("pigaiupdate")
    public String pigaiupdate(String[] idEr,String[] idQ,String[] scoreHtp, String[] questionscore,
                              String idT, Model model)throws Exception{
        for(int i=0;i<idEr.length;i++){
            htps.updateByIdErandIdQ(idEr[i],idQ[i],scoreHtp[i]);
        }
        ers.updateEvaluationrecordByIdEr(idEr[0]);
        evaluationService.pExecuting(idQ, scoreHtp, questionscore, idEr[0], idT);
        model.addAttribute("message","批改完成");
        //TODO:教师编号
        return  pigailist(model);
    }
}

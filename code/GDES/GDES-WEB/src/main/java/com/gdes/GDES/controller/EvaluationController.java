package com.gdes.GDES.controller;

import com.gdes.GDES.model.*;
import com.gdes.GDES.service.*;
import myclass.ProfessionalCompetenceEvaluation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/evaluation/")
public class EvaluationController {
    @Resource
    private KnowledgepointService knowledgepointService;

    @Resource
    private QuestionspointService questionspointService;

    @Resource
    private ScoredetailService scoredetailService;

    @Resource
    private LatestabilityscoreService latestabilityscoreService;

    @Resource
    private MajorService majorService;

    @Resource
    private ProfessionalabilitypointrequirementsService professionalabilitypointrequirementsService;

    @Resource
    private PostService postService;

    @Resource
    private PostabilitypointService postabilitypointService;

    @Resource
    private StudentpostService studentpostService;

    @RequestMapping("execut")
    public String executing(Model model) throws Exception {
        //假设当前是五道试题
        String[] ique = {"91613e1409cd40bcab2a5a1e3e928202", "6d802eac75d942038335caaf42be27fa", "9061c8c7eeef4a19972db7215b5da6a9", "998ce548e5fc44e5a1d3ad477d577ee0", "f3ed67c494bf4f7da11881d1bb07c64c"};
        double[][] score_questions = {{10, 10, 5, 5, 5}}; //题目本来的分值
        double[][] score_student = {{7, 8, 2, 4, 4}}; //学生五道试题的得分
        String teacherid = "2"; //教师id
        String studentid = "631406010217"; //学生id
        String erid = "ttt"; //评测记录id
        String mid = "01"; //专业id

        /**
         * 构建试题与知识点的矩阵
         */
        int a = ique.length; //学生提交试题的个数
        //所有知识点
        List<Knowledgepoint> kpList = knowledgepointService.queryAllKnowledgepoint();
        int b = kpList.size();
        double[][] question_knowledge = new double[a][b+1]; //试题与知识点的矩阵
        for(int i=0;i<a;i++) {
            List<Questionspoint> questionspoints = questionspointService.queryByQuestionId(ique[i]);
            for(Questionspoint qp: questionspoints) {
                int kpid = qp.getIdKp(); //知识点id
                double kppro = Double.parseDouble(qp.getProportionQp());
                for(int j=0;j<kpList.size();j++) {
                    if(kpid==kpList.get(j).getIdKp()) {
                        question_knowledge[i][j] = kppro;
                    }
                }

            }
        }

        /**
         *构建知识点与能力点矩阵
         */
        double[][] knowledge_ability = new double[b+1][83]; //知识与能力点矩阵
        for(int j=1;j<83;j++) {
            List<Knowledgepoint> knowledgePointList = knowledgepointService.queryByAbilityId(j);
            for(Knowledgepoint kp: knowledgePointList) {
                int kpid = kp.getIdKp(); //知识点Id
                double kppro = Double.parseDouble(kp.getProportionKp());
                for(int k=0;k<kpList.size();k++) {
                    if(kpid==kpList.get(k).getIdKp()) {
                        knowledge_ability[k][j] = kppro;
                    }
                }
            }
        }

        //所有试题原本对应的能力点得分（相当于每道题都已满分算出来能力点应该得的分数）
        double[][] score_ability = ProfessionalCompetenceEvaluation.AbilityScore(question_knowledge, knowledge_ability, score_questions);
        /**
         * 学生能力点得分，按每个能力点100分计算
         */
        /*double[][] score_ability_student = ProfessionalCompetenceEvaluation.AbilityScore(question_knowledge, knowledge_ability, score_student);
        //存到一维数组（能力点得分）
        double[] result = new double[83];
        for(int i=0;i<score_ability[0].length;i++) {
            result[i] = 0;
            if(score_ability_student[0][i]!=0) {
                result[i] = ProfessionalCompetenceEvaluation.roundOffTwoDecimalPlaces((score_ability_student[0][i]/score_ability[0][i])*100);
            }
        }*/

        /**
         * 学生专业所属专业大类要求下的得分
         */
        List<Major> majors = majorService.queryByMajorId(mid);
        int mbid = majors.get(0).getIdMb(); //学生专业的专业大类id
        List<Professionalabilitypointrequirements> professionalAbilityPointRequirements = professionalabilitypointrequirementsService.queryByMajorBId(mbid);
        int mi = 1;
        double[] majorrequire = new double[83];
        for(Professionalabilitypointrequirements p: professionalAbilityPointRequirements) {
            double con = Double.parseDouble(p.getConversionratioPapr()); //转换的比例
            majorrequire[mi] = con;
            //result[mi] = ProfessionalCompetenceEvaluation.roundOffTwoDecimalPlaces(result[mi]*con);
            mi++;
        }
        //得到试题和能力点的得分占比,每道试题能力点加起来为1
        double[][] question_ability = ProfessionalCompetenceEvaluation.ColumnRatioByRow(
                ProfessionalCompetenceEvaluation.MatrixMultiplication(question_knowledge, knowledge_ability));
        //每道试题能力点的得分
        for(int i=0;i<question_ability.length;i++) {
            for(int j=0;j<question_ability[0].length; j++) {
                if(question_ability[i][j]!=0) {
                    question_ability[i][j] = (score_student[0][i]/score_questions[0][i])*majorrequire[j]*100;
                }
            }
        }
        /**
         * 插入得分详情
         */
        /*for(int i=0;i<question_ability.length;i++) {
            for(int j=0;j<question_ability[0].length;j++) {
                if(question_ability[i][j]!=0) {
                    Scoredetail scoredetail = new Scoredetail();
                    scoredetail.setIdT(teacherid);
                    scoredetail.setIdS(studentid);
                    scoredetail.setIdEr(erid);
                    scoredetail.setIdQ(ique[i]);
                    scoredetail.setIdAp(j);
                    scoredetail.setScoreSd(Double.toString(question_ability[i][j]));
                    scoredetail.setTimeSd(nowTime());
                    scoredetailService.addScoredetail(scoredetail); //插入数据库
                }
            }
        }*/

        /**
         * 插入最新能力得分
         */
        //得分详情里面的该学生的能力点
        List<Integer> apidList = scoredetailService.getApIdNotRepeat(studentid);
        //若不存在该学生的能力点得分
        long isexist = latestabilityscoreService.queryStudentByStudentId(studentid);
        /*if(isexist==0) {
            for (int i = 0; i < apidList.size(); i++) {
                Scoredetail scoredetail = new Scoredetail();
                scoredetail.setIdS(studentid);
                scoredetail.setIdAp(apidList.get(i));
                String score = scoredetailService.getAvgByStuentIdAndApId(scoredetail);
                Latestabilityscore la = new Latestabilityscore();
                la.setIdS(studentid);
                la.setIdAp(apidList.get(i));
                la.setScoreLas(Double.toString(ProfessionalCompetenceEvaluation.roundOffTwoDecimalPlaces(Double.parseDouble(score))));
                la.setTimeLas(nowTime());
                latestabilityscoreService.addLatestabilityscore(la);
            }
        } else { //存在某些能力得分
            List<Integer> existap = latestabilityscoreService.getAbilityPointIdList(studentid);
            //插入有新的能力点
            //更新操作
            for(int i=0;i<apidList.size();i++) {
                boolean sints = true;
                for(int j=0;j<existap.size();j++) {
                    if(existap.get(j)==apidList.get(i)) {
                        sints = false;
                        Scoredetail scoredetail = new Scoredetail();
                        scoredetail.setIdS(studentid);
                        scoredetail.setIdAp(apidList.get(i));
                        String score = scoredetailService.getAvgByStuentIdAndApId(scoredetail);
                        Latestabilityscore la = new Latestabilityscore();
                        la.setIdS(studentid);
                        la.setIdAp(apidList.get(i));
                        la.setScoreLas(Double.toString(ProfessionalCompetenceEvaluation.roundOffTwoDecimalPlaces(Double.parseDouble(score))));
                        la.setTimeLas(nowTime());
                        latestabilityscoreService.updateAbilityScoreByStudentId(la);
                        break;
                    }
                }
                if(sints==true) {
                    Scoredetail scoredetail = new Scoredetail();
                    scoredetail.setIdS(studentid);
                    scoredetail.setIdAp(apidList.get(i));
                    String score = scoredetailService.getAvgByStuentIdAndApId(scoredetail);
                    Latestabilityscore la = new Latestabilityscore();
                    la.setIdS(studentid);
                    la.setIdAp(apidList.get(i));
                    la.setScoreLas(Double.toString(ProfessionalCompetenceEvaluation.roundOffTwoDecimalPlaces(Double.parseDouble(score))));
                    la.setTimeLas(nowTime());
                    latestabilityscoreService.addLatestabilityscore(la);
                }
            }
        }*/

        /**
         * 岗位推荐
         */
        double[][] lascore_ability = new double[1][83]; //学生最新能力得分
        List<Latestabilityscore> latestabilityscores = latestabilityscoreService.queryByStudentId(studentid);
        for(Latestabilityscore la: latestabilityscores) {
            lascore_ability[0][la.getIdAp()] = Double.parseDouble(la.getScoreLas());
        }
        Long postcount = postService.getCount(); //岗位个数
        //学生岗位得分
        double[][] ability_post = new double[83][Integer.parseInt(Long.toString(postcount))+1];
        for(int i=1;i<postcount+1;i++) {
            List<Postabilitypoint> postabilitypointList = postabilitypointService.getListByPId(i);
            for(Postabilitypoint pa:postabilitypointList) {
                ability_post[pa.getIdAp()][i] = Double.parseDouble(pa.getProportionSap());
            }
        }
        double[][] score_post = ProfessionalCompetenceEvaluation.MatrixMultiplication(lascore_ability, ability_post);

        //所有能力点均为满分的岗位得分(岗位满分)
        double[][] score_abilitymax = new double[1][83];
        for(int i=0;i<score_abilitymax[0].length;i++) {
            score_abilitymax[0][i] = 100;
        }
        double[][] ability_post_max = ProfessionalCompetenceEvaluation.MatrixMultiplication(score_abilitymax, ability_post);
        //学生岗位最终得分
        /**
         * 插入学生岗位
         */
        //是否有该学生的岗位分析
        long isexiststudent = studentpostService.getCountByStudentId(studentid);
        /*if(isexiststudent==0) {
            for (int i = 1; i < score_post[0].length; i++) {
                Studentpost sp = new Studentpost();
                sp.setIdS(studentid);
                sp.setIdP(i);
                sp.setScoreSp(Double.toString(
                        ProfessionalCompetenceEvaluation.roundOffTwoDecimalPlaces(score_post[0][i] / ability_post_max[0][i] * 100)));
                sp.setTimeSp(nowTime());
                studentpostService.addStudentpost(sp);
            }
        } else {
            for (int i = 1; i < score_post[0].length; i++) {
                Studentpost sp = new Studentpost();
                sp.setIdS(studentid);
                sp.setIdP(i);
                sp.setScoreSp(Double.toString(
                        ProfessionalCompetenceEvaluation.roundOffTwoDecimalPlaces(score_post[0][i] / ability_post_max[0][i] * 100)));
                sp.setTimeSp(nowTime());
                studentpostService.updateStudentPost(sp);
            }
        }*/

//        return scoreProportion(studentid, model);
        return "redirect:/las/scoreproportion.do?id_s="+studentid;
    }

    /**
     * 能力点得分比例
     * @param id_s
     * @param model
     * @return
     */
    /*public String scoreProportion(String id_s, Model model) throws Exception {
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
    }*/

    /**
     * 获取当前时间
     * @return String
     */
    public String nowTime() {
        Date now = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return df.format(now);
    }

}

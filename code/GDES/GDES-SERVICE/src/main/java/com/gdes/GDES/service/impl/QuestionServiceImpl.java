package com.gdes.GDES.service.impl;

import com.gdes.GDES.dao.CourseMapper;
import com.gdes.GDES.dao.KnowledgepointMapper;
import com.gdes.GDES.dao.QuestionsMapper;
import com.gdes.GDES.dao.QuestionspointMapper;
import com.gdes.GDES.model.Questions;
import com.gdes.GDES.model.QuestionsExample;
import com.gdes.GDES.model.Questionspoint;
import com.gdes.GDES.model.QuestionspointExample;
import com.gdes.GDES.service.QuestionsService;
import org.springframework.stereotype.Repository;
import sun.dc.pr.PRError;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Allen on 2018/5/14.
 */
@Repository
public class QuestionServiceImpl implements QuestionsService {
    @Resource
    private QuestionsMapper qm;

    @Resource
    private CourseMapper cm;

    @Resource
    private KnowledgepointMapper kpm;

    @Resource
    private QuestionspointMapper qpm;



    public List<Questions> queryAllQusetion() throws Exception {
        QuestionsExample qe=new QuestionsExample();
        QuestionsExample.Criteria criteria=qe.createCriteria();
        criteria.andIdQIsNotNull();

        List<Questions> list=qm.selectByExample(qe);
        return list;
    }

    public List<Questions> queryQuestionByCourse(String idC) throws Exception {
        //方法1,感觉时间开销比方法2大，未验证
//        List<Questions> AllList=queryAllQusetion();
//        List<Questions> list=new ArrayList<Questions>();
//        for(Questions q:AllList){
//            if(q.getIdC().equals(idC)){
//                list.add(q);
//            }
//        }
        //方法2
        QuestionsExample qe=new QuestionsExample();
        QuestionsExample.Criteria criteria=qe.createCriteria();
        criteria.andIdCEqualTo(idC);

        return qm.selectByExample(qe);
    }

    public List<Questions> queryQuestionBySytle(String styleQ) throws Exception {
        //方法2
        QuestionsExample qe=new QuestionsExample();
        QuestionsExample.Criteria criteria=qe.createCriteria();
        criteria.andStyleQEqualTo(styleQ);

        return qm.selectByExample(qe);
    }

    public List<Questions> queryQuestionByKnowpoint(String idKp) throws Exception {
        //方法2
        QuestionspointExample qpe=new QuestionspointExample();
        QuestionspointExample.Criteria criteria=qpe.createCriteria();
        criteria.andIdKpEqualTo(Integer.valueOf(idKp));
        List<Questionspoint> qplist =qpm.selectByExample(qpe);
        List<Questions> list=queryAllQusetion();



        return null;
    }

    public String addQuestion(Questions q) throws Exception {
        return null;
    }

    public String updateQuestion(Questions q) throws Exception {
        return null;
    }

    public String deleteQuestion(Questions q) throws Exception {
        return null;
    }
}

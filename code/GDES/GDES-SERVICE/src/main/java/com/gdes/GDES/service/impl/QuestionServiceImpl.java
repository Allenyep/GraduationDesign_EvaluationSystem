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

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * Created by Allen on 2018/5/14.
 */
@Repository
public class QuestionServiceImpl implements QuestionsService {
    @Resource
    private QuestionsMapper qm;

    @Resource
    private QuestionspointMapper qpm;



    public List<Questions> queryAllQusetion() throws Exception {
        QuestionsExample qe=new QuestionsExample();
        QuestionsExample.Criteria criteria=qe.createCriteria();
        criteria.andIdQIsNotNull();

        List<Questions> list=qm.selectByExample(qe);
        return list;
    }

    public Questions queryByPrimary(String idQ) throws Exception {
        return qm.selectByPrimaryKey(idQ);
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
        //TODO:数据库级联操作转换为服务操作
        QuestionspointExample qpe=new QuestionspointExample();
        QuestionspointExample.Criteria criteria=qpe.createCriteria();
        criteria.andIdKpEqualTo(Integer.valueOf(idKp));
        List<Questionspoint> qplist =qpm.selectByExample(qpe);
        List<Questions> list=queryAllQusetion();
        List<Questions> res=new ArrayList<Questions>();

        for(Questionspoint qp:qplist){
            for(Questions q:list){
                if(qp.getIdQ().equals(q.getIdQ()))
                    res.add(q);
            }
        }
        return res;
    }

    public String addQuestion(Questions q) throws Exception {
        if (qm.insertSelective(q)>0)
            return "插入成功";
        else
            return "插入失败";
    }

    public String updateQuestion(Questions q) throws Exception {
        if(qm.updateByPrimaryKeySelective(q)>0)
            return "更新成功";
        else
            return "更新失败";
    }

    public String deleteQuestion(Questions q) throws Exception {
        if(qm.deleteByPrimaryKey(q.getIdQ())>0)
            return "删除成功";
        else
            return "删除失败";
    }
}

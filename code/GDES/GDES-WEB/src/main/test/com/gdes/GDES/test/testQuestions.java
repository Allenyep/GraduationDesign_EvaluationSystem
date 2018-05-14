package com.gdes.GDES.test;

import com.gdes.GDES.dao.QuestionsMapper;
import com.gdes.GDES.model.Questions;
import com.gdes.GDES.model.QuestionsExample;

import com.gdes.GDES.model.utils.UUid;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用于测试试题表
 * Created by Allen on 2018/5/10.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:config/applicationContext.xml")
public class TestQuestions {
    @Resource
    private QuestionsMapper qm;


    @Test
    public void testFindAllQuestion(){
        QuestionsExample qe=new QuestionsExample();
        QuestionsExample.Criteria criteria=qe.createCriteria();
        criteria.andIdQIsNotNull();

        List<Questions> list=qm.selectByExample(qe);

        for(Questions q:list){
            System.out.println(q.getContextQ());
        }

    }

    @Test
    public void queryQuestions(){
        QuestionsExample qe=new QuestionsExample();
        QuestionsExample.Criteria criteria=qe.createCriteria();
        criteria.andContextQLike("%顺序表%");

        List<Questions> list=qm.selectByExample(qe);

        for(Questions q:list){
            System.out.println(q.getContextQ());
        }
    }

    /**
     * UUid插入主键
     */
    @Test
    public void addQuestions(){
        Questions question=new Questions();
        question.setIdQ(UUid.getUUID());
        question.setIdC("2");
        question.setContextQ("数组的长度是多少");
        question.setScoreQ("5");
        question.setAnswerQ("12");
        question.setIdT("1");
        question.setStyleQ("2");

        qm.insertSelective(question);
    }
}

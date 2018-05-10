package com.gdes.GDES.test;

import com.gdes.GDES.dao.QuestionsMapper;
import com.gdes.GDES.model.Questions;
import com.gdes.GDES.model.QuestionsExample;
import com.gdes.GDES.model.QuestionsWithBLOBs;
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
public class testQuestions {
    @Resource
    private QuestionsMapper qm;


    @Test
    public void testFindAllQuestion(){
        QuestionsExample qe=new QuestionsExample();
        QuestionsExample.Criteria criteria=qe.createCriteria();
        criteria.andIdQIsNotNull();

        List<Questions> list=qm.selectByExample(qe);
        List<QuestionsWithBLOBs> listb=qm.selectByExampleWithBLOBs(qe);

        for(Questions q:list){
            System.out.println(q.getScoreQ());
        }
        for(QuestionsWithBLOBs qwb:listb){
            System.out.println(qwb.getContextQ());
            System.out.println(qwb.getAnswerQ());
        }
    }

    @Test
    public void queryQuestions(){
        QuestionsExample qe=new QuestionsExample();
        QuestionsExample.Criteria criteria=qe.createCriteria();

        QuestionsWithBLOBs
    }
}

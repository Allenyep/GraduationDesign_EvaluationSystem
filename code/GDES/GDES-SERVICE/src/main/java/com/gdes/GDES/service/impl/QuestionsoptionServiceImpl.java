package com.gdes.GDES.service.impl;


import com.gdes.GDES.dao.QuestionsoptionMapper;
import com.gdes.GDES.model.Questionsoption;
import com.gdes.GDES.model.QuestionsoptionExample;
import com.gdes.GDES.model.Questionspoint;
import com.gdes.GDES.service.QuestionsoptionService;
import com.gdes.GDES.service.QuestionspointService;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * 试题类型
 * Created by Allen on 2018/5/16.
 */
@Repository
public class QuestionsoptionServiceImpl implements QuestionsoptionService{

    @Resource
    private QuestionsoptionMapper qpm;

    public List<Questionsoption> queryByidQ(String idQ) throws Exception {
        QuestionsoptionExample qoe=new QuestionsoptionExample();
        QuestionsoptionExample.Criteria criteria=qoe.createCriteria();
        criteria.andIdQEqualTo(idQ);

        return qpm.selectByExample(qoe);
    }
}

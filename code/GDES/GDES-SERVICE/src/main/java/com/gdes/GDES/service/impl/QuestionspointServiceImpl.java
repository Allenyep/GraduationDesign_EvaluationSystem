package com.gdes.GDES.service.impl;

import com.gdes.GDES.dao.QuestionspointMapper;
import com.gdes.GDES.model.Questionspoint;
import com.gdes.GDES.model.QuestionspointExample;
import com.gdes.GDES.service.QuestionspointService;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class QuestionspointServiceImpl implements QuestionspointService{
    @Resource
    private QuestionspointMapper questionspointMapper;

    public List<Questionspoint> queryByQuestionId(String qid) throws Exception {
        QuestionspointExample example = new QuestionspointExample();
        QuestionspointExample.Criteria criteria = example.createCriteria();
        criteria.andIdQEqualTo(qid);
        return questionspointMapper.selectByExample(example);
    }
}

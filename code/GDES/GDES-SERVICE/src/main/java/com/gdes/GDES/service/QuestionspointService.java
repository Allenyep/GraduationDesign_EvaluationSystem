package com.gdes.GDES.service;

import com.gdes.GDES.model.Questionspoint;

import java.util.List;

/**
 * 试题知识点
 */
public interface QuestionspointService {
    /**
     * 根据试题编号查询
     * @param qid
     * @return
     * @throws Exception
     */
    public List<Questionspoint> queryByQuestionId(String qid) throws Exception;
}

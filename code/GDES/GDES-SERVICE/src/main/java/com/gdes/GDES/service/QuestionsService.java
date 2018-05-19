package com.gdes.GDES.service;

import com.gdes.GDES.model.Questions;

import java.util.List;

/**
 * 添加知识点
 * Created by Allen on 2018/5/11.
 */
public interface QuestionsService {

    //TODO:根据课程，题目类型，知识点查询试题

    /**
     * 查询所有知识点
     * @return
     * @throws Exception
     */
    public List<Questions> queryAllQusetion()throws Exception;

    /**
     * 根据课程查询试题
     * @return
     * @throws Exception
     */
    public List<Questions> queryQuestionByCourse(String idC)throws Exception;

    /**
     * 根据类型查询试题
     * @return
     * @throws Exception
     */
    public List<Questions> queryQuestionBySytle(String styleQ)throws Exception;

    /**
     * 根据知识点查询试题
     * @param idKp
     * @return
     * @throws Exception
     */
    public List<Questions> queryQuestionByKnowpoint(String idKp)throws Exception;


    /**
     * 添加试题，出题
     * @param q
     * @return
     * @throws Exception
     */
    public String addQuestion(Questions q)throws Exception;

    /**
     * 修改题目内容
     * 内容，答案
     * @param q
     * @return
     * @throws Exception
     */
    public String updateQuestion(Questions q)throws Exception;


    /**
     * 删除题目，根据题目id删除题目
     * @param q
     * @return
     * @throws Exception
     */
    public String deleteQuestion(Questions q)throws Exception;
}

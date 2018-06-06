package com.gdes.GDES.service;

/**
 * Created by 96906 on 2018/5/31.
 */
public interface EvaluationService {
    /**
     * 能力评价模型及就业推荐模型
     * @return
     * @throws Exception
     */
   public String pExecuting(String[] idQ, String[] answerscore, String[] questionscore ,String erid, String teacherid) throws Exception;
}

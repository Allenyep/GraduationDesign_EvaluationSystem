package com.gdes.GDES.service;


import com.gdes.GDES.model.Questionsoption;

import java.util.List;

/**
 * 试题选项--针对选择题
 * Created by Allen on 2018/5/16.
 */

public interface QuestionsoptionService {
    /**
     * 根据试题编号查询试题选项
     * @param idQ
     * @return
     * @throws Exception
     */
    public List<Questionsoption> queryByidQ(String idQ)throws Exception;

    /**
     * 插入试题选项，选择题出题时插入
     * @param qo
     * @return
     * @throws Exception
     */
    public String addQuestionsOption(Questionsoption qo)throws Exception;
}

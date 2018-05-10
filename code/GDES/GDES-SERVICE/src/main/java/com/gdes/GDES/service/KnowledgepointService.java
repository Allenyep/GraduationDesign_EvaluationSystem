package com.gdes.GDES.service;

import com.gdes.GDES.model.Knowledgepoint;

import java.util.List;

/**
 *
 * Created by Allen on 2018/5/10.
 */

public interface KnowledgepointService {
    //TODO:知识点添加修改删除

    /**
     * 根据课程编号查找知识点
     * @return
     * @throws Exception
     */
    public List<Knowledgepoint> queryAllKonwledgepoint(String id_c)throws Exception;

    /**
     * 添加知识点
     * @param kp
     * @return
     * @throws Exception
     */
    public String addKonwledgepoint(Knowledgepoint kp)throws Exception;

    /**
     * 修改知识点
     * @param kp
     * @return
     * @throws Exception
     */
    public String updateKonwledgepoint(Knowledgepoint kp)throws Exception;

    /**
     * 删除知识点
     * @param kp
     * @return
     * @throws Exception
     */
    public String deleteKonwledgepoint(Knowledgepoint kp)throws Exception;
}

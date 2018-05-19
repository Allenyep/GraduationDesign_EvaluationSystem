package com.gdes.GDES.service;

import com.gdes.GDES.model.Knowledgepoint;

import java.util.List;

/**
 *
 * Created by Allen on 2018/5/10.
 */

public interface KnowledgepointService {
    //知识点添加修改删除

    /**
     * 查询所有知识点
     * @return
     * @throws Exception
     */
    public List<Knowledgepoint> queryAllKnowledgepoint()throws Exception;

    /**
     * 根据课程编号查找知识点
     * @return
     * @throws Exception
     */
    public List<Knowledgepoint> queryAllKonwledgepointBycourse(String id_c)throws Exception;

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

    /**
     * 得到知识点个数
     * @return
     * @throws Exception
     */
    public long getCount() throws Exception;

    /**
     * 根据能力点查询
     * @param aid
     * @return
     * @throws Exception
     */
    public List<Knowledgepoint> queryByAbilityId(int aid) throws Exception;
}

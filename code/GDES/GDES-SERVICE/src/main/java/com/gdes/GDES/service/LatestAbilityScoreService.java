package com.gdes.GDES.service;

import com.gdes.GDES.model.Latestabilityscore;
import com.gdes.GDES.model.LatestabilityscoreExample;

import java.util.List;

/**
 * 最新能力点得分 业务接口
 */
public interface LatestabilityscoreService {
    /**
     * 插入记录
     * @param latestabilityscore
     * @return
     * @throws Exception
     */
    public int addLatestabilityscore(Latestabilityscore latestabilityscore) throws Exception;

    /**
     * 按学生id查询
     * @param sid
     * @return
     * @throws Exception
     */
    public List<Latestabilityscore> queryByStudentId(String sid) throws Exception;

    /**
     * 查询是否存在该学生的能力点得分
     * @param sid
     * @return
     * @throws Exception
     */
    public long queryStudentByStudentId(String sid) throws Exception;

    /**
     * 查找学生最新能力得分表中已经存在的能力点
     * @param sid
     * @return
     * @throws Exception
     */
    public List<Integer> getAbilityPointIdList(String sid) throws Exception;

    /**
     * 根据学生id更新
     * @param las
     * @return
     * @throws Exception
     */
    public int updateAbilityScoreByStudentId(Latestabilityscore las) throws Exception;

    /**
     * 查询某个专业所有学生的最新能力得分
     * @param mid
     * @return
     * @throws Exception
     */
    public List<Latestabilityscore> getListByMajorId(String mid) throws Exception;
}

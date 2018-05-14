package com.gdes.GDES.service;

import com.gdes.GDES.model.Latestabilityscore;
import com.gdes.GDES.model.Scoredetail;

import java.util.List;


public interface ScoredetailService {
    /**
     * 插入得分详情
     * @param scoredetail
     * @return
     * @throws Exception
     */
    public int addScoredetail(Scoredetail scoredetail) throws Exception;

    /**
     * 根据学生id查询得分详情
     * @param sid
     * @return
     * @throws Exception
     */
    public List<Scoredetail> queryByStudentId(String sid) throws Exception;

    /**
     * 根据能力点Id和学生id查询得分详情
     * @param sid
     * @param apid
     * @return
     * @throws Exception
     */
    public List<Scoredetail> queryByAbilityId(String sid, Integer apid) throws Exception;

    /**
     * 按学号得到不重复的能力点id
     * @param sid
     * @return
     */
    public List<Integer> getApIdNotRepeat(String sid) throws Exception;

    /**
     * 根据学生id和能力点id查询该能力点的平均值
     * @param record
     * @return
     */
    String getAvgByStuentIdAndApId(Scoredetail record) throws Exception;
}

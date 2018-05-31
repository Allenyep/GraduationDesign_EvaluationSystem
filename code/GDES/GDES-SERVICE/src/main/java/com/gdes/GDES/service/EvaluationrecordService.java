package com.gdes.GDES.service;

import com.gdes.GDES.model.Evaluationrecord;

import java.util.List;

/**
 * 评测记录
 */
public interface EvaluationrecordService {
    /**
     * 根据专业id查询评测记录
     * @param mid
     * @return
     * @throws Exception
     */
    public List<Evaluationrecord> getListInStudentIdList(String mid) throws Exception;

    /**
     * 根据学生id查询测评记录
     * @param sid
     * @return
     * @throws Exception
     */
    public List<Evaluationrecord> evaluateList(String sid) throws Exception;

    /**
     * 根据学生id查询练习记录
     * @param sid
     * @return
     * @throws Exception
     */
    public List<Evaluationrecord> practiseList(String sid) throws Exception;

}

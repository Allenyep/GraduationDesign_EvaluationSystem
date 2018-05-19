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
}

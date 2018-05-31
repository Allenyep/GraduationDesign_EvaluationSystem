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
     * 根据学生编号，教师编号插入测试记录
     * @param idS
     * @param idT
     * @return
     * @throws Exception
     */
    public String addEvaluationrecord(String idS,String idT)throws Exception;

    /**
     * 根据教师查询待批改试题
     * 结束时间为空=待批改
     * @param idT
     * @return
     * @throws Exception
     */
    public List<Evaluationrecord> queryByendErIsNull(String idT)throws Exception;

    /**
     * 根据测评记录编号更新结束时间
     * 将待批改试卷转换为结束
     * @param idEr
     * @return
     * @throws Exception
     */
    public String updateEvaluationrecordByIdEr(String idEr)throws Exception;
}

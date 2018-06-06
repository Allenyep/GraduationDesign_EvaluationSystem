package com.gdes.GDES.service;

import com.gdes.GDES.model.Evaluationrecord;

import java.util.List;

/**
 * 评测记录
 */
public interface EvaluationrecordService {
    /**
     * 根据评测记录id查询
     * @return
     * @throws Exception
     */
    public List<Evaluationrecord> getListByErId(String erid) throws Exception;
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
     * 根据教师id查询测评记录
     * @param tid
     * @return
     * @throws Exception
     */
    public List<Evaluationrecord> evaluateListByIdT(String tid) throws Exception;

    /**
     * 根据教师id查询已经批改的测评记录
     * @param tid
     * @return
     * @throws Exception
     */
    public List<Evaluationrecord> correctList(String tid) throws Exception;

    /**
     * 根据教师id查询未批改的测评记录
     * @param tid
     * @return
     * @throws Exception
     */
    public List<Evaluationrecord> notCorrectList(String tid) throws Exception;

    /**
     * 根据学生id查询练习记录
     * @param sid
     * @return
     * @throws Exception
     */
    public List<Evaluationrecord> practiseList(String sid) throws Exception;

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

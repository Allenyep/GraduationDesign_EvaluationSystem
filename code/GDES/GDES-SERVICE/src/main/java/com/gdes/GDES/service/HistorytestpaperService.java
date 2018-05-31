package com.gdes.GDES.service;

import com.gdes.GDES.model.Historytestpaper;

import java.util.List;

/**
 * 历史试题
 * Created by Allen on 2018/5/19.
 */
public interface HistorytestpaperService {
    /**
     * 根据学生主键查询历史列表
     * @param idS
     * @return
     */
    public List<Historytestpaper> queryByStudentid(String idS);

    /**
     * 插入历史试卷
     *
     * @param htp
     * @return
     */
    public String addHistorytestpaper(Historytestpaper htp);

    /**
     * 根据测评记录编号查询试卷进行批改
     * @param idEr
     * @return
     */
    public List<Historytestpaper> queryByidEr(String idEr);


    /**
     * 教师提交批改分数
     * 输入测评记录编号，试题编号更新试题得分
     * @param idEr
     * @param idQ
     * @param scoreHtp
     * @return
     * @throws Exception
     */
    public String updateByIdErandIdQ(String idEr,String idQ,String scoreHtp)throws Exception;
}

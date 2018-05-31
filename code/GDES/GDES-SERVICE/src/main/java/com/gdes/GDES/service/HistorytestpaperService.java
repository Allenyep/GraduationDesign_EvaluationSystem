package com.gdes.GDES.service;

import com.gdes.GDES.model.Historytestpaper;
import com.gdes.GDES.model.HistorytestpaperExample;

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
     * 根据评测记录和学生id查询某道试题
     * @param idQ
     * @param idEr
     * @return
     * @throws Exception
     */
    public List<Historytestpaper> queryQuestionByIdQandIdEr(String idQ, String idEr) throws Exception;
}

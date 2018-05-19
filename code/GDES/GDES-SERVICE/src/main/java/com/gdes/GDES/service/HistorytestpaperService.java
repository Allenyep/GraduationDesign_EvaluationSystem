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
}

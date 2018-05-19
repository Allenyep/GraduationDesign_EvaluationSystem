package com.gdes.GDES.service.impl;

import com.gdes.GDES.dao.HistorytestpaperMapper;
import com.gdes.GDES.model.Historytestpaper;
import com.gdes.GDES.model.HistorytestpaperExample;
import com.gdes.GDES.service.HistorytestpaperService;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * 历史试卷
 * Created by Allen on 2018/5/19.
 */
@Repository
public class HistorytestpaperServiceImpl implements HistorytestpaperService {
    @Resource
    private HistorytestpaperMapper htpm;

    public List<Historytestpaper> queryByStudentid(String idS) {
        HistorytestpaperExample htpe=new HistorytestpaperExample();
        HistorytestpaperExample.Criteria criteria=htpe.createCriteria();

        criteria.andIdSEqualTo(idS);

        return htpm.selectByExample(htpe);
    }
}

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

    public List<Historytestpaper> queryQuestionByIdQandIdEr(String idQ, String idEr) throws Exception {
        HistorytestpaperExample example = new HistorytestpaperExample();
        HistorytestpaperExample.Criteria criteria = example.createCriteria();
        criteria.andIdQEqualTo(idQ);
        criteria.andIdErEqualTo(idEr);
        return htpm.selectByExample(example);
    }

    public String addHistorytestpaper(Historytestpaper htp) {
        if(htpm.insertSelective(htp)>0)
            return "SUCCESS";
        return "插入失败";
    }

    public List<Historytestpaper> queryByidEr(String idEr) {
        HistorytestpaperExample htpe=new HistorytestpaperExample();
        HistorytestpaperExample.Criteria criteria=htpe.createCriteria();
        criteria.andIdErEqualTo(idEr);

        List<Historytestpaper> htplist= htpm.selectByExample(htpe);

        return htplist;
    }

    public String updateByIdErandIdQ(String idEr, String idQ,
                                     String scoreHtp) throws Exception {
        HistorytestpaperExample htpe=new HistorytestpaperExample();
        HistorytestpaperExample.Criteria criteria=htpe.createCriteria();
        criteria.andIdErEqualTo(idEr);
        criteria.andIdQEqualTo(idQ);
        List<Historytestpaper> htplist=htpm.selectByExample(htpe);
        Historytestpaper htp=htplist.get(0);
        htp.setScoreHtp(scoreHtp);
        if(htpm.updateByPrimaryKeySelective(htp)>0)
            return htp.getIdQ()+htp.getIdEr();

        return "添加失败";
    }
}

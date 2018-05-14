package com.gdes.GDES.service.impl;

import com.gdes.GDES.dao.AbilitypointMapper;
import com.gdes.GDES.dao.ScoredetailMapper;
import com.gdes.GDES.dao.TeacherMapper;
import com.gdes.GDES.model.*;
import com.gdes.GDES.service.ScoredetailService;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * 知识点详情的业务实现
 */
@Repository
public class ScoredetailServiceImpl implements ScoredetailService{

    @Resource
    private ScoredetailMapper scoredetailMapper;

    @Resource
    private AbilitypointMapper abilitypointMapper;

    @Resource
    private TeacherMapper teacherMapper;

    public int addScoredetail(Scoredetail scoredetail) throws Exception {
        return scoredetailMapper.insert(scoredetail);
    }

    /**
     * 根据学生id查询得分详情
     * @param sid
     * @return
     * @throws Exception
     */
    public List<Scoredetail> queryByStudentId(String sid) throws Exception {
        ScoredetailExample example = new ScoredetailExample();
        ScoredetailExample.Criteria criteria = example.createCriteria();
        criteria.andIdSEqualTo(sid);
        example.setOrderByClause("id_ap ASC");
        List<Scoredetail> scoredetailList = scoredetailMapper.selectByExample(example);
        for(Scoredetail sd : scoredetailList) {
            Integer apid = sd.getIdAp();
            Abilitypoint abilitypoint = abilitypointMapper.selectByPrimaryKey(apid);
            sd.setAbilitypoint(abilitypoint);
        }
        return scoredetailList;
    }

    /**
     * 根据能力点Id和学生id查询得分详情
     * @param sid
     * @param apid
     * @return
     * @throws Exception
     */
    public List<Scoredetail> queryByAbilityId(String sid, Integer apid) throws Exception {
        ScoredetailExample example = new ScoredetailExample();
        ScoredetailExample.Criteria criteria = example.createCriteria();
        criteria.andIdSEqualTo(sid);
        criteria.andIdApEqualTo(apid);
        List<Scoredetail> scoredetailList = scoredetailMapper.selectByExample(example);
        for(Scoredetail sd: scoredetailList) {
            //能力点
            Integer ap_id = sd.getIdAp();
            Abilitypoint abilitypoint = abilitypointMapper.selectByPrimaryKey(ap_id);
            sd.setAbilitypoint(abilitypoint);
            //教师
            String tid = sd.getIdT();
            Teacher teacher = teacherMapper.selectByPrimaryKey(tid);
            sd.setTeacher(teacher);
        }
        return scoredetailList;
    }

    public List<Integer> getApIdNotRepeat(String sid) throws Exception {
        return scoredetailMapper.getApIdNotRepeat(sid);
    }

    public String getAvgByStuentIdAndApId(Scoredetail record) throws Exception {
        return scoredetailMapper.getAvgByStuentIdAndApId(record);
    }


}

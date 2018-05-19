package com.gdes.GDES.service.impl;

import com.gdes.GDES.dao.AbilitypointMapper;
import com.gdes.GDES.dao.LatestabilityscoreMapper;
import com.gdes.GDES.dao.StudentMapper;
import com.gdes.GDES.model.Abilitypoint;
import com.gdes.GDES.model.Latestabilityscore;
import com.gdes.GDES.model.LatestabilityscoreExample;
import com.gdes.GDES.model.Student;
import com.gdes.GDES.service.LatestabilityscoreService;
import com.gdes.GDES.service.StudentService;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class LatestabilityscoreServiceImpl implements LatestabilityscoreService{

    @Resource
    private LatestabilityscoreMapper latestabilityscoreMapper;

    @Resource
    private AbilitypointMapper abilitypointMapper;

    @Resource
    private StudentMapper studentMapper;

    public int addLatestabilityscore(Latestabilityscore latestabilityscore) throws Exception {
        return latestabilityscoreMapper.insert(latestabilityscore);
    }

    public List<Latestabilityscore> queryByStudentId(String sid) throws Exception {
        LatestabilityscoreExample example = new LatestabilityscoreExample();
        LatestabilityscoreExample.Criteria criteria = example.createCriteria();
        criteria.andIdSEqualTo(sid);
        example.setOrderByClause("id_s ASC");
        List<Latestabilityscore> latestabilityscores = latestabilityscoreMapper.selectByExample(example);

        for(Latestabilityscore las : latestabilityscores) {
            Abilitypoint abilitypoint = abilitypointMapper.selectByPrimaryKey(las.getIdAp());
            las.setAbilitypoint(abilitypoint);
            Student student = studentMapper.selectByPrimaryKey(las.getIdS());
            las.setStudent(student);
        }

        return latestabilityscores;
    }

    public long queryStudentByStudentId(String sid) throws Exception {
        LatestabilityscoreExample example = new LatestabilityscoreExample();
        LatestabilityscoreExample.Criteria criteria = example.createCriteria();
        criteria.andIdSEqualTo(sid);
        return latestabilityscoreMapper.countByExample(example);
    }

    public List<Integer> getAbilityPointIdList(String sid) throws Exception {
        return latestabilityscoreMapper.getAbilityPointId(sid);
    }

    public int updateAbilityScoreByStudentId(Latestabilityscore las) throws Exception {
        return latestabilityscoreMapper.updateByPrimaryKey(las);
    }

    public List<Latestabilityscore> getListByMajorId(String mid) throws Exception {
        List<String> strlist = studentMapper.studentIdListByMajorId(mid);
        LatestabilityscoreExample example = new LatestabilityscoreExample();
        LatestabilityscoreExample.Criteria criteria = example.createCriteria();
        criteria.andIdSIn(strlist);
        List<Latestabilityscore> latestabilityscores = latestabilityscoreMapper.selectByExample(example);
        for(Latestabilityscore la: latestabilityscores) {
            String ids = la.getIdS();
            Student student = studentMapper.selectByPrimaryKey(ids);
            Integer idap = la.getIdAp();
            Abilitypoint abilitypoint = abilitypointMapper.selectByPrimaryKey(idap);
            la.setStudent(student);
            la.setAbilitypoint(abilitypoint);
        }
        return latestabilityscores;
    }
}

package com.gdes.GDES.service.impl;

import com.gdes.GDES.model.Knowledgepoint;
import com.gdes.GDES.model.KnowledgepointExample;
import com.gdes.GDES.service.KnowledgepointService;
import com.gdes.GDES.dao.KnowledgepointMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * 知识点实现，
 * 根据课程查询知识点
 * 修改知识点
 * 删除知识点
 * 更新知识点
 * Created by Allen on 2018/5/10.
 */
@Repository
public class KonwledgepointServiceImpl implements KnowledgepointService {

    @Resource
    private KnowledgepointMapper kpm;

    public List<Knowledgepoint> queryAllKonwledgepoint(String id_c) throws Exception {
        KnowledgepointExample kpe=new KnowledgepointExample();
        KnowledgepointExample.Criteria criteria=kpe.createCriteria();
        criteria.andIdCEqualTo("2");

        List<Knowledgepoint> list=kpm.selectByExample(kpe);

        return list;
    }

    public String addKonwledgepoint(Knowledgepoint kp) throws Exception {
        if(kpm.insert(kp)>0)
            return "添加成功";
        else
            return "添加失败";
    }

    public String updateKonwledgepoint(Knowledgepoint kp) throws Exception {
        if(kpm.updateByPrimaryKeySelective(kp)>0)
            return "修改成功";
        else
            return "修改失败";
    }

    public String deleteKonwledgepoint(Knowledgepoint kp) throws Exception {
        if(kpm.deleteByPrimaryKey(kp.getIdKp())>0)
            return "删除成功";
        else
            return "删除失败";
    }
}

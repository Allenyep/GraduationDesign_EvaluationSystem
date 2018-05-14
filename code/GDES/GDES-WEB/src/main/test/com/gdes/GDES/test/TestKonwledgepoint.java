package com.gdes.GDES.test;

import com.gdes.GDES.model.Knowledgepoint;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gdes.GDES.model.KnowledgepointExample;
import com.gdes.GDES.dao.KnowledgepointMapper;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Allen on 2018/5/10.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:config/applicationContext.xml")
public class TestKonwledgepoint {
    @Resource
    private KnowledgepointMapper kpm;

    @Test
    public void testFindKonwledgepoint(){
        KnowledgepointExample kpe=new KnowledgepointExample();
        kpe.setOrderByClause("id_kp asc");
        kpe.setDistinct(false);
        KnowledgepointExample.Criteria criteria=kpe.createCriteria();
        criteria.andIdCIsNotNull();
        List<Knowledgepoint> list=kpm.selectByExample(kpe);

//        System.out.println(list);
        for(Knowledgepoint kp:list){
            System.out.println(kp.getNameKp());
        }
    }

    //模糊查询
    @Test
    public void findKonwledgepoint()throws Exception{
        KnowledgepointExample kpe=new KnowledgepointExample();
        KnowledgepointExample.Criteria criteria=kpe.createCriteria();
        criteria.andIdCEqualTo("2");

        List<Knowledgepoint> list=kpm.selectByExample(kpe);
        for(Knowledgepoint kp:list){
            System.out.println(kp.getNameKp());
        }
    }

    //添加测试
    @Test
    public void addKonwledgepoint(){
        Knowledgepoint kp=new Knowledgepoint();
        kp.setIdC("2");
        kp.setIdAp(4);
        kp.setNameKp("数组的抽象思维");
        kp.setProportionKp("0.2");

        //
        kpm.insert(kp);
    }

    @Test
    public void updateKonwledgepoint(){
        Knowledgepoint kp=new Knowledgepoint();
        kp.setIdKp(3);
        kp.setProportionKp("0.01");


        kpm.updateByPrimaryKeySelective(kp);
    }
}

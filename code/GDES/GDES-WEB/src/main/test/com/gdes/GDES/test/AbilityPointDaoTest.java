package com.gdes.GDES.test;

import com.gdes.GDES.dao.AbilityPointDao;
import com.gdes.GDES.model.AbilityPoint;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:config/applicationContext.xml")
public class AbilityPointDaoTest {
    @Resource
    private AbilityPointDao abilityPointDao;

    @Test
    public void getAbilityPointById() {
        AbilityPoint abilityPoint = abilityPointDao.getAbilityPointById(1);
        System.out.print(abilityPoint.getName_ap());
    }
}

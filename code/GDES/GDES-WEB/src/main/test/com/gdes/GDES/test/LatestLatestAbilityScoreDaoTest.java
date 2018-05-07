package com.gdes.GDES.test;

import com.gdes.GDES.dao.LatestAbilityScoreDao;
import com.gdes.GDES.model.LatestAbilityScore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * 测试
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:config/applicationContext.xml")
public class LatestLatestAbilityScoreDaoTest {
    @Resource
    private LatestAbilityScoreDao latestAbilityScoreDao;

    @Test
    public void testGetAbilityScoreListById() {
        List<LatestAbilityScore> latestAbilityScores = latestAbilityScoreDao.getAbilityScoreListById("631406010102");
        for(LatestAbilityScore a: latestAbilityScores) {
            System.out.println(a.getScore_las());
        }
    }

}

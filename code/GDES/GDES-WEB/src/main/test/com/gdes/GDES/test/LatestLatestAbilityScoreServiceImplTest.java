package com.gdes.GDES.test;

import com.gdes.GDES.model.LatestAbilityScore;
import com.gdes.GDES.service.LatestAbilityScoreService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 96906 on 2018/5/3.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:config/applicationContext.xml")
public class LatestLatestAbilityScoreServiceImplTest {
    @Resource
    private LatestAbilityScoreService latestAbilityScoreService;

    @Test
    public void testGetAbilityScoreListById() {
        List<LatestAbilityScore> latestAbilityScores = latestAbilityScoreService.getAbilityScoreListById("631406010102");
        for(LatestAbilityScore a: latestAbilityScores) {
            System.out.println(a.getScore_las());
        }
    }
}

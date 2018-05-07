package com.gdes.GDES.test;

import com.gdes.GDES.dao.ScoreDetailDao;
import com.gdes.GDES.model.LatestAbilityScore;
import com.gdes.GDES.model.ScoreDetail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:config/applicationContext.xml")
public class ScoreDetailDaoTest {
    @Resource
    private ScoreDetailDao scoreDetailDao;

    @Test
    public void testGetScoreDetailListByAbilityId() {
        LatestAbilityScore latestAbilityScore = new LatestAbilityScore();
        latestAbilityScore.setId_s("631406010102");
        latestAbilityScore.setId_ap(1);
        List<ScoreDetail> scoreDetails = scoreDetailDao.getScoreDetailListByAbilityId(latestAbilityScore);
        for(ScoreDetail s: scoreDetails) {
            System.out.println(s.getScore_sd());
            System.out.println(s.getTime_sd());
        }
    }

}

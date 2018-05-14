import com.gdes.GDES.dao.ScoredetailMapper;
import com.gdes.GDES.model.Scoredetail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:config/applicationContext.xml")
public class TestScoredetail {
    @Resource
    private ScoredetailMapper scoredetailMapper;

    @Test
    public void testInsert(){
        Scoredetail scoredetail = new Scoredetail();
        scoredetail.setIdEr("ssss");
        scoredetail.setIdT("1");
        scoredetail.setIdS("631406010217");
        scoredetail.setIdQ("1");
        scoredetail.setIdAp(2);
        scoredetail.setScoreSd("1");
        scoredetail.setTimeSd("2018-04-15 10:12:10");
        scoredetailMapper.insert(scoredetail);
    }

    @Test
    public void testGetArrayApId() {
        List<Integer> integerList = scoredetailMapper.getApIdNotRepeat("631406010217");
        for(int i=0;i<integerList.size();i++) {
            System.out.println(integerList.get(i));
        }
    }

    @Test
    public void testGetAvgByStuentIdAndApId() {
        Scoredetail scoredetail = new Scoredetail();
        scoredetail.setIdS("631406010217");
        scoredetail.setIdAp(2);
        String s = scoredetailMapper.getAvgByStuentIdAndApId(scoredetail);
        System.out.println(s);
    }
}

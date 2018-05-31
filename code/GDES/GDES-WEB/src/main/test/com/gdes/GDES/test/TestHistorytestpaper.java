import com.gdes.GDES.service.HistorytestpaperService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * 测试历史试卷
 * Created by Allen on 2018/5/30.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:config/applicationContext.xml")
public class TestHistorytestpaper {
    @Resource
    private HistorytestpaperService htps;

    @Test
    public void testupdateByIdErandIdQ()throws Exception{
//        String idEr, String idQ,String scoreHtp
        String str=htps.updateByIdErandIdQ("f2678888226c4ca885d357b900fa8f96","2","10");
        System.out.println(str);
    }
}

import com.gdes.GDES.model.Historytestpaper;
import com.gdes.GDES.service.HistorytestpaperService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:config/applicationContext.xml")
public class TestHistorytestpaper {

    @Resource
    private HistorytestpaperService historytestpaperService;

    @Test
    public void testQueryQuestionByIdQandIdEr() throws Exception {
        List<Historytestpaper> historytestpapers = historytestpaperService.queryQuestionByIdQandIdEr("1", "ssss");
        System.out.println(historytestpapers.get(0).getIdS());
        System.out.println(historytestpapers.get(0).getAnswerHtp());
    }
}

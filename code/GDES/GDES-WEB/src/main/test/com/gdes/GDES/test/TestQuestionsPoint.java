import com.gdes.GDES.model.Questionspoint;
import com.gdes.GDES.service.QuestionspointService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 96906 on 2018/5/10.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:config/applicationContext.xml")
public class TestQuestionsPoint {
    @Resource
    private QuestionspointService questionspointService;

    @Test
    public void testQueryByQuestionId() throws Exception {
        List<Questionspoint> questionspointList = questionspointService.queryByQuestionId("1");
        for(Questionspoint qp:questionspointList) {
            System.out.println(qp.getProportionQp());
        }
    }
}

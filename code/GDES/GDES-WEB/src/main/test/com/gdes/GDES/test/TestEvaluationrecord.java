import com.gdes.GDES.model.Evaluationrecord;
import com.gdes.GDES.service.EvaluationrecordService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Allen on 2018/5/21.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:config/applicationContext.xml")
public class TestEvaluationrecord {
    @Resource
    private EvaluationrecordService ers;

    //测试待批改试题列表
    @Test
    public void testquerypigai()throws Exception{
        List<Evaluationrecord> list= ers.queryByendErIsNull("1");
        for(Evaluationrecord er:list){
            System.out.println(er.getIdEr());
        }
    }

    @Test
    public void testupdatepigai()throws Exception{
        String str=ers.updateEvaluationrecordByIdEr("f2678888226c4ca885d357b900fa8f96");
        System.out.println(str);
    }

}

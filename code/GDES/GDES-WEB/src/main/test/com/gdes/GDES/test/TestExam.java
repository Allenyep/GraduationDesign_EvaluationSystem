import com.gdes.GDES.model.Historytestpaper;
import com.gdes.GDES.model.Questions;
import com.gdes.GDES.model.Questionsoption;
import com.gdes.GDES.model.utils.Exam;
import com.gdes.GDES.service.HistorytestpaperService;
import com.gdes.GDES.service.QuestionsService;
import com.gdes.GDES.service.QuestionsoptionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * 出题测试
 * Created by Allen on 2018/5/20.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:config/applicationContext.xml")
public class TestExam {
    @Resource
    private HistorytestpaperService htps;

    @Resource
    private QuestionsService qs;

    @Resource
    private QuestionsoptionService qos;

    @Test
    public void TestExamlianxi()throws Exception{
        List<Questions> qlist=qs.queryAllQusetion();
        List<Questions> res;
        List<Historytestpaper> htplist=htps.queryByStudentid("631404090425");

        res= Exam.Examlianxi(qlist,htplist);


        for(Questions q:res){
            if(q.getStyleQ().equals("1")){
                q.setQuestionsO(qos.queryByidQ(q.getIdQ()));
            }
            if(q.getQuestionsO()!=null){
                System.out.println(q.getContextQ());
                System.out.println(q.getAnswerQ());
                for(Questionsoption qo:q.getQuestionsO()){
                    System.out.println(qo.getContextO());
                }
            }
        }

    }
}

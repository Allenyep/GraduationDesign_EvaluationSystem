import com.gdes.GDES.model.Postabilitypoint;
import com.gdes.GDES.service.PostabilitypointService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:config/applicationContext.xml")
public class TestPostabilitypoint {
    @Resource
    private PostabilitypointService postabilitypointService;

    @Test
    public void getListByPId() throws Exception {
        List<Postabilitypoint> postabilitypointList = postabilitypointService.getListByPId(1);
        for(Postabilitypoint pa: postabilitypointList) {
            System.out.println(pa.getIdP());
            System.out.println(pa.getIdAp());
            System.out.println(pa.getPost().getNameP());
        }
    }
}

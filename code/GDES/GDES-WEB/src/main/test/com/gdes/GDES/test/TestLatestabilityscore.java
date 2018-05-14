import com.gdes.GDES.service.LatestabilityscoreService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 96906 on 2018/5/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:config/applicationContext.xml")
public class TestLatestabilityscore {

    @Resource
    private LatestabilityscoreService latestabilityscoreService;

    @Test
    public void testQueryStudentByStudentId() throws Exception {
        System.out.println(latestabilityscoreService.queryStudentByStudentId("631406010217"));
    }

    @Test
    public void testGetAbilityPointIdList() throws Exception {
        List<Integer> list = latestabilityscoreService.getAbilityPointIdList("631406010217");
        for(int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        }
    }

}

import com.gdes.GDES.model.Latestabilityscore;
import com.gdes.GDES.service.LatestabilityscoreService;
import com.gdes.GDES.service.StudentService;
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
    public void testQueryByStudentId() throws Exception {
        List<Latestabilityscore> latestabilityscores =
                latestabilityscoreService.queryByStudentId("631406010102");
        for(Latestabilityscore la:latestabilityscores) {
            System.out.println(la.getIdS());
            System.out.println(la.getStudent().getNameS());
            System.out.println(la.getIdAp());
            System.out.println(la.getAbilitypoint().getNameAp());
            System.out.println(la.getScoreLas());
            System.out.println(la.getTimeLas());
            System.out.println();
        }
    }

    @Test
    public void testGetAbilityPointIdList() throws Exception {
        List<Integer> list = latestabilityscoreService.getAbilityPointIdList("631406010217");
        for(int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        }
    }

    @Test
    public void testGetListByMajorId() throws Exception {
        List<Latestabilityscore> latestabilityscores =
                latestabilityscoreService.getListByMajorId("01");
        for(Latestabilityscore la:latestabilityscores) {
            System.out.println(la.getStudent().getNameS());
            System.out.println(la.getAbilitypoint().getNameAp());
            System.out.println(la.getScoreLas());
            System.out.println(la.getTimeLas());
            System.out.println();
        }
    }

}

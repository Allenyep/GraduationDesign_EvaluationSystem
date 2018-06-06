import com.gdes.GDES.model.Studentpost;
import com.gdes.GDES.service.StudentpostService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:config/applicationContext.xml")
public class TestStudentPost {

    @Resource
    private StudentpostService studentpostService;

    @Test
    public void testAddStudentpost() throws Exception {
        Studentpost sp = new Studentpost();
        sp.setIdS("631406010217");
        sp.setIdP(1);
        sp.setScoreSp("50");
        sp.setTimeSp("451155");
        studentpostService.addStudentpost(sp);
    }

    @Test
    public void testGetListByStudentId() throws Exception {
        List<Studentpost> studentpostList =
                studentpostService.getListByStudentId("631406010102");
        for(Studentpost sp:studentpostList) {
            System.out.println(sp.getIdS());
            System.out.println(sp.getStudent().getNameS());
            System.out.println(sp.getPost().getNameP());
            System.out.println(sp.getScoreSp());
            System.out.println(sp.getTimeSp());
            System.out.println();
        }
    }

    @Test
    public void testGetCountByStudentId() throws Exception {
        System.out.println(studentpostService.getCountByStudentId("631406010217"));
    }

    @Test
    public void testGetListByMajorId() throws Exception {
        List<Studentpost> studentpostList =
                studentpostService.getListByMajorId("01");
        for(Studentpost sp:studentpostList) {
            System.out.println(sp.getStudent().getNameS());
            System.out.println(sp.getPost().getNameP());
            System.out.println(sp.getScoreSp());
            System.out.println(sp.getTimeSp());
            System.out.println();
        }
    }
}

import com.gdes.GDES.dao.ProfessionalabilitypointrequirementsMapper;
import com.gdes.GDES.model.Professionalabilitypointrequirements;
import com.gdes.GDES.model.ProfessionalabilitypointrequirementsExample;
import com.gdes.GDES.service.ProfessionalabilitypointrequirementsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:config/applicationContext.xml")
public class TestProfessionalabilitypointrequirements {

    @Resource
    private ProfessionalabilitypointrequirementsService professionalabilitypointrequirementsService;

    @Resource
    private ProfessionalabilitypointrequirementsMapper professionalabilitypointrequirementsMapper;

    @Test
    public void testQueryByMajorBId() throws Exception {
        ProfessionalabilitypointrequirementsExample example = new ProfessionalabilitypointrequirementsExample();
        ProfessionalabilitypointrequirementsExample.Criteria criteria = example.createCriteria();
        criteria.andIdMbEqualTo(2);
        List<Professionalabilitypointrequirements> professionalabilitypointrequirements =
                professionalabilitypointrequirementsMapper.selectByExample(example);
        for(Professionalabilitypointrequirements p:professionalabilitypointrequirements) {
            System.out.println(p.getConversionratioPapr());
        }

    }

}

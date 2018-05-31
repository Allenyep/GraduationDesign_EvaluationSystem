import com.gdes.GDES.model.Abilitypoint;
import com.gdes.GDES.service.AbilityPointService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 96906 on 2018/5/22.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:config/applicationContext.xml")
public class TestAbilityPoint {
    @Resource
    private AbilityPointService abilityPointService;

    @Test
    public void testQueryAll() throws Exception {
        List<Abilitypoint> abilitypoints = abilityPointService.queryAll();
        for(Abilitypoint a: abilitypoints) {
            System.out.println(a.getIdAp());
            System.out.println(a.getNameAp());
        }
    }
}

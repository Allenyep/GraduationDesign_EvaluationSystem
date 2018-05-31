import com.gdes.GDES.model.User;
import com.gdes.GDES.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by 96906 on 2018/5/30.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:config/applicationContext.xml")
public class TestUser {

    @Resource
    private UserService userService;

    @Test
    public void testGetUser() {
        User user = userService.getUserByUserName("001");
        System.out.println(user.getUsername());
    }
}

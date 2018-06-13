import com.gdes.GDES.dao.PermissionMapper;
import com.gdes.GDES.model.Permission;
import com.gdes.GDES.model.Post;
import com.gdes.GDES.service.PermissionService;
import com.gdes.GDES.service.PostService;
import com.gdes.GDES.service.impl.PermissionServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author xiyifen
 * @date 2018/6/9 10:27
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:config/applicationContext.xml")
public class TestMenu {
    @Resource
    private PermissionService permissionService;
    @Resource
    private PermissionMapper permissionMapper;

    @Test
    public void testPermission() throws Exception {
//        PermissionServiceImpl permissionService =new PermissionServiceImpl();
//        List<Permission> permissions=permissionMapper.selectPermission();
//        List<Permission> permission0=permissionService.getFirstPermissions(permissions);
//        Permission permission=new Permission();
//        permission.setChildMenu(permission0);
//        System.out.println(permission.getMenuname());
//        System.out.println(permission.getChildMenu());
    }


}

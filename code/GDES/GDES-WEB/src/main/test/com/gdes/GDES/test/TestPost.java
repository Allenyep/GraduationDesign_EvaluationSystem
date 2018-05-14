import com.gdes.GDES.model.Post;
import com.gdes.GDES.service.PostService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:config/applicationContext.xml")
public class TestPost {
    @Resource
    private PostService postService;

    @Test
    public void testQueryById() throws Exception {
        Post posts = postService.queryById(1);
        System.out.println(posts.getIdP());
        System.out.println(posts.getNameP());
    }

    @Test
    public void testGetCount() throws Exception {
        System.out.println(postService.getCount());
    }
}

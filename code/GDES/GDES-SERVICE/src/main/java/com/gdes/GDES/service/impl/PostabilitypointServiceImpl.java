package com.gdes.GDES.service.impl;

import com.gdes.GDES.dao.PostMapper;
import com.gdes.GDES.dao.PostabilitypointMapper;
import com.gdes.GDES.model.Post;
import com.gdes.GDES.model.Postabilitypoint;
import com.gdes.GDES.model.PostabilitypointExample;
import com.gdes.GDES.service.PostabilitypointService;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class PostabilitypointServiceImpl implements PostabilitypointService{

    @Resource
    private PostabilitypointMapper postabilitypointMapper;

    @Resource
    private PostMapper postMapper;

    public List<Postabilitypoint> getListByPId(Integer pid) throws Exception {
        PostabilitypointExample example = new PostabilitypointExample();
        PostabilitypointExample.Criteria criteria = example.createCriteria();
        criteria.andIdPEqualTo(pid);
        List<Postabilitypoint> postabilitypointList = postabilitypointMapper.selectByExample(example);
        for(Postabilitypoint pa:postabilitypointList) {
            Post post = postMapper.selectByPrimaryKey(pa.getIdP());
            pa.setPost(post);
        }
        return postabilitypointList;
    }
}

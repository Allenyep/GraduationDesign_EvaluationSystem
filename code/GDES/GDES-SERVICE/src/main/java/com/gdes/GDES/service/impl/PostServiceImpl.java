package com.gdes.GDES.service.impl;

import com.gdes.GDES.dao.PostMapper;
import com.gdes.GDES.model.Post;
import com.gdes.GDES.model.PostExample;
import com.gdes.GDES.service.PostService;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class PostServiceImpl implements PostService {

    @Resource
    private PostMapper postMapper;

    public Post queryById(Integer pid) throws Exception {
        return postMapper.selectByPrimaryKey(pid);
    }

    public long getCount() throws Exception {
        PostExample example = new PostExample();
        PostExample.Criteria criteria = example.createCriteria();
        criteria.andIdPIsNotNull();
        return postMapper.countByExample(example);
    }
}

package com.gdes.GDES.service.impl;

import com.gdes.GDES.dao.PostMapper;
import com.gdes.GDES.dao.StudentMapper;
import com.gdes.GDES.dao.StudentpostMapper;
import com.gdes.GDES.model.Post;
import com.gdes.GDES.model.Studentpost;
import com.gdes.GDES.model.StudentpostExample;
import com.gdes.GDES.service.StudentpostService;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class StudentpostServiceImpl implements StudentpostService {

    @Resource
    private StudentpostMapper studentpostMapper;

    @Resource
    private PostMapper postMapper;

    public int addStudentpost(Studentpost sp) throws Exception {
        return studentpostMapper.insert(sp);
    }

    public List<Studentpost> getListByStudentId(String sid) throws Exception {
        StudentpostExample example = new StudentpostExample();
        StudentpostExample.Criteria criteria = example.createCriteria();
        criteria.andIdSEqualTo(sid);
        List<Studentpost> studentpostList = studentpostMapper.selectByExample(example);
        for(Studentpost sp: studentpostList) {
            Post post = postMapper.selectByPrimaryKey(sp.getIdP());
            sp.setPost(post);
        }
        return studentpostList;
    }

    public long getCountByStudentId(String sid) throws Exception {
        StudentpostExample example = new StudentpostExample();
        StudentpostExample.Criteria criteria = example.createCriteria();
        criteria.andIdSEqualTo(sid);
        return studentpostMapper.countByExample(example);
    }

    public int updateStudentPost(Studentpost studentpost) throws Exception {
        return studentpostMapper.updateByPrimaryKey(studentpost);
    }
}

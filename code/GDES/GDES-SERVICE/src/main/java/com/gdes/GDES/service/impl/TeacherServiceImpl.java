package com.gdes.GDES.service.impl;

import com.gdes.GDES.dao.TeacherMapper;
import com.gdes.GDES.model.Teacher;
import com.gdes.GDES.model.TeacherExample;
import com.gdes.GDES.service.TeacherService;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Allen on 2018/5/11.
 */
@Repository
public class TeacherServiceImpl implements TeacherService{

    @Resource
    private TeacherMapper teacherMapper;

    public Teacher getTeacherById(String id_t) {
        return teacherMapper.selectByPrimaryKey(id_t);
    }

    public List<Teacher> getTeacherByMajorId(String id_m) {
        TeacherExample example = new TeacherExample();
        TeacherExample.Criteria criteria = example.createCriteria();
        criteria.andIdMEqualTo(id_m);
        return teacherMapper.selectByExample(example);
    }
}

package com.gdes.GDES.service.impl;

import com.gdes.GDES.dao.TeacherMapper;
import com.gdes.GDES.model.Teacher;
import com.gdes.GDES.service.TeacherService;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

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
}

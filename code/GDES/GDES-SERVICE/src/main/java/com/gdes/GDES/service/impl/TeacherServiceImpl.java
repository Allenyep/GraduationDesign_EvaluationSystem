package com.gdes.GDES.service.impl;

import com.gdes.GDES.dao.TeacherDao;
import com.gdes.GDES.model.Teacher;
import com.gdes.GDES.service.TeacherService;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class TeacherServiceImpl implements TeacherService {
    @Resource
    private TeacherDao teacherDao;
    /**
     * 根据教师Id查询教师信息
     * @param id_t
     * @return
     */
    public Teacher getTeacherById(String id_t) {
        return teacherDao.getTeacherById(id_t);
    }
}

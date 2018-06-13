package com.gdes.GDES.service;


import com.gdes.GDES.model.Teacher;

import java.util.List;

public interface TeacherService {
    /**
     * 根据教师Id查询教师信息
     * @param id_t
     * @return
     */
    public Teacher getTeacherById(String id_t);

    public List<Teacher> getTeacherByMajorId(String id_m);
}

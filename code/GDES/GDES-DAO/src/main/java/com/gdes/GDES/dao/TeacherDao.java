package com.gdes.GDES.dao;

import com.gdes.GDES.model.Teacher;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherDao {
    /**
     * 根据教师Id查询教师信息
     * @param id_t
     * @return
     */
    public Teacher getTeacherById(String id_t);
}

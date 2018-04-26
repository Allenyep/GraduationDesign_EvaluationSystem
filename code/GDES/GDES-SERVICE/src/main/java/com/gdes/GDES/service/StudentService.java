package com.gdes.GDES.service;

import com.gdes.GDES.model.Student;
import com.gdes.GDES.model.utils.ResultVo;

/**
 * Created by Allen on 2018/4/26.
 */
public interface StudentService {
    /**
     * 添加学生
     * @param student
     * @return
     */
    Boolean addStudent(Student student);

    /**
     * 根据ID删除学生
     * @param id
     * @return
     */
    Boolean deleteStudentById(Integer id);

    /**
     * 根据ID修改学生信息
     * @param student
     * @return
     */
    Boolean updateStudentById(Student student);

    /**
     * 按条件查找所有学生
     * @param student
     * @return
     */
    ResultVo findAllStudent(Student student);
}

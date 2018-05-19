package com.gdes.GDES.service;

import com.gdes.GDES.model.Student;

import java.util.List;

/**
 * 学生业务
 */
public interface StudentService {
    /**
     * 得到一个专业下的全部学生id
     * @param mid
     * @return
     */
    public List<String> getStudentIdListByMajorId(String mid) throws Exception;

    /**
     * 查找学生
     * @param sid
     * @return
     * @throws Exception
     */
    public Student queryStudentById(String sid) throws Exception;
}

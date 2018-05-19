package com.gdes.GDES.service.impl;

import com.gdes.GDES.dao.MajorMapper;
import com.gdes.GDES.dao.StudentMapper;
import com.gdes.GDES.model.Major;
import com.gdes.GDES.model.Student;
import com.gdes.GDES.service.StudentService;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class StudentServiceImpl implements StudentService{

    @Resource
    private StudentMapper studentMapper;

    @Resource
    private MajorMapper majorMapper;

    public List<String> getStudentIdListByMajorId(String mid) {
        return studentMapper.studentIdListByMajorId(mid);
    }

    public Student queryStudentById(String sid) throws Exception {
        Student student = studentMapper.selectByPrimaryKey(sid);
        Major major = majorMapper.selectByPrimaryKey(student.getIdM());
        student.setMajor(major);
        return student;
    }
}

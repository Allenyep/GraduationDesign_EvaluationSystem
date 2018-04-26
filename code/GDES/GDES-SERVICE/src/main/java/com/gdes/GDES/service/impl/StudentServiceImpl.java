package com.gdes.GDES.service.impl;

import com.gdes.GDES.dao.StudentDao;
import com.gdes.GDES.model.Student;
import com.gdes.GDES.model.utils.ResultVo;
import com.gdes.GDES.service.StudentService;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 * Created by Allen on 2018/4/26.
 */
@Repository
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDao studentDao;

    public Boolean addStudent(Student student) {
        return studentDao.insert(student);
    }

    public Boolean deleteStudentById(Integer id) {
        Student student=new Student();
        student.setId(id);
        return studentDao.delete(student);
    }

    public Boolean updateStudentById(Student student) {
        return studentDao.update(student);
    }


    public ResultVo findAllStudent(Student student) {
        ResultVo resultVo=new ResultVo();
        List<Student> list= studentDao.select(student);
        if (list.size()>0){
            resultVo.setResult(list);
            resultVo.isSuccess(true);
        }else {resultVo.setMessage("没有找到相关信息");}
        return resultVo;
    }
}

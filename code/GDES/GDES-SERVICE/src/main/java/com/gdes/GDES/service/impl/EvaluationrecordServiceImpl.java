package com.gdes.GDES.service.impl;

import com.gdes.GDES.dao.EvaluationrecordMapper;
import com.gdes.GDES.dao.StudentMapper;
import com.gdes.GDES.dao.TeacherMapper;
import com.gdes.GDES.model.Evaluationrecord;
import com.gdes.GDES.model.EvaluationrecordExample;
import com.gdes.GDES.model.Student;
import com.gdes.GDES.model.Teacher;
import com.gdes.GDES.service.EvaluationrecordService;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class EvaluationrecordServiceImpl implements EvaluationrecordService {

    @Resource
    private EvaluationrecordMapper evaluationrecordMapper;

    @Resource
    private StudentMapper studentMapper;

    @Resource
    private TeacherMapper teacherMapper;

    public List<Evaluationrecord> getListInStudentIdList(String mid) throws Exception {
        List<String> sidlist = studentMapper.studentIdListByMajorId(mid);
        EvaluationrecordExample example = new EvaluationrecordExample();
        EvaluationrecordExample.Criteria criteria = example.createCriteria();
        criteria.andIdSIn(sidlist);
        criteria.andEndErIsNotNull();
        List<Evaluationrecord> evaluationrecords = evaluationrecordMapper.selectByExample(example);
        for(Evaluationrecord er:evaluationrecords) {
            Student student = studentMapper.selectByPrimaryKey(er.getIdS());
            er.setStudent(student);
            Teacher teacher = teacherMapper.selectByPrimaryKey(er.getIdT());
            er.setTeacher(teacher);
        }
        return evaluationrecords;
    }

    public List<Evaluationrecord> evaluateList(String sid) throws Exception {
        EvaluationrecordExample example = new EvaluationrecordExample();
        EvaluationrecordExample.Criteria criteria = example.createCriteria();
        criteria.andBeginErIsNotNull();
        criteria.andEndErIsNotNull();
        criteria.andIdSEqualTo(sid);
        example.setOrderByClause("begin_er DESC");
        List<Evaluationrecord> evaluationrecords = evaluationrecordMapper.selectByExample(example);
        return evaluationrecords;
    }

    public List<Evaluationrecord> practiseList(String sid) throws Exception {
        EvaluationrecordExample example = new EvaluationrecordExample();
        EvaluationrecordExample.Criteria criteria = example.createCriteria();
        criteria.andBeginErIsNull();
        criteria.andEndErIsNull();
        criteria.andIdSEqualTo(sid);
        List<Evaluationrecord> evaluationrecords = evaluationrecordMapper.selectByExample(example);
        return evaluationrecords;
    }
}

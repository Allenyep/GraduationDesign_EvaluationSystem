package com.gdes.GDES.service.impl;

import com.gdes.GDES.dao.EvaluationrecordMapper;
import com.gdes.GDES.dao.StudentMapper;
import com.gdes.GDES.dao.TeacherMapper;
import com.gdes.GDES.model.*;
import com.gdes.GDES.model.utils.UUid;
import com.gdes.GDES.service.EvaluationrecordService;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Repository
public class EvaluationrecordServiceImpl implements EvaluationrecordService {


    @Resource
    private EvaluationrecordMapper evaluationrecordMapper;

    @Resource
    private StudentMapper studentMapper;

    @Resource
    private TeacherMapper teacherMapper;

    public List<Evaluationrecord> getListByErId(String erid) throws Exception {
        EvaluationrecordExample example = new EvaluationrecordExample();
        EvaluationrecordExample.Criteria criteria = example.createCriteria();
        criteria.andIdErEqualTo(erid);
        return evaluationrecordMapper.selectByExample(example);
    }

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

    public List<Evaluationrecord> evaluateListByIdT(String tid) throws Exception {
        EvaluationrecordExample example = new EvaluationrecordExample();
        EvaluationrecordExample.Criteria criteria = example.createCriteria();
        criteria.andIdTEqualTo(tid);
        List<Evaluationrecord> evaluationrecordList = evaluationrecordMapper.selectByExample(example);
        for(Evaluationrecord er: evaluationrecordList) {
            Student student = studentMapper.selectByPrimaryKey(er.getIdS());
            er.setStudent(student);
        }
        return evaluationrecordList;
    }

    public List<Evaluationrecord> correctList(String tid) throws Exception {
        EvaluationrecordExample example = new EvaluationrecordExample();
        EvaluationrecordExample.Criteria criteria = example.createCriteria();
        criteria.andIdTEqualTo(tid);
        criteria.andEndErIsNotNull();
        return evaluationrecordMapper.selectByExample(example);
    }

    public List<Evaluationrecord> notCorrectList(String tid) throws Exception {
        EvaluationrecordExample example = new EvaluationrecordExample();
        EvaluationrecordExample.Criteria criteria = example.createCriteria();
        criteria.andIdTEqualTo(tid);
        criteria.andEndErIsNull();
        return evaluationrecordMapper.selectByExample(example);
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

    public String addEvaluationrecord(String idS, String idT) throws Exception {
        //根据教师，学生编号插入测评记录
        Evaluationrecord er=new Evaluationrecord();
        er.setIdS(idS);
        er.setIdT(idT);
        er.setIdEr(UUid.getUUID());
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
        String timestr=formatter.format(new Date(System.currentTimeMillis()));
        er.setBeginEr(timestr);

        if(evaluationrecordMapper.insertSelective(er)>0)
            return er.getIdEr();

        return "添加失败";
    }

    public List<Evaluationrecord> queryByendErIsNull(String idT) throws Exception {
        EvaluationrecordExample ere=new EvaluationrecordExample();
        EvaluationrecordExample.Criteria criteria=ere.createCriteria();
        criteria.andIdTEqualTo(idT);
        criteria.andEndErIsNull();
        List<Evaluationrecord> erlist=evaluationrecordMapper.selectByExample(ere);
        return erlist;
    }

    public String updateEvaluationrecordByIdEr(String idEr) throws Exception {
        EvaluationrecordExample ere=new EvaluationrecordExample();
        EvaluationrecordExample.Criteria criteria=ere.createCriteria();
        criteria.andIdErEqualTo(idEr);
        List<Evaluationrecord> erlist=evaluationrecordMapper.selectByExample(ere);
        Evaluationrecord er=erlist.get(0);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
        String timestr=formatter.format(new Date(System.currentTimeMillis()));
        er.setEndEr(timestr);
        if (evaluationrecordMapper.updateByPrimaryKeySelective(er)>0)
            return er.getIdEr();

        return "添加失败";
    }

    public List<Evaluationrecord> queryEvaluationrecordByIdSandEndEr(String idS) throws Exception {
        EvaluationrecordExample ere=new EvaluationrecordExample();
        EvaluationrecordExample.Criteria criteria=ere.createCriteria();
        criteria.andIdSEqualTo(idS);
        criteria.andEndErIsNotNull();

        List<Evaluationrecord> erlist= evaluationrecordMapper.selectByExample(ere);
        return erlist;

    }
}

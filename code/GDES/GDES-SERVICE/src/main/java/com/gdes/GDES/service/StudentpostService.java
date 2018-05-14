package com.gdes.GDES.service;

import com.gdes.GDES.model.Studentpost;

import java.util.List;

public interface StudentpostService {
    /**
     * 插入记录
     * @return
     * @throws Exception
     */
    public int addStudentpost(Studentpost sp) throws Exception;

    /**
     * 根据学生id查询
     * @return
     * @throws Exception
     */
    public List<Studentpost> getListByStudentId(String sid) throws Exception;

    /**
     * 查询是否有该学生
     * @param sid
     * @return
     * @throws Exception
     */
    public long getCountByStudentId(String sid) throws Exception;

    /**
     * 更新
     * @param studentpost
     * @return
     * @throws Exception
     */
    public int updateStudentPost(Studentpost studentpost) throws Exception;
}

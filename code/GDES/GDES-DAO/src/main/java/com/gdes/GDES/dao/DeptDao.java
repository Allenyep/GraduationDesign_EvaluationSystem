package com.gdes.GDES.dao;



import com.gdes.GDES.model.Dept;

import java.util.List;


public interface DeptDao {
    /**
     * 获取部门列表
     * @return
     */
    List<Dept> selectDepts();
}

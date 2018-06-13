package com.gdes.GDES.service;



import com.gdes.GDES.model.Dept;

import java.util.List;


public interface DeptService {
    /**
     * 获取部门列表
     * @return
     */
    List<Dept> selectDepts();
}

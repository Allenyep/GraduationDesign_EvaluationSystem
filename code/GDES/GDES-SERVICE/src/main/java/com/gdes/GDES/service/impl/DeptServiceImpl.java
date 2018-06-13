package com.gdes.GDES.service.impl;


import com.gdes.GDES.dao.DeptDao;
import com.gdes.GDES.model.Dept;
import com.gdes.GDES.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao deptDao;
    /**
     * 获取部门列表
     * @return
     */
    @Override
    public List<Dept> selectDepts() {
        return deptDao.selectDepts();
    }
}

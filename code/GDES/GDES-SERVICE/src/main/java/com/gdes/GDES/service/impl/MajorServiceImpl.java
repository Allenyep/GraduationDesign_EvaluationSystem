package com.gdes.GDES.service.impl;

import com.gdes.GDES.dao.MajorMapper;
import com.gdes.GDES.model.Major;
import com.gdes.GDES.service.MajorService;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class MajorServiceImpl implements MajorService {

    @Resource
    private MajorMapper majorMapper;

    public Major queryByMajorId(String mid) throws Exception {
        return majorMapper.selectByPrimaryKey(mid);
    }
}

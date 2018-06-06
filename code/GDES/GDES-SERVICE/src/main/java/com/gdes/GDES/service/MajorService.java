package com.gdes.GDES.service;

import com.gdes.GDES.model.Major;

public interface MajorService {
    /**
     * 根据id查询
     * @param mid
     * @return
     * @throws Exception
     */
    public Major queryByMajorId(String mid) throws Exception;
}

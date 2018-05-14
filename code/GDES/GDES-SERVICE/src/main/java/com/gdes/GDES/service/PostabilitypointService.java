package com.gdes.GDES.service;

import com.gdes.GDES.model.Postabilitypoint;

import java.util.List;

public interface PostabilitypointService {
    /**
     * 根据岗位id查询
     * @param pid
     * @return
     * @throws Exception
     */
    public List<Postabilitypoint> getListByPId(Integer pid) throws Exception;
}

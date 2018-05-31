package com.gdes.GDES.service;

import com.gdes.GDES.model.Professionalabilitypointrequirements;

import java.util.List;

public interface ProfessionalabilitypointrequirementsService {
    /**
     * 查询某专业的各能力点要求
     * @param mbid
     * @return
     * @throws Exception
     */
    public List<Professionalabilitypointrequirements> queryByMajorBId(Integer mbid) throws Exception;

    /**
     * 查询能力
     * @return
     * @throws Exception
     */
    public List<Professionalabilitypointrequirements> queryAll() throws Exception;
}

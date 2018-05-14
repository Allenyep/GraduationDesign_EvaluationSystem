package com.gdes.GDES.service;

import com.gdes.GDES.model.Professionalabilitypointrequirements;

import java.util.List;

public interface ProfessionalabilitypointrequirementsService {
    public List<Professionalabilitypointrequirements> queryByMajorBId(Integer mbid) throws Exception;
}

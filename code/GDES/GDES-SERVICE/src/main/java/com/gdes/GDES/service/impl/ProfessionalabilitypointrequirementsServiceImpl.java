package com.gdes.GDES.service.impl;

import com.gdes.GDES.dao.ProfessionalabilitypointrequirementsMapper;
import com.gdes.GDES.model.Professionalabilitypointrequirements;
import com.gdes.GDES.model.ProfessionalabilitypointrequirementsExample;
import com.gdes.GDES.service.ProfessionalabilitypointrequirementsService;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class ProfessionalabilitypointrequirementsServiceImpl implements ProfessionalabilitypointrequirementsService{

    @Resource
    private ProfessionalabilitypointrequirementsMapper professionalabilitypointrequirementsMapper;

    public List<Professionalabilitypointrequirements> queryByMajorBId(Integer mbid) throws Exception {
        ProfessionalabilitypointrequirementsExample example = new ProfessionalabilitypointrequirementsExample();
        ProfessionalabilitypointrequirementsExample.Criteria criteria = example.createCriteria();
        criteria.andIdMbEqualTo(mbid);
        return professionalabilitypointrequirementsMapper.selectByExample(example);
    }
}

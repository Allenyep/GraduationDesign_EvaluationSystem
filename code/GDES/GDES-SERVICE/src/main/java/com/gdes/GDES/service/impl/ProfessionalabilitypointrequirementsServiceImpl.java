package com.gdes.GDES.service.impl;

import com.gdes.GDES.dao.AbilitypointMapper;
import com.gdes.GDES.dao.MajorbMapper;
import com.gdes.GDES.dao.ProfessionalabilitypointrequirementsMapper;
import com.gdes.GDES.model.Abilitypoint;
import com.gdes.GDES.model.Majorb;
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

    @Resource
    private AbilitypointMapper abilitypointMapper;

    @Resource
    private MajorbMapper majorbMapper;

    public List<Professionalabilitypointrequirements> queryByMajorBId(Integer mbid) throws Exception {
        ProfessionalabilitypointrequirementsExample example = new ProfessionalabilitypointrequirementsExample();
        ProfessionalabilitypointrequirementsExample.Criteria criteria = example.createCriteria();
        criteria.andIdMbEqualTo(mbid);
        return professionalabilitypointrequirementsMapper.selectByExample(example);
    }

    public List<Professionalabilitypointrequirements> queryAll() throws Exception {
        ProfessionalabilitypointrequirementsExample example = new ProfessionalabilitypointrequirementsExample();
        ProfessionalabilitypointrequirementsExample.Criteria criteria = example.createCriteria();
        criteria.andIdApIsNotNull();
        criteria.andIdMbIsNotNull();
        example.setOrderByClause("id_ap DESC");
        List<Professionalabilitypointrequirements> professionalabilitypointrequirementsList = professionalabilitypointrequirementsMapper.selectByExample(example);
        for(Professionalabilitypointrequirements p: professionalabilitypointrequirementsList) {
            Abilitypoint abilitypoint = abilitypointMapper.selectByPrimaryKey(p.getIdAp());
            p.setAbilitypoint(abilitypoint);
            Majorb majorb = majorbMapper.selectByPrimaryKey(p.getIdMb());
            p.setMajorb(majorb);
        }
        return professionalabilitypointrequirementsList;
    }

}

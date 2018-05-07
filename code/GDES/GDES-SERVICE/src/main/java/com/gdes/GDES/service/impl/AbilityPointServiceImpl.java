package com.gdes.GDES.service.impl;

import com.gdes.GDES.dao.AbilityPointDao;
import com.gdes.GDES.model.AbilityPoint;
import com.gdes.GDES.service.AbilityPointService;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class AbilityPointServiceImpl implements AbilityPointService{
    @Resource
    private AbilityPointDao abilityPointDao;

    public AbilityPoint getAbilityPointById(Integer id_ap) {
        return abilityPointDao.getAbilityPointById(id_ap);
    }
}

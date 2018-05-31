package com.gdes.GDES.service.impl;

import com.gdes.GDES.dao.AbilitypointMapper;
import com.gdes.GDES.model.Abilitypoint;
import com.gdes.GDES.model.AbilitypointExample;
import com.gdes.GDES.service.AbilityPointService;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class AbilityPointServiceImpl implements AbilityPointService{
    @Resource
    private AbilitypointMapper abilitypointMapper;

    public Abilitypoint getAbilityPointById(Integer id_ap) {
        return abilitypointMapper.selectByPrimaryKey(id_ap);
    }

    public List<Abilitypoint> queryAll() throws Exception {
        AbilitypointExample example = new AbilitypointExample();
        AbilitypointExample.Criteria criteria = example.createCriteria();
        criteria.andIdApIsNotNull();
        example.setOrderByClause("id_ap DESC");
        return abilitypointMapper.selectByExample(example);
    }
}

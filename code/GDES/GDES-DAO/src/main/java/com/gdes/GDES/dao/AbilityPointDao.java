package com.gdes.GDES.dao;

import com.gdes.GDES.model.Abilitypoint;
import org.springframework.stereotype.Repository;

@Repository
public interface AbilityPointDao {
    /**
     * 根据id查询
     * @param id_ap
     * @return
     */
    public Abilitypoint getAbilityPointById(Integer id_ap);
}

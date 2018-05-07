package com.gdes.GDES.dao;

import com.gdes.GDES.model.AbilityPoint;
import org.springframework.stereotype.Repository;

@Repository
public interface AbilityPointDao {
    /**
     * 根据id查询
     * @param id_ap
     * @return
     */
    public AbilityPoint getAbilityPointById(Integer id_ap);
}

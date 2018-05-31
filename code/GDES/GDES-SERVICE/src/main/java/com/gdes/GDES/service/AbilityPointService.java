package com.gdes.GDES.service;

import com.gdes.GDES.model.Abilitypoint;

import java.util.List;

public interface AbilityPointService {
    /**
     * 根据id查询
     * @param id_ap
     * @return
     */
    public Abilitypoint getAbilityPointById(Integer id_ap);

    /**
     * 查询所有
     * @return
     * @throws Exception
     */
    public List<Abilitypoint> queryAll() throws Exception;
}

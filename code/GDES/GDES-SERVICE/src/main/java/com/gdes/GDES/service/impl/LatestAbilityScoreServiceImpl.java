package com.gdes.GDES.service.impl;

import com.gdes.GDES.dao.AbilityPointDao;
import com.gdes.GDES.dao.LatestAbilityScoreDao;
import com.gdes.GDES.model.AbilityPoint;
import com.gdes.GDES.model.LatestAbilityScore;
import com.gdes.GDES.service.LatestAbilityScoreService;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 96906 on 2018/5/3.
 */
@Repository
public class LatestAbilityScoreServiceImpl implements LatestAbilityScoreService {
    @Resource
    private LatestAbilityScoreDao latestAbilityScoreDao;

    @Resource
    private AbilityPointDao abilityPointDao;
    /**
     * 根据学生I的查找
     * @param id_s 学号
     * @return 结果链表
     */
    public List<LatestAbilityScore> getAbilityScoreListById(String id_s) {
        List<LatestAbilityScore> latestAbilityScores = latestAbilityScoreDao.getAbilityScoreListById(id_s);
        //找到能力点名称
        for(LatestAbilityScore a: latestAbilityScores) {
            Integer id_ap = a.getId_ap();
            AbilityPoint abilityPoint = abilityPointDao.getAbilityPointById(id_ap);
            a.setAbilitypoint(abilityPoint);
        }
        return latestAbilityScores;
    }

}

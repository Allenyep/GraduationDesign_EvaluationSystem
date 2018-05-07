package com.gdes.GDES.service;

import com.gdes.GDES.model.LatestAbilityScore;

import java.util.List;

/**
 * 最新能力点得分 业务接口
 */
public interface LatestAbilityScoreService {
    /**
     * 根据学生Id查找
     * @param id_s 学号
     * @return 结果链表
     */
    public List<LatestAbilityScore> getAbilityScoreListById(String id_s);

}

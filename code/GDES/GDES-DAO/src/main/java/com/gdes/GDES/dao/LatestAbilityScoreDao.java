package com.gdes.GDES.dao;

import com.gdes.GDES.model.LatestAbilityScore;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 数据访问接口
 */
@Repository
public interface LatestAbilityScoreDao {
    /**
     * 根据学号查询
     * @param id_s 学号
     * @return 结果链表
     */
    public List<LatestAbilityScore> getAbilityScoreListById(String id_s);
}
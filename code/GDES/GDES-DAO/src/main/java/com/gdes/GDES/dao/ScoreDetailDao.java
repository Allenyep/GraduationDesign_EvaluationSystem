package com.gdes.GDES.dao;

import com.gdes.GDES.model.Latestabilityscore;
import com.gdes.GDES.model.Scoredetail;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScoreDetailDao {
    /**
     * 根据能力点编号查找能力得分详情
     * @param latestAbilityScore
     * @return
     */
    public List<Scoredetail> getScoreDetailListByAbilityId(Latestabilityscore latestAbilityScore);
}

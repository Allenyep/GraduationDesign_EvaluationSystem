package com.gdes.GDES.service;

import com.gdes.GDES.model.LatestAbilityScore;
import com.gdes.GDES.model.ScoreDetail;

import java.util.List;

/**
 * Created by 96906 on 2018/5/5.
 */
public interface ScoreDetailService {
    /**
     * 根据能力点编号查找能力得分详情
     * @param latestAbilityScore
     * @return
     */
    public List<ScoreDetail> getScoreDetailListByAbilityId(LatestAbilityScore latestAbilityScore);
}

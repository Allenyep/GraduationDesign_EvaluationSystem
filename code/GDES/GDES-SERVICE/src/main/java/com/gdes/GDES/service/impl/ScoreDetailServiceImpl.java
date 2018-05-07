package com.gdes.GDES.service.impl;


import com.gdes.GDES.dao.AbilityPointDao;
import com.gdes.GDES.dao.ScoreDetailDao;
import com.gdes.GDES.dao.TeacherDao;
import com.gdes.GDES.model.AbilityPoint;
import com.gdes.GDES.model.LatestAbilityScore;
import com.gdes.GDES.model.ScoreDetail;
import com.gdes.GDES.model.Teacher;
import com.gdes.GDES.service.ScoreDetailService;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
@Repository
public class ScoreDetailServiceImpl implements ScoreDetailService{
    @Resource
    private ScoreDetailDao scoreDetailDao;

    @Resource
    private AbilityPointDao abilityPointDao;

    @Resource
    private TeacherDao teacherDao;
    /**
     * 根据能力点编号查找能力得分详情
     * @param latestAbilityScore
     * @return
     */
    public List<ScoreDetail> getScoreDetailListByAbilityId(LatestAbilityScore latestAbilityScore) {
        List<ScoreDetail> scoreDetails = scoreDetailDao.getScoreDetailListByAbilityId(latestAbilityScore);
        for(ScoreDetail sd: scoreDetails) {
            //教师
            String id_t = sd.getId_t();
            Teacher teacher = teacherDao.getTeacherById(id_t);
            sd.setTeacher(teacher);
            //能力点
            Integer id_ap = sd.getId_ap();
            AbilityPoint abilityPoint = abilityPointDao.getAbilityPointById(id_ap);
            sd.setAbilitypoint(abilityPoint);
        }
        return scoreDetails;
    }
}

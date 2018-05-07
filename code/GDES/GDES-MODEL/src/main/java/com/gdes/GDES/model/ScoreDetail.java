package com.gdes.GDES.model;

/**
 * 成绩详情实体
 */
public class ScoreDetail {
    private String id_t; //教师编号
    private String id_s; //学生编号
    private String id_er; //评测记录编号
    private String id_q; //试题编号
    private int id_ap; //能力点编号
    private String score_sd; //试题得分
    private String time_sd; //得分时间
    private Teacher teacher; //教师
    private AbilityPoint abilitypoint; //能力点

    public String getId_t() {
        return id_t;
    }

    public void setId_t(String id_t) {
        this.id_t = id_t;
    }

    public String getId_s() {
        return id_s;
    }

    public void setId_s(String id_s) {
        this.id_s = id_s;
    }

    public String getId_er() {
        return id_er;
    }

    public void setId_er(String id_er) {
        this.id_er = id_er;
    }

    public String getId_q() {
        return id_q;
    }

    public void setId_q(String id_q) {
        this.id_q = id_q;
    }

    public int getId_ap() {
        return id_ap;
    }

    public void setId_ap(int id_ap) {
        this.id_ap = id_ap;
    }

    public String getScore_sd() {
        return score_sd;
    }

    public void setScore_sd(String score_sd) {
        this.score_sd = score_sd;
    }

    public String getTime_sd() {
        return time_sd;
    }

    public void setTime_sd(String time_sd) {
        this.time_sd = time_sd;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public AbilityPoint getAbilitypoint() {
        return abilitypoint;
    }

    public void setAbilitypoint(AbilityPoint abilitypoint) {
        this.abilitypoint = abilitypoint;
    }

    @Override
    public String toString() {
        return "得分详情{" +
                "教师编号：" + id_t +
                ", 学生编号：" + id_s +
                ", 评测记录编号：" + id_er +
                ", 试题编号：" + id_q +
                ", 能力点编号：" + id_ap +
                ", 得分：" + score_sd +
                ", 评分时间：" + time_sd +
                "}";
    }
}

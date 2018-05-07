package com.gdes.GDES.model;

/**
 * 最新能力点得分 实体
 */
public class LatestAbilityScore {
    private String id_s; //学生编号
    private int id_ap; //能力点编号
    private String score_las; //能力点得分
    private String proportion_las; //能力得分比例
    private String time_las; //评分时间
    private AbilityPoint abilitypoint;

    public String getId_s() {
        return id_s;
    }

    public void setId_s(String id_s) {
        this.id_s = id_s;
    }

    public int getId_ap() {
        return id_ap;
    }

    public void setId_ap(int id_ap) {
        this.id_ap = id_ap;
    }

    public String getScore_las() {
        return score_las;
    }

    public void setScore_las(String score_las) {
        this.score_las = score_las;
    }

    public String getProportion_las() {
        return proportion_las;
    }

    public void setProportion_las(String proportion_las) {
        this.proportion_las = proportion_las;
    }

    public String getTime_las() {
        return time_las;
    }

    public void setTime_las(String time_las) {
        this.time_las = time_las;
    }

    public AbilityPoint getAbilitypoint() {
        return abilitypoint;
    }

    public void setAbilitypoint(AbilityPoint abilitypoint) {
        this.abilitypoint = abilitypoint;
    }

    @Override
    public String toString() {
        return "能力得分{" +
                ", 学生编号：" + id_s +
                ", 能力点编号：" + id_ap +
                ", 能力点得分：" + score_las +
                ", 能力点得分比例：" + proportion_las +
                ", 评分时间：" + time_las +
                "}";
    }
}

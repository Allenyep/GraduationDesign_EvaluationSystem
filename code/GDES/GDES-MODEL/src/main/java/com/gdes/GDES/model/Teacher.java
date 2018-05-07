package com.gdes.GDES.model;

/**
 * 教师
 */
public class Teacher {
    private String id_t; //教师编号
    private String name_t; //教师姓名
    private String id_m; //专业编号
    private String majorleader_t; //是否专业负责人
    private String courseleader_t; //是否课程负责人

    public String getId_t() {
        return id_t;
    }

    public void setId_t(String id_t) {
        this.id_t = id_t;
    }

    public String getName_t() {
        return name_t;
    }

    public void setName_t(String name_t) {
        this.name_t = name_t;
    }

    public String getId_m() {
        return id_m;
    }

    public void setId_m(String id_m) {
        this.id_m = id_m;
    }

    public String getMajorleader_t() {
        return majorleader_t;
    }

    public void setMajorleader_t(String majorleader_t) {
        this.majorleader_t = majorleader_t;
    }

    public String getCourseleader_t() {
        return courseleader_t;
    }

    public void setCourseleader_t(String courseleader_t) {
        this.courseleader_t = courseleader_t;
    }

    @Override
    public String toString() {
        return "教师{" +
                "教师编号：" + id_t +
                ", 教师名称：" + name_t +
                ", 专业编号：" + id_m +
                ", 是否专业负责人：" + majorleader_t +
                ", 是否课程负责人：" + courseleader_t +
                "}";
    }

}

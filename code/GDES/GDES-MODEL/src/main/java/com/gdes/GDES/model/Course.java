package com.gdes.GDES.model;

public class Course {
    private String idC;

    private String nameC;

    private String courseType;//课程类型

    private String introductionC;
    private String courseCode;//课程编号

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getIdC() {
        return idC;
    }

    public void setIdC(String idC) {
        this.idC = idC == null ? null : idC.trim();
    }

    public String getNameC() {
        return nameC;
    }

    public void setNameC(String nameC) {
        this.nameC = nameC == null ? null : nameC.trim();
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public String getIntroductionC() {
        return introductionC;
    }

    public void setIntroductionC(String introductionC) {
        this.introductionC = introductionC == null ? null : introductionC.trim();
    }
}
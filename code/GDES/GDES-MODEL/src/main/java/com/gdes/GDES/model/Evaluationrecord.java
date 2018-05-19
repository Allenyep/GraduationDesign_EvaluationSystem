package com.gdes.GDES.model;

public class Evaluationrecord extends EvaluationrecordKey {
    private String beginEr;

    private String endEr;

    private String consumptionEr;

    private Student student;

    private Teacher teacher;

    public String getBeginEr() {
        return beginEr;
    }

    public void setBeginEr(String beginEr) {
        this.beginEr = beginEr == null ? null : beginEr.trim();
    }

    public String getEndEr() {
        return endEr;
    }

    public void setEndEr(String endEr) {
        this.endEr = endEr == null ? null : endEr.trim();
    }

    public String getConsumptionEr() {
        return consumptionEr;
    }

    public void setConsumptionEr(String consumptionEr) {
        this.consumptionEr = consumptionEr == null ? null : consumptionEr.trim();
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
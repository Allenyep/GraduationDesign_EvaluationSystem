package com.gdes.GDES.model;

public class Teacher {
    private String idT;

    private String nameT;

    private String idM;

    private String majorleaderT;

    private String courseleaderT;

    public String getIdT() {
        return idT;
    }

    public void setIdT(String idT) {
        this.idT = idT == null ? null : idT.trim();
    }

    public String getNameT() {
        return nameT;
    }

    public void setNameT(String nameT) {
        this.nameT = nameT == null ? null : nameT.trim();
    }

    public String getIdM() {
        return idM;
    }

    public void setIdM(String idM) {
        this.idM = idM == null ? null : idM.trim();
    }

    public String getMajorleaderT() {
        return majorleaderT;
    }

    public void setMajorleaderT(String majorleaderT) {
        this.majorleaderT = majorleaderT == null ? null : majorleaderT.trim();
    }

    public String getCourseleaderT() {
        return courseleaderT;
    }

    public void setCourseleaderT(String courseleaderT) {
        this.courseleaderT = courseleaderT == null ? null : courseleaderT.trim();
    }
}
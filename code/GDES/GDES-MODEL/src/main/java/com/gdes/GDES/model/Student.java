package com.gdes.GDES.model;

public class Student {
    private String idS;

    private String nameS;

    private String idM;

    private String dateS;

    private Major major;

    public String getIdS() {
        return idS;
    }

    public void setIdS(String idS) {
        this.idS = idS == null ? null : idS.trim();
    }

    public String getNameS() {
        return nameS;
    }

    public void setNameS(String nameS) {
        this.nameS = nameS == null ? null : nameS.trim();
    }

    public String getIdM() {
        return idM;
    }

    public void setIdM(String idM) {
        this.idM = idM == null ? null : idM.trim();
    }

    public String getDateS() {
        return dateS;
    }

    public void setDateS(String dateS) {
        this.dateS = dateS == null ? null : dateS.trim();
    }

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }
}
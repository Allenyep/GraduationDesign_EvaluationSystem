package com.gdes.GDES.model;

public class Abilitypoint {
    private Integer idAp;

    private String nameAp;

    private String aspectAp;

    private String classAp;

    public Integer getIdAp() {
        return idAp;
    }

    public void setIdAp(Integer idAp) {
        this.idAp = idAp;
    }

    public String getNameAp() {
        return nameAp;
    }

    public void setNameAp(String nameAp) {
        this.nameAp = nameAp == null ? null : nameAp.trim();
    }

    public String getAspectAp() {
        return aspectAp;
    }

    public void setAspectAp(String aspectAp) {
        this.aspectAp = aspectAp == null ? null : aspectAp.trim();
    }

    public String getClassAp() {
        return classAp;
    }

    public void setClassAp(String classAp) {
        this.classAp = classAp == null ? null : classAp.trim();
    }
}
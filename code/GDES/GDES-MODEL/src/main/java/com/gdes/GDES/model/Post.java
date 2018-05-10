package com.gdes.GDES.model;

public class Post {
    private Integer idP;

    private String nameP;

    public Integer getIdP() {
        return idP;
    }

    public void setIdP(Integer idP) {
        this.idP = idP;
    }

    public String getNameP() {
        return nameP;
    }

    public void setNameP(String nameP) {
        this.nameP = nameP == null ? null : nameP.trim();
    }
}
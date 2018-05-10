package com.gdes.GDES.model;

public class StudentpostKey {
    private String idS;

    private Integer idP;

    public String getIdS() {
        return idS;
    }

    public void setIdS(String idS) {
        this.idS = idS == null ? null : idS.trim();
    }

    public Integer getIdP() {
        return idP;
    }

    public void setIdP(Integer idP) {
        this.idP = idP;
    }
}
package com.gdes.GDES.model;

public class Userrole {
    private String idU;

    private Integer idR;

    public String getIdU() {
        return idU;
    }

    public void setIdU(String idU) {
        this.idU = idU == null ? null : idU.trim();
    }

    public Integer getIdR() {
        return idR;
    }

    public void setIdR(Integer idR) {
        this.idR = idR;
    }
}
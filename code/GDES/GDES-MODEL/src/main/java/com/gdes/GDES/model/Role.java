package com.gdes.GDES.model;

public class Role {
    private Integer idR;

    private String jsm;

    public Integer getIdR() {
        return idR;
    }

    public void setIdR(Integer idR) {
        this.idR = idR;
    }

    public String getJsm() {
        return jsm;
    }

    public void setJsm(String jsm) {
        this.jsm = jsm == null ? null : jsm.trim();
    }
}
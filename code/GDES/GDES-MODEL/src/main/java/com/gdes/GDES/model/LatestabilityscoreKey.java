package com.gdes.GDES.model;

public class LatestabilityscoreKey {
    private String idS;

    private Integer idAp;

    public String getIdS() {
        return idS;
    }

    public void setIdS(String idS) {
        this.idS = idS == null ? null : idS.trim();
    }

    public Integer getIdAp() {
        return idAp;
    }

    public void setIdAp(Integer idAp) {
        this.idAp = idAp;
    }
}
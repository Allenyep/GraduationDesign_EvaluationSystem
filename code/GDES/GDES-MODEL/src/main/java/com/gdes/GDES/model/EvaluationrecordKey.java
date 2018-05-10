package com.gdes.GDES.model;

public class EvaluationrecordKey {
    private String idT;

    private String idS;

    private String idEr;

    public String getIdT() {
        return idT;
    }

    public void setIdT(String idT) {
        this.idT = idT == null ? null : idT.trim();
    }

    public String getIdS() {
        return idS;
    }

    public void setIdS(String idS) {
        this.idS = idS == null ? null : idS.trim();
    }

    public String getIdEr() {
        return idEr;
    }

    public void setIdEr(String idEr) {
        this.idEr = idEr == null ? null : idEr.trim();
    }
}
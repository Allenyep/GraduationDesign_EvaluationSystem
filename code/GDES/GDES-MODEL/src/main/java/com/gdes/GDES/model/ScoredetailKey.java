package com.gdes.GDES.model;

public class ScoredetailKey {
    private String idT;

    private String idS;

    private String idEr;

    private String idQ;

    private Integer idAp;

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

    public String getIdQ() {
        return idQ;
    }

    public void setIdQ(String idQ) {
        this.idQ = idQ == null ? null : idQ.trim();
    }

    public Integer getIdAp() {
        return idAp;
    }

    public void setIdAp(Integer idAp) {
        this.idAp = idAp;
    }
}
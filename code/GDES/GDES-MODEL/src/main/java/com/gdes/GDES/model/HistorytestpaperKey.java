package com.gdes.GDES.model;

public class HistorytestpaperKey {
    private String idT;

    private String idS;

    private String idEr;

    private String idQ;

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
}
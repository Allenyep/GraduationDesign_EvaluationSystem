package com.gdes.GDES.model;

public class Questions {
    private String idQ;

    private String idC;

    private String datatimeQ;

    private String scoreQ;

    private String timeQ;

    private String styleQ;

    private String idT;

    private String automaticscoringQ;

    private String deleteornotQ;

    public String getIdQ() {
        return idQ;
    }

    public void setIdQ(String idQ) {
        this.idQ = idQ == null ? null : idQ.trim();
    }

    public String getIdC() {
        return idC;
    }

    public void setIdC(String idC) {
        this.idC = idC == null ? null : idC.trim();
    }

    public String getDatatimeQ() {
        return datatimeQ;
    }

    public void setDatatimeQ(String datatimeQ) {
        this.datatimeQ = datatimeQ == null ? null : datatimeQ.trim();
    }

    public String getScoreQ() {
        return scoreQ;
    }

    public void setScoreQ(String scoreQ) {
        this.scoreQ = scoreQ == null ? null : scoreQ.trim();
    }

    public String getTimeQ() {
        return timeQ;
    }

    public void setTimeQ(String timeQ) {
        this.timeQ = timeQ == null ? null : timeQ.trim();
    }

    public String getStyleQ() {
        return styleQ;
    }

    public void setStyleQ(String styleQ) {
        this.styleQ = styleQ == null ? null : styleQ.trim();
    }

    public String getIdT() {
        return idT;
    }

    public void setIdT(String idT) {
        this.idT = idT == null ? null : idT.trim();
    }

    public String getAutomaticscoringQ() {
        return automaticscoringQ;
    }

    public void setAutomaticscoringQ(String automaticscoringQ) {
        this.automaticscoringQ = automaticscoringQ == null ? null : automaticscoringQ.trim();
    }

    public String getDeleteornotQ() {
        return deleteornotQ;
    }

    public void setDeleteornotQ(String deleteornotQ) {
        this.deleteornotQ = deleteornotQ == null ? null : deleteornotQ.trim();
    }
}
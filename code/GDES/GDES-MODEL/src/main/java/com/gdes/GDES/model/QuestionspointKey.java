package com.gdes.GDES.model;

public class QuestionspointKey {
    private String idQ;

    private Integer idKp;

    public String getIdQ() {
        return idQ;
    }

    public void setIdQ(String idQ) {
        this.idQ = idQ == null ? null : idQ.trim();
    }

    public Integer getIdKp() {
        return idKp;
    }

    public void setIdKp(Integer idKp) {
        this.idKp = idKp;
    }
}
package com.gdes.GDES.model;

public class MajorcourseKey {
    private String idC;

    private String idM;

    private Integer credit;

    private String idT;

    public String getIdC() {
        return idC;
    }

    public void setIdC(String idC) {
        this.idC = idC == null ? null : idC.trim();
    }

    public String getIdM() {
        return idM;
    }

    public void setIdM(String idM) {
        this.idM = idM == null ? null : idM.trim();
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public String getIdT() {
        return idT;
    }

    public void setIdT(String idT) {
        this.idT = idT;
    }
}
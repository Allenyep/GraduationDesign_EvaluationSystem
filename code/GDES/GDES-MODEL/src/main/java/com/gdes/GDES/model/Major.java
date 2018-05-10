package com.gdes.GDES.model;

public class Major {
    private String idM;

    private String nameM;

    private String leaderM;

    private String idFm;

    public String getIdM() {
        return idM;
    }

    public void setIdM(String idM) {
        this.idM = idM == null ? null : idM.trim();
    }

    public String getNameM() {
        return nameM;
    }

    public void setNameM(String nameM) {
        this.nameM = nameM == null ? null : nameM.trim();
    }

    public String getLeaderM() {
        return leaderM;
    }

    public void setLeaderM(String leaderM) {
        this.leaderM = leaderM == null ? null : leaderM.trim();
    }

    public String getIdFm() {
        return idFm;
    }

    public void setIdFm(String idFm) {
        this.idFm = idFm == null ? null : idFm.trim();
    }
}
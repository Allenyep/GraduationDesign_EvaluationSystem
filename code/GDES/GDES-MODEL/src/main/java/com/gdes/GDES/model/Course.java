package com.gdes.GDES.model;

public class Course {
    private String idC;

    private String nameC;

    private String leaderC;

    private String introductionC;

    public String getIdC() {
        return idC;
    }

    public void setIdC(String idC) {
        this.idC = idC == null ? null : idC.trim();
    }

    public String getNameC() {
        return nameC;
    }

    public void setNameC(String nameC) {
        this.nameC = nameC == null ? null : nameC.trim();
    }

    public String getLeaderC() {
        return leaderC;
    }

    public void setLeaderC(String leaderC) {
        this.leaderC = leaderC == null ? null : leaderC.trim();
    }

    public String getIntroductionC() {
        return introductionC;
    }

    public void setIntroductionC(String introductionC) {
        this.introductionC = introductionC == null ? null : introductionC.trim();
    }
}
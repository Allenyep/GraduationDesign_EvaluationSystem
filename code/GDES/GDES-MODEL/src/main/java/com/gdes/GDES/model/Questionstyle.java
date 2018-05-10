package com.gdes.GDES.model;

public class Questionstyle {
    private String styleQ;

    private String nameQs;

    public String getStyleQ() {
        return styleQ;
    }

    public void setStyleQ(String styleQ) {
        this.styleQ = styleQ == null ? null : styleQ.trim();
    }

    public String getNameQs() {
        return nameQs;
    }

    public void setNameQs(String nameQs) {
        this.nameQs = nameQs == null ? null : nameQs.trim();
    }
}
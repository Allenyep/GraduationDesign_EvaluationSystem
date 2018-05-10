package com.gdes.GDES.model;

public class Student {
    private String idS;

    private String nameS;

    private String idM;

    private String dataS;

    public String getIdS() {
        return idS;
    }

    public void setIdS(String idS) {
        this.idS = idS == null ? null : idS.trim();
    }

    public String getNameS() {
        return nameS;
    }

    public void setNameS(String nameS) {
        this.nameS = nameS == null ? null : nameS.trim();
    }

    public String getIdM() {
        return idM;
    }

    public void setIdM(String idM) {
        this.idM = idM == null ? null : idM.trim();
    }

    public String getDataS() {
        return dataS;
    }

    public void setDataS(String dataS) {
        this.dataS = dataS == null ? null : dataS.trim();
    }
}
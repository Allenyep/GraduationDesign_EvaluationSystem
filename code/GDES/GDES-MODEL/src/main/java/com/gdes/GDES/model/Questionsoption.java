package com.gdes.GDES.model;

public class Questionsoption {
    private Integer idO;

    private String idQ;

    private String contextO;

    private Boolean istrueO;

    public Integer getIdO() {
        return idO;
    }

    public void setIdO(Integer idO) {
        this.idO = idO;
    }

    public String getIdQ() {
        return idQ;
    }

    public void setIdQ(String idQ) {
        this.idQ = idQ == null ? null : idQ.trim();
    }

    public String getContextO() {
        return contextO;
    }

    public void setContextO(String contextO) {
        this.contextO = contextO == null ? null : contextO.trim();
    }

    public Boolean getIstrueO() {
        return istrueO;
    }

    public void setIstrueO(Boolean istrueO) {
        this.istrueO = istrueO;
    }
}
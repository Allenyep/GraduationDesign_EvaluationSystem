package com.gdes.GDES.model;

public class Knowledgepoint {
    private Integer idKp;

    private Integer idAp;

    private String nameKp;

    private String proportionKp;

    private String idC;

    private String noteKp;

    public Integer getIdKp() {
        return idKp;
    }

    public void setIdKp(Integer idKp) {
        this.idKp = idKp;
    }

    public Integer getIdAp() {
        return idAp;
    }

    public void setIdAp(Integer idAp) {
        this.idAp = idAp;
    }

    public String getNameKp() {
        return nameKp;
    }

    public void setNameKp(String nameKp) {
        this.nameKp = nameKp == null ? null : nameKp.trim();
    }

    public String getProportionKp() {
        return proportionKp;
    }

    public void setProportionKp(String proportionKp) {
        this.proportionKp = proportionKp == null ? null : proportionKp.trim();
    }

    public String getIdC() {
        return idC;
    }

    public void setIdC(String idC) {
        this.idC = idC == null ? null : idC.trim();
    }

    public String getNoteKp() {
        return noteKp;
    }

    public void setNoteKp(String noteKp) {
        this.noteKp = noteKp == null ? null : noteKp.trim();
    }
}
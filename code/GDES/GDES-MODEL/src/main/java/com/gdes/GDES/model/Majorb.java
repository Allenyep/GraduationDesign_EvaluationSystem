package com.gdes.GDES.model;

public class Majorb {
    private Integer idMb;

    private String nameMb;

    public Integer getIdMb() {
        return idMb;
    }

    public void setIdMb(Integer idMb) {
        this.idMb = idMb;
    }

    public String getNameMb() {
        return nameMb;
    }

    public void setNameMb(String nameMb) {
        this.nameMb = nameMb == null ? null : nameMb.trim();
    }
}
package com.gdes.GDES.model;

public class Features {
    private Integer idF;

    private String name;

    private String link;

    private String list;

    public Integer getIdF() {
        return idF;
    }

    public void setIdF(Integer idF) {
        this.idF = idF;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
    }

    public String getList() {
        return list;
    }

    public void setList(String list) {
        this.list = list == null ? null : list.trim();
    }
}
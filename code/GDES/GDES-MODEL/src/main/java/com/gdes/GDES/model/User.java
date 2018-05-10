package com.gdes.GDES.model;

public class User {
    private String idU;

    private String username;

    private String password;

    private String name;

    private String sex;

    public String getIdU() {
        return idU;
    }

    public void setIdU(String idU) {
        this.idU = idU == null ? null : idU.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }
}
package com.gdes.GDES.model;


import com.gdes.GDES.model.utils.PageBean;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import lombok.extern.log4j.Log4j;

import java.io.Serializable;


//@Data
//@Log4j
//@NoArgsConstructor
//@AllArgsConstructor
public class Dept extends PageBean implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 部门ID
     */
    protected Integer id;
    /**
     * 部门代码
     */
    protected String code;
    /**
     * 部门名称
     */
    protected String name;
    /**
     * 部门父级ID
     */
    protected Integer parantid;


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParantid() {
        return parantid;
    }

    public void setParantid(Integer parantid) {
        this.parantid = parantid;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", parantid=" + parantid +
                '}';
    }
}

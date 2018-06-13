package com.gdes.GDES.model.utils;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import lombok.extern.log4j.Log4j;


//@Data
//@Log4j
//@NoArgsConstructor
//@AllArgsConstructor
public class PageBean {
    protected Integer page;//页码
    protected Integer limit;//当页总条数

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}

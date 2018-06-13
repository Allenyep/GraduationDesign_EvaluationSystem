package com.gdes.GDES.model;

import java.util.List;

/**
 * @author xiyifen
 * @date 2018/6/8 10:32
 */
public class PermissionPage {
    protected Integer code = 0;
    protected String msg;
    protected Integer count = 0;
    protected List<Permission> data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<Permission> getData() {
        return data;
    }

    public void setData(List<Permission> data) {
        this.data = data;
    }
}

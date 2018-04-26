package com.gdes.GDES.model.utils;

/**
 * Created by Allen on 2018/4/26.
 */
public class ResultVo<T> {
    private boolean success = false;
    private String message = null;
    private T result = null;

    public void isSuccess(boolean b) {
        this.success=b;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public void setResult(T result) {
        this.result = result;
    }
    public boolean getSuccess(){
        return success;
    }
    public String getMessage() {
        return message;
    }
    public T getResult() {
        return result;
    }
}

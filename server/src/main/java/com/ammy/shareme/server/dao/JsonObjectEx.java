package com.ammy.shareme.server.dao;

public class JsonObjectEx {
    Integer statusCode;
    String message;
    Object object;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
    public JsonObjectEx(String massege){
        this.statusCode = 1;
        this.message = massege;
        this.object = new Object();
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public JsonObjectEx(String message, Object object){
        this.statusCode = 0;
        this.message = message;
        this.object = object;
    }
}

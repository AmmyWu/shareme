package com.ammy.shareme.server.dao;

public class JsonObjectEx {
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
        this.message = massege;
        this.object = new Object();
    }
    public JsonObjectEx(String message,Object object){
        this.message = message;
        this.object = object;
    }
}

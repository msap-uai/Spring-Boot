package com.example.demo.saludos;

public class SaludosModel {

    private final long id;
    private final String content;

    //CONTRUCTOR
    public SaludosModel(long id, String content){
        this.id = id;
        this.content = content;
    }
    //GETTERS Y SETTERS
    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

}

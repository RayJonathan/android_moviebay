package com.example.moviebay.Domains;

import java.io.Serializable;

public class Cast implements Serializable {
    private String PictUrl;
    private String Actor;


    public  Cast(){

    }

    public String getPictUrl() {
        return PictUrl;
    }

    public void setPictUrl(String pictUrl) {
        PictUrl = pictUrl;
    }

    public String getActor() {
        return Actor;
    }

    public void setActor(String actor) {
        Actor = actor;
    }
}

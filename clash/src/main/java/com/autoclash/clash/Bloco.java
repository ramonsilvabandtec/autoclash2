package com.autoclash.clash;

import org.springframework.http.ResponseEntity;

public abstract class Bloco {
    //clans, players, e guerras são coisas bem diferentes mas têm caracteristicas em comum
    private String tag;
    private boolean online;

    public Bloco(String tag) {
        this.tag = tag;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }
    public abstract String status();

    public String getTag(){
        return this.tag;
    };
}

package com.autoclash.clash;

import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

public class Guerra extends Bloco {
    private Integer estrelasTimeA;
    private Integer estrelasTimeB;
    private Clan timeA;
    private Clan timeB;
    private List<Vila> selecao = new ArrayList<>();

    public Guerra(String tag, Clan c1, Clan c2) {
        super(tag);
        this.timeA = c1;
        this.timeB = c2;
    }

    public Integer getEstrelasTimeA() {
        return estrelasTimeA;
    }

    public void setEstrelasTimeA(Integer estrelasTimeA) {
        this.estrelasTimeA = estrelasTimeA;
    }

    public Integer getEstrelasTimeB() {
        return estrelasTimeB;
    }

    public void setEstrelasTimeB(Integer estrelasTimeB) {
        this.estrelasTimeB = estrelasTimeB;
    }

    public Clan getTimeA() {
        return timeA;
    }

    public void setTimeA(Clan timeA) {
        this.timeA = timeA;
    }

    public Clan getTimeB() {
        return timeB;
    }

    public void setTimeB(Clan timeB) {
        this.timeB = timeB;
    }

    public List<Vila> getSelecao() {
        return selecao;
    }

    public void setSelecao(List<Vila> selecao) {
        this.selecao = selecao;
    }

    @Override
    public String status() {
        if (super.isOnline()) {
            return "A guerra está em andamento";
        } else {
            return "A guerra não está rolando";
        }
    }
}

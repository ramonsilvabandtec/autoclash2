package com.autoclash.clash;

import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

public class Clan extends Bloco {

    private List<Vila> integrantes = new ArrayList<>();
    private int vitorias;
    private int derrotas;
    private String nome;

    public List<Vila> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(List<Vila> integrantes) {
        this.integrantes = integrantes;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Clan(int vitorias, int derrotas, String nome, String tag) {
        super(tag);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.nome = nome;
    }

    @Override
    public String status() {
        if (super.isOnline()) {
            return "O clã está online";
        } else {
            return "O clã está offline";
        }
    }
}

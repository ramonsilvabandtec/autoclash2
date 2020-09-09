package com.autoclash.clash;

import org.springframework.http.ResponseEntity;

public class Vila extends Bloco {

    private String nome;
    private String email;
    private Integer nivel;
    private Integer ouro;
    private Integer elixir;
    private Integer darkElixir;
    private Integer gemas;
    private Integer trofeus;

    public Vila(String nome, String tag, String email, Integer nivel, Integer ouro, Integer elixir, Integer darkElixir, Integer gemas, Integer trofeus) {
        super(tag);
        this.nome = nome;
        this.email = email;
        this.nivel = nivel;
        this.ouro = ouro;
        this.elixir = elixir;
        this.darkElixir = darkElixir;
        this.gemas = gemas;
        this.trofeus = trofeus;
    }

    public String getNome() {
        return nome;
    }

    public Integer getTrofeus() {
        return trofeus;
    }

    public String getEmail() {
        return email;
    }

    public Integer getNivel() {
        return nivel;
    }

    public Integer getOuro() {
        return ouro;
    }

    public Integer getElixir() {
        return elixir;
    }

    public Integer getDarkElixir() {
        return darkElixir;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public void setOuro(Integer ouro) {
        this.ouro = ouro;
    }

    public void setElixir(Integer elixir) {
        this.elixir = elixir;
    }

    public void setDarkElixir(Integer darkElixir) {
        this.darkElixir = darkElixir;
    }

    public void setGemas(Integer gemas) {
        this.gemas = gemas;
    }

    public void setTrofeus(Integer trofeus) {
        this.trofeus = trofeus;
    }

    public Integer getGemas() {
        return gemas;
    }

    @Override
    public String status() {
        if (super.isOnline()) {
            return "O jogador está online";
        } else {
            return "O jogador está offline";
        }
    }
}

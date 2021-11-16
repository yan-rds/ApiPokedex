package com.example.pokedexApi.pokemons;

import java.util.List;

public class Pokemon {
    private int pokedex;
    private String nome;
    private int vida;
    private int defesa;
    private int spcDefesa;
    private int ataque;
    private int spcAtaque;
    private int speed;
    private List<Ataque> ataques;
    private List<Habilidade> habilidades;

    public Pokemon() {
    }

    public int getPokedex() {
        return pokedex;
    }

    public void setPokedex(int pokedex) {
        this.pokedex = pokedex;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getSpcDefesa() {
        return spcDefesa;
    }

    public void setSpcDefesa(int spcDefesa) {
        this.spcDefesa = spcDefesa;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getSpcAtaque() {
        return spcAtaque;
    }

    public void setSpcAtaque(int spcAtaque) {
        this.spcAtaque = spcAtaque;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public List<Ataque> getAtaques() {
        return ataques;
    }

    public void setAtaques(List<Ataque> ataques) {
        this.ataques = ataques;
    }

    public List<Habilidade> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<Habilidade> habilidades) {
        this.habilidades = habilidades;
    }
}

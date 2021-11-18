package com.example.pokedexApi.dtos;

import com.example.pokedexApi.enuns.Tipo;


public class ExibirListaPokemonDTO {
    private int pokedex;
    private String nome;
    private Tipo tipoUm;
    private Tipo tipoDois;
    private int hp;
    private int defense;
    private int spDef;
    private int attack;
    private int spAtk;
    private int speed;

    public ExibirListaPokemonDTO() {
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

    public Tipo getTipoUm() {
        return tipoUm;
    }

    public void setTipoUm(Tipo tipoUm) {
        this.tipoUm = tipoUm;
    }

    public Tipo getTipoDois() {
        return tipoDois;
    }

    public void setTipoDois(Tipo tipoDois) {
        this.tipoDois = tipoDois;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSpDef() {
        return spDef;
    }

    public void setSpDef(int spDef) {
        this.spDef = spDef;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getSpAtk() {
        return spAtk;
    }

    public void setSpAtk(int spAtk) {
        this.spAtk = spAtk;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}

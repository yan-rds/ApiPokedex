package com.example.pokedexApi.pokemons;

import com.example.pokedexApi.moves.Move;

import java.util.List;

public class Pokemon {
    private int pokedex;
    private String nome;
    private int hp;
    private int defense;
    private int spDef;
    private int attack;
    private int spAtk;
    private int speed;
    private List<Move> moves;
    private List<Abilities> abilities;

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

    public List<Ataque> getMoves() {
        return moves;
    }

    public void setMoves(List<Ataque> moves) {
        this.moves = moves;
    }

    public List<Habilidade> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<Habilidade> abilities) {
        this.abilities = abilities;
    }
}

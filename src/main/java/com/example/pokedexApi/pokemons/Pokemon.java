package com.example.pokedexApi.pokemons;

import com.example.pokedexApi.abilities.Ability;
import com.example.pokedexApi.enuns.Tipo;
import com.example.pokedexApi.moves.Move;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "Pokemon")
public class Pokemon {
    @Id
    private int pokedex;
    private String nome;
    @Enumerated(EnumType.STRING)
    private Tipo tipoUm;
    @Enumerated(EnumType.STRING)
    private Tipo tipoDois;
    private int hp;
    private int defense;
    private int spDef;
    private int attack;
    private int spAtk;
    private int speed;
    @ManyToMany(cascade = CascadeType.PERSIST)
    private List<Move> moves;
    @ManyToMany(cascade = CascadeType.PERSIST)
    private List<Ability> abilities;

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

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public List<Ability> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<Ability> abilities) {
        this.abilities = abilities;
    }
}

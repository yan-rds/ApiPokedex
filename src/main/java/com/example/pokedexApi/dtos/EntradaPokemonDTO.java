package com.example.pokedexApi.dtos;

import com.example.pokedexApi.abilities.Ability;
import com.example.pokedexApi.enuns.Tipo;
import com.example.pokedexApi.moves.Move;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

public class EntradaPokemonDTO {
    @NotNull
    private int pokedex;
    @NotBlank
    private String nome;
    @NotNull
    @Enumerated(EnumType.STRING)
    private Tipo tipoUm;
    @NotNull
    @Enumerated(EnumType.STRING)
    private Tipo tipoDois;
    @NotNull
    @Min(1)
    private int hp;
    @NotNull
    @Min(1)
    private int defense;
    @NotNull
    @Min(1)
    private int spDef;
    @NotNull
    @Min(1)
    private int attack;
    @NotNull
    @Min(1)
    private int spAtk;
    @NotNull
    @Min(1)
    private int speed;
    @Valid
    private List<Move> moves;
    @Valid
    private List<Ability> abilities;

    public EntradaPokemonDTO() {
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

package com.example.pokedexApi.moves;

import com.example.pokedexApi.enuns.DamageCategory;
import com.example.pokedexApi.enuns.Tipo;

import javax.persistence.*;

@Entity
@Table(name = "Move")
public class Move {
    @Id
    private String nome;
    private int level;
    private Tipo tipo;
    private DamageCategory damageCategory;
    private int power;
    private int accuracy;
    private int pp;

    public Move() {
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public DamageCategory getDamageCategory() {
        return damageCategory;
    }

    public void setDamageCategory(DamageCategory damageCategory) {
        this.damageCategory = damageCategory;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public int getPp() {
        return pp;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }
}

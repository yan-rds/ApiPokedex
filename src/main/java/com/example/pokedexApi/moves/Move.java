package com.example.pokedexApi.moves;

import com.example.pokedexApi.enuns.DamageCategory;
import com.example.pokedexApi.enuns.Tipo;

import javax.persistence.*;

@Entity
@Table(name = "Move")
public class Move {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private int level;
    private Tipo tipo;
    private DamageCategory damageCategory;
    private int power;
    private String accuracy;
    private String pp;

    public Move() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(String accuracy) {
        this.accuracy = accuracy;
    }

    public String getPp() {
        return pp;
    }

    public void setPp(String pp) {
        this.pp = pp;
    }
}

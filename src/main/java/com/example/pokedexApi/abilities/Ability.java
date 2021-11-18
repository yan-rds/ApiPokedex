package com.example.pokedexApi.abilities;

import javax.persistence.*;

@Entity
@Table(name = "Ability")
public class Ability {

    @Id
    private String nome;

    public Ability() {
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}

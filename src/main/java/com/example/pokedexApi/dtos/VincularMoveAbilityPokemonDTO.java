package com.example.pokedexApi.dtos;

import javax.validation.constraints.NotNull;

public class VincularMoveAbilityPokemonDTO {

    @NotNull
    private int pokedexPokemon;
    private String nomeMove;
    private String nomeAbility;

    public VincularMoveAbilityPokemonDTO() {
    }

    public int getPokedexPokemon() {
        return pokedexPokemon;
    }

    public void setPokedexPokemon(int pokedexPokemon) {
        this.pokedexPokemon = pokedexPokemon;
    }

    public String getNomeMove() {
        return nomeMove;
    }

    public void setNomeMove(String nomeMove) {
        this.nomeMove = nomeMove;
    }

    public String getNomeAbility() {
        return nomeAbility;
    }

    public void setNomeAbility(String nomeAbility) {
        this.nomeAbility = nomeAbility;
    }
}

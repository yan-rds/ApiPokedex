package com.example.pokedexApi.pokemons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PokemonService {

    @Autowired
    PokemonRepository repository;

    public Pokemon salvarPokemon (Pokemon pokemon){
        repository.save(pokemon);
        return pokemon;
    }
}

package com.example.pokedexApi.pokemons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonService {

    @Autowired
    PokemonRepository repository;

    public void salvarPokemon (Pokemon pokemon){
        repository.save(pokemon);
    }

    public List<Pokemon> ExibirTodosPokemons() {
        return (List<Pokemon>) repository.findAll();
    }
}

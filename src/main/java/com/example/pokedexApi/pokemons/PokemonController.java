package com.example.pokedexApi.pokemons;

import com.example.pokedexApi.components.Conversor;
import com.example.pokedexApi.dtos.EntradaPokemonDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

    @Autowired
    private PokemonService service;
    @Autowired
    private ModelMapper conversor;

    @PostMapping
    public void salvarPokemon(@RequestBody @Valid EntradaPokemonDTO entradaPokemonDTO){
        Pokemon pokemon = conversor.map(entradaPokemonDTO, Pokemon.class);
        service.salvarPokemon(pokemon);
    }
}

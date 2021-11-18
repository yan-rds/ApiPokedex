package com.example.pokedexApi.pokemons;

import com.example.pokedexApi.components.Conversor;
import com.example.pokedexApi.dtos.EntradaPokemonDTO;
import com.example.pokedexApi.dtos.ExibirListaPokemonDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

    @Autowired
    private PokemonService service;
    @Autowired
    private ModelMapper conversor;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void salvarPokemon(@RequestBody @Valid EntradaPokemonDTO entradaPokemonDTO){
        Pokemon pokemon = conversor.map(entradaPokemonDTO, Pokemon.class);
        service.salvarPokemon(pokemon);
    }

    @GetMapping
    public List<ExibirListaPokemonDTO> exibirPokemons(){
        List<ExibirListaPokemonDTO> pokemonsExibidos = new ArrayList<>();
        service.ExibirTodosPokemons().forEach(pokemon -> pokemonsExibidos.add(conversor.map(pokemon, ExibirListaPokemonDTO.class)));
        return pokemonsExibidos;
    }

}

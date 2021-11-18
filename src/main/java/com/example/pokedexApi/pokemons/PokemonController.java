package com.example.pokedexApi.pokemons;

import com.example.pokedexApi.components.Conversor;
import com.example.pokedexApi.dtos.EntradaPokemonDTO;
import com.example.pokedexApi.dtos.ExibirListaPokemonDTO;
import com.example.pokedexApi.dtos.VincularMoveAbilityPokemonDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    @PutMapping
    public void vincularAoPokemon (@RequestBody VincularMoveAbilityPokemonDTO vincular){
        Optional<String> nomeAbility = Optional.ofNullable(vincular.getNomeAbility());
        Optional<String> nomeMove = Optional.ofNullable(vincular.getNomeMove());
        if (nomeAbility.isEmpty() & nomeMove.isPresent()){
            service.vincularMove(nomeMove.get(), vincular.getPokedexPokemon());
        }
        else if (nomeAbility.isPresent() & nomeMove.isEmpty()){
            service.vincularAbility(nomeAbility.get(), vincular.getPokedexPokemon());
        }
        else if (nomeAbility.isPresent() & nomeMove.isPresent()){
            service.vincularMoveEAbility(nomeMove.get(), nomeAbility.get(), vincular.getPokedexPokemon());
        }
        else {
            throw new RuntimeException("Não há dados a atualizar");
        }
    }

}

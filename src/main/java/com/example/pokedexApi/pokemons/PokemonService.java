package com.example.pokedexApi.pokemons;

import com.example.pokedexApi.abilities.Ability;
import com.example.pokedexApi.abilities.AbilityRepository;
import com.example.pokedexApi.moves.Move;
import com.example.pokedexApi.moves.MoveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PokemonService {

    @Autowired
    PokemonRepository pokemonRepository;
    @Autowired
    MoveRepository moveRepository;
    @Autowired
    AbilityRepository abilityRepository;


    public void salvarPokemon (Pokemon pokemon){
        pokemonRepository.save(pokemon);
    }

    public List<Pokemon> ExibirTodosPokemons() {
        return (List<Pokemon>) pokemonRepository.findAll();
    }

    public void vincularAbility (String nomeAbility, int pokedex){
        Optional<Pokemon> pokemonAtualizar = pokemonRepository.findById(pokedex);
        Optional<Ability> abilityAtualizar = abilityRepository.findById(nomeAbility);
        pokemonAtualizar.get().getAbilities().add(abilityAtualizar.get());
        pokemonRepository.save(pokemonAtualizar.get());
    }

    public void vincularMove (String nomeMove, int pokedex){
        Optional<Pokemon> pokemonAtualizar = pokemonRepository.findById(pokedex);
        Optional<Move> moveAtualizar = moveRepository.findById(nomeMove);
        pokemonAtualizar.get().getMoves().add(moveAtualizar.get());
        pokemonRepository.save(pokemonAtualizar.get());
    }

    public void vincularMoveEAbility (String nomeMove, String nomeAbility, int pokedex){
        Optional<Pokemon> pokemonAtualizar = pokemonRepository.findById(pokedex);
        Optional<Move> moveAtualizar = moveRepository.findById(nomeMove);
        Optional<Ability> abilityAtualizar = abilityRepository.findById(nomeAbility);

           pokemonAtualizar.get().getAbilities().add(abilityAtualizar.get());
           pokemonAtualizar.get().getMoves().add(moveAtualizar.get());
           pokemonRepository.save(pokemonAtualizar.get());
    }
}

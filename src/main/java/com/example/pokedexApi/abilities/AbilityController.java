package com.example.pokedexApi.abilities;

import com.example.pokedexApi.dtos.EntradaAbilityDTO;
import com.example.pokedexApi.dtos.EntradaMoveDTO;
import com.example.pokedexApi.moves.Move;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/abilities")
public class AbilityController {

    @Autowired
    AbilityService service;
    @Autowired
    ModelMapper conversor;

    @PostMapping
    public void salvarAbility (@RequestBody EntradaAbilityDTO entradaAbilityDTO){
        Ability ability = conversor.map(entradaAbilityDTO, Ability.class);
        service.salvarAbility(ability);
    }
}

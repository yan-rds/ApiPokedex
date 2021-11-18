package com.example.pokedexApi.moves;

import com.example.pokedexApi.dtos.EntradaMoveDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/moves")
public class MoveController {

    @Autowired
    MoveService service;
    @Autowired
    ModelMapper conversor;

    @PostMapping
    public void salvarMove (@RequestBody EntradaMoveDTO entradaMoveDTO){
        Move move = conversor.map(entradaMoveDTO, Move.class);
        service.salvarMove(move);
    }

}

package com.example.pokedexApi.moves;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MoveService {

    @Autowired
    MoveRepository repository;

    public void salvarMove (Move move){
        repository.save(move);

    }

}

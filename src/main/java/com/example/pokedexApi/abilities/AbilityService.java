package com.example.pokedexApi.abilities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AbilityService {

    @Autowired
    AbilityRepository abilityRepository;

}

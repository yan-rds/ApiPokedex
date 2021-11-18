package com.example.pokedexApi.abilities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/abilities")
public class AbilityController {

    @Autowired
    AbilityService service;


}

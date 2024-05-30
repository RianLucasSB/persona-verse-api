package com.boas.rian.personaverse.application.usecases;

import com.boas.rian.personaverse.adapters.out.CharactersRepository;
import com.boas.rian.personaverse.domain.model.Characters;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FindAllCharactersUseCase {
    private final CharactersRepository repository;
    public FindAllCharactersUseCase(CharactersRepository repository){
        this.repository = repository;
    }

    public List<Characters> execute(){
        return this.repository.findAll();
    }
}

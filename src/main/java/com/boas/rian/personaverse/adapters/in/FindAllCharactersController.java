package com.boas.rian.personaverse.adapters.in;

import com.boas.rian.personaverse.application.usecases.FindAllCharactersUseCase;
import com.boas.rian.personaverse.domain.model.Characters;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/characters")
public class FindAllCharactersController {

    private final FindAllCharactersUseCase useCase;

    public FindAllCharactersController(FindAllCharactersUseCase useCase){
        this.useCase = useCase;
    }

    @GetMapping
    public ResponseEntity<List<Characters>> findAll(){
        return ResponseEntity.ok(useCase.execute());
    }
}

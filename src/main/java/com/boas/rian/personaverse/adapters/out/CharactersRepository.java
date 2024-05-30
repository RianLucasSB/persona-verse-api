package com.boas.rian.personaverse.adapters.out;

import com.boas.rian.personaverse.domain.model.Characters;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharactersRepository extends JpaRepository<Characters, Long> {
}

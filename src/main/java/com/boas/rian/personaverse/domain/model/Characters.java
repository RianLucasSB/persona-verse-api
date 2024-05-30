package com.boas.rian.personaverse.domain.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "characters")
@NoArgsConstructor
@Data
public class Characters {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(length = Integer.MAX_VALUE)
    private String description;

    private String role;

    public String generateQuestion(String question){
        return """
       Pergunta: %s
       Nome do campeão: %s
       Função: %s
       Lore (História): %s
               """.formatted(question, this.name, this.role, this.description);
    }

}

package com.empresa.proyecto.application.usescases;

import java.util.List;

import com.empresa.proyecto.domain.interfaces.PersonajesRepositoryInterface;
import com.empresa.proyecto.domain.Personaje;

public class PersonajesUseCases {
    private final PersonajesRepositoryInterface personajesRepository;

    public PersonajesUseCases(PersonajesRepositoryInterface personajesRepository) {
        this.personajesRepository = personajesRepository;
    }

    public List<Personaje> getAllPersonajes(){
        return personajesRepository.findAll();
    }
    
}

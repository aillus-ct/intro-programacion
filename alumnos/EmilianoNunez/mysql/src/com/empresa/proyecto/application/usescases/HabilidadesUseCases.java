package com.empresa.proyecto.application.usescases;

import java.util.List;

import com.empresa.proyecto.domain.Habilidad;
import com.empresa.proyecto.domain.interfaces.HabilidadesRepositoryInterface;

public class HabilidadesUseCases {
    private final HabilidadesRepositoryInterface habilidadRepository;

    public HabilidadesUseCases(HabilidadesRepositoryInterface habilidadRepository) {
        this.habilidadRepository = habilidadRepository;
    }

    public List<Habilidad> getAllHabilidades(){
        return habilidadRepository.findAll();
    }

    public Habilidad addHabilidad(int habilidad, String nombre){

        /**
         * En caso de requerir validar datos, se podria hacer aqui
         */

        return habilidadRepository.add(new Habilidad(habilidad, nombre));
    }
    
}


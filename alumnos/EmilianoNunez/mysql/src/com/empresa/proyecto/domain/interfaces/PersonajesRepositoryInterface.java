package com.empresa.proyecto.domain.interfaces;
import java.util.List;

import com.empresa.proyecto.domain.Personaje;

public interface PersonajesRepositoryInterface {
    public List<Personaje> findAll();
}

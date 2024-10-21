package com.empresa.proyecto.domain.interfaces;
import java.util.List;

import com.empresa.proyecto.domain.Habilidad;

public interface HabilidadesRepositoryInterface {
    public List<Habilidad> findAll();
    public Habilidad add(Habilidad habilidad);
}

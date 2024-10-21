package com.empresa.proyecto.infraestructure.controller;

import com.empresa.proyecto.application.usescases.HabilidadesUseCases;
import com.empresa.proyecto.application.usescases.PersonajesUseCases;
import com.empresa.proyecto.domain.Habilidad;
import com.empresa.proyecto.domain.Personaje;

public class ConsoleController {

    private final PersonajesUseCases personajesUseCases;
    private final HabilidadesUseCases habilidadesUseCases;
    
    public ConsoleController(PersonajesUseCases personajesUseCases, HabilidadesUseCases habilidadesUseCases){
        this.personajesUseCases = personajesUseCases;
        this.habilidadesUseCases = habilidadesUseCases;
    }
    
    public void handleCommand(String[] args) {
        if (args.length == 0) {
            System.out.println("Especifique una entidad (personaje o habilidad) y una accion.");
            return;
        }

        String entidad = args[0];
        String accion = args[1];

        if (entidad.equalsIgnoreCase("personajes")) {
            handlePersonajes(accion, args);
        } else if (entidad.equalsIgnoreCase("habilidades")) {
            handleHabilidades(accion, args);
        } else {
            System.out.println("Entidad no reconocida.");
        }
    }

    private void handlePersonajes(String accion, String[] args) {
        switch (accion) {
            case "listar":
                for (Personaje personaje :  personajesUseCases.getAllPersonajes()) {
                    System.out.println(personaje.getId() + " - " + personaje.getNombre());
                }
                break;
            case "agregar":
                break;
            // Otros casos para actualizar, eliminar, etc.
        }
    }

    private void handleHabilidades(String accion, String[] args) {
        switch (accion) {
            case "listar":
                for (Habilidad habilidad :  habilidadesUseCases.getAllHabilidades()) {
                    System.out.println(habilidad.getId() + " - " + habilidad.getNombre());
                }
                break;
            case "agregar":
                int id = Integer.parseInt(args[2]);
                String nombre = args[3];
                habilidadesUseCases.addHabilidad(id, nombre);
                System.out.println("Habilidad agregada.");
                break;
            // Otros casos para actualizar, eliminar, etc.
        }
    }
}

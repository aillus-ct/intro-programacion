package main;

import java.util.List;

import main.db.RazaQuerys;

public class MainApp {
    public static void main(String[] args) {
        // Crear una instancia de PersonajeDAO
        //PersonajeQuerys personajeDAO = new PersonajeQuerys();
        RazaQuerys razaDAO = new RazaQuerys();

        // 1. Insertar un nuevo personaje
        //Personaje nuevoPersonaje = new Personaje(19, "Guerrero2", 5, 8, 200);
        //personajeDAO.insertarPersonaje(nuevoPersonaje);

        // 2. Actualizar un personaje existente
        //nuevoPersonaje.setNivel(10);
        //nuevoPersonaje.setPuntosSalud(200);
        //personajeDAO.actualizarPersonaje(nuevoPersonaje);

        // 3. Eliminar un personaje por ID
        // personajeDAO.eliminarPersonaje(20);

        // 4. Obtener y mostrar todos los personajes
        //List<Personaje> personajes = personajeDAO.obtenerTodosLosPersonajes();
        //System.out.println("=== Lista de Personajes ===");
        //for (Personaje p : personajes) {
        //    System.out.println(p.getId() + " | " + p.getNombre() + " | " + p.getRaza() + " | " + p.getNivel() + " | " + p.getPuntosSalud());
        //}

        List<Raza> razas = razaDAO.obtenerTodasLasRazas();
        System.out.println("=== Lista de Razas ===");
        for (Raza r : razas) {
            System.out.println(r.getId_raza() + " | " + r.getNombre_raza());
        }

    }
}

package main.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import main.Personaje;

public class PersonajeQuerys {
    
    // M�todo para insertar un personaje
    public void insertarPersonaje(Personaje personaje) {
        String insertSQL = "INSERT INTO Personajes (id_personaje, nombre_personaje, id_raza, nivel, puntos_salud) VALUES (?, ?, ?, ?, ?)";
        
        try (Connection connection = Conexion.obtenerConexion();

             PreparedStatement insertStmt = connection.prepareStatement(insertSQL)) {
            
            insertStmt.setInt(1, personaje.getId());
            insertStmt.setString(2, personaje.getNombre());
            insertStmt.setInt(3, personaje.getRaza());
            insertStmt.setInt(4, personaje.getNivel());
            insertStmt.setInt(5, personaje.getPuntosSalud());

            int rowsInserted = insertStmt.executeUpdate();
            System.out.println(rowsInserted);
            if (rowsInserted > 0) {
                System.out.println("Personaje insertado exitosamente.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // M�todo para actualizar un personaje
    public void actualizarPersonaje(Personaje personaje) {
        String updateSQL = "UPDATE Personajes SET nivel = ?, puntos_salud = ? WHERE id_personaje = ?";
        try (Connection connection = Conexion.obtenerConexion();
             PreparedStatement updateStmt = connection.prepareStatement(updateSQL)) {

            updateStmt.setInt(1, personaje.getNivel());
            updateStmt.setInt(2, personaje.getPuntosSalud());
            updateStmt.setInt(3, personaje.getId());

            int rowsUpdated = updateStmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Personaje actualizado exitosamente.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // M�todo para eliminar un personaje
    public void eliminarPersonaje(int idPersonaje) {
        String deleteSQL = "DELETE FROM Personajes WHERE id_personaje = ?";
        try (Connection connection = Conexion.obtenerConexion();
             PreparedStatement deleteStmt = connection.prepareStatement(deleteSQL)) {

            deleteStmt.setInt(1, idPersonaje);

            int rowsDeleted = deleteStmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Personaje eliminado exitosamente.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // M�todo para obtener todos los personajes
    public List<Personaje> obtenerTodosLosPersonajes() {
        List<Personaje> personajes = new ArrayList<>();
        
        String selectSQL = "SELECT * FROM Personajes";
       
        try (
        	 Connection connection = Conexion.obtenerConexion();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(selectSQL)) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id_personaje");
                String nombre = resultSet.getString("nombre_personaje");
                int raza = resultSet.getInt("id_raza");
                int nivel = resultSet.getInt("nivel");
                int puntosSalud = resultSet.getInt("puntos_salud");

                Personaje personaje = new Personaje(id, nombre, raza, nivel, puntosSalud);
                personajes.add(personaje);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return personajes;
    }
}

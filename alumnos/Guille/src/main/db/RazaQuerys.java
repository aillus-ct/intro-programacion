package main.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import main.Raza;

public class RazaQuerys {
    
    // M�todo para insertar un raza
    public void insertarRaza(Raza raza) {
        String insertSQL = "INSERT INTO Raza (id_raza, nombre_raza) VALUES (?, ?)";
        
        try (Connection connection = Conexion.obtenerConexion();
             PreparedStatement insertStmt = connection.prepareStatement(insertSQL)) {
            
            insertStmt.setInt(1, raza.getId_raza());
            insertStmt.setString(2, raza.getNombre_raza());

            int rowsInserted = insertStmt.executeUpdate();
            System.out.println(rowsInserted);
            if (rowsInserted > 0) {
                System.out.println("Raza insertada exitosamente.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // M�todo para actualizar un raza
    public void actualizarRaza(Raza raza) {
        String updateSQL = "UPDATE Raza SET nombre_raza = ? WHERE id_raza = ?";
        try (Connection connection = Conexion.obtenerConexion();
             PreparedStatement updateStmt = connection.prepareStatement(updateSQL)) {

            updateStmt.setString(1, raza.getNombre_raza());
            updateStmt.setInt(2, raza.getId_raza());

            int rowsUpdated = updateStmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Raza actualizado exitosamente.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // M�todo para eliminar un raza
    public void eliminarRaza(int idRaza) {
        String deleteSQL = "DELETE FROM Raza WHERE id_raza = ?";
        try (Connection connection = Conexion.obtenerConexion();
             PreparedStatement deleteStmt = connection.prepareStatement(deleteSQL)) {

            deleteStmt.setInt(1, idRaza);

            int rowsDeleted = deleteStmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Raza eliminado exitosamente.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // M�todo para obtener todos los razas
    public List<Raza> obtenerTodasLasRazas() {
        List<Raza> razas = new ArrayList<>();
        
        String selectSQL = "SELECT * FROM Razas";
       
        try (
        	 Connection connection = Conexion.obtenerConexion();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(selectSQL)) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id_raza");
                String nombre = resultSet.getString("nombre_raza");
                
                Raza raza = new Raza(id, nombre);
                razas.add(raza);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return razas;
    }
}

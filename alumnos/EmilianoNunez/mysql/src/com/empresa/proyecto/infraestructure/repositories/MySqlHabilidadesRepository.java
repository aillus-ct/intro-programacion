package com.empresa.proyecto.infraestructure.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.empresa.proyecto.domain.Habilidad;
import com.empresa.proyecto.domain.interfaces.HabilidadesRepositoryInterface;

public class MySqlHabilidadesRepository implements HabilidadesRepositoryInterface {

    private final Connection connection;
    
    public MySqlHabilidadesRepository(Connection connection){
        this.connection = connection;
    }

    @Override
    public List<Habilidad> findAll() {
        List<Habilidad> habilidades = new ArrayList<>();
        try {
            String query = "SELECT id_habilidad, nombre_habilidad FROM Habilidades";
            PreparedStatement stmt = connection.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                habilidades.add(new Habilidad(
                    rs.getInt("id_habilidad"), 
                    rs.getString("nombre_habilidad")));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return habilidades;
    }

    @Override
    public Habilidad add(Habilidad habilidad) {
        String query = "INSERT INTO Habilidades (id_habilidad, nombre_habilidad) VALUES (?, ?)";
        PreparedStatement stmt;
        try {
            stmt = connection.prepareStatement(query);
            stmt.setInt(1, habilidad.getId());
            stmt.setString(2, habilidad.getNombre());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return habilidad;
    }
}

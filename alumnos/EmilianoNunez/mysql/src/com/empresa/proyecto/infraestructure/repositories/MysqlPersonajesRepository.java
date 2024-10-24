package com.empresa.proyecto.infraestructure.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.empresa.proyecto.domain.Personaje;
import com.empresa.proyecto.domain.interfaces.PersonajesRepositoryInterface;

public class MysqlPersonajesRepository implements PersonajesRepositoryInterface {
    
    private final Connection connection;
    
    public MysqlPersonajesRepository(Connection connection){
        this.connection = connection;
    }

    @Override
    public List<Personaje> findAll() {
        List<Personaje> personajes = new ArrayList<>();
        try {
            String query = "SELECT id_personaje, nombre_personaje FROM Personajes";
            PreparedStatement stmt = connection.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                personajes.add(new Personaje(
                    rs.getInt("id_personaje"), 
                    rs.getString("nombre_personaje")));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return personajes;
    }

}

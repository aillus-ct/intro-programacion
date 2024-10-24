package com.empresa.proyecto;

import java.sql.Connection;
import java.sql.SQLException;

import com.empresa.proyecto.application.usescases.HabilidadesUseCases;
import com.empresa.proyecto.application.usescases.PersonajesUseCases;
import com.empresa.proyecto.domain.interfaces.HabilidadesRepositoryInterface;
import com.empresa.proyecto.domain.interfaces.PersonajesRepositoryInterface;
import com.empresa.proyecto.infraestructure.config.DatabaseConfig;
import com.empresa.proyecto.infraestructure.controller.ConsoleController;
import com.empresa.proyecto.infraestructure.repositories.MySqlHabilidadesRepository;
import com.empresa.proyecto.infraestructure.repositories.MysqlPersonajesRepository;

public class Main {
    public static void main(String[] args) {
        Connection connection = null;

        try {

            /**
             * Creamos una conexion con la Base de Datos
             */

            connection = DatabaseConfig.getConnection();

            
            /**
             * Creamos los repositorios
             */

            PersonajesRepositoryInterface personajesRepository = new MysqlPersonajesRepository(connection);
            HabilidadesRepositoryInterface habilidadesRepository = new MySqlHabilidadesRepository(connection);

            /**
             * Creamos los casos de uso
             */

            PersonajesUseCases personajesUseCases = new PersonajesUseCases(personajesRepository);
            HabilidadesUseCases HabilidadesUseCases = new HabilidadesUseCases(habilidadesRepository);

            /**
             * Creamos el controlador
             */

            ConsoleController consoleController = new ConsoleController(personajesUseCases, HabilidadesUseCases);

            /**
             * Hacemos la llamada al controllador para que ejecute el caso de uso correspondiente
             */

            consoleController.handleCommand(args);
             
        }

        catch (SQLException e) {
            System.err.println("Error SQL: " + e.getMessage());
            e.printStackTrace();
        } 

        catch (Exception e) {
            e.printStackTrace();
        } 
        
        /** 
         * El bloque Finally se ejecuta siempre
         */

        finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.err.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
        }
    }
}

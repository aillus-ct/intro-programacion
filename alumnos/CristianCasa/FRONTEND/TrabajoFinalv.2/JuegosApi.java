package com;

import static spark.Spark.*;
import com.google.gson.Gson;
import java.util.*;
import spark.Request;
import spark.Response;
import spark.Route;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class JuegosApi {
    
    private static Gson gson = new Gson();
    private static String jdbcUrl = "jdbc:mysql://146.190.118.241:3306/heroes-tp";
    private static String username = "heroestp";
    private static String password = "oficios2025!";

     public static void main(String[] args) {

        port(4567);

        get("/juegos", new Route() {
            @Override
            public Object handle(Request req, Response res) throws Exception {
                res.type("application/json");
                
                // Se conecta a la Base
                
                Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

                // Ejecutar la consulta

                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("select * from juegos");
                
                ArrayList<Juego> juegos = new ArrayList<>();
                
                while(resultSet.next()){
                    Integer id = resultSet.getInt("id");
                    String nombre = resultSet.getString("nombre");
                    String genero = resultSet.getString("genero");
                    String descripcion = resultSet.getString("descripcion");
                    String 
                    
                    Hero hero = new Hero(id, nombre, poderes, debilidades);
                    heroes.add(hero);
                }

                return gson.toJson(heroes);
            }
        });
    
}

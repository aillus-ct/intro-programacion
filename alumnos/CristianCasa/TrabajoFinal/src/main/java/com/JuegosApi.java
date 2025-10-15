package com;

import static spark.Spark.*;
import com.google.gson.Gson;
import java.util.*;
import java.util.ResourceBundle.Control; //No es necesario

import org.eclipse.jetty.client.api.Request.HeadersListener; //Tampoco es necesario

import spark.Access; //Tampoco es necesario
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

    private static  Gson gson = new Gson();
    private static String jdbcUrl = "jdbc:mysql://127.0.0.1:3306/tu_base";
    private static String username = "root";
    private static String password = "";


    private static void enableCORS() {
        options("/*", (req, res) -> {

            String headers = req.headers("Access-Control-Request-Headers");
            if (headers != null) res.header("Access-Control-Allow-Headers", headers);

            String method = req.headers("Access-Control-Request-Method");
            if (method != null) res.header("Access-Control-Allow-Methods", method);
            return "OK";

        });

        before((req, res) -> {
            res.header("Access-Control-Allow-Origin", "*");
            res.header("Access-Control-Allow-Methods", "GET,POST,PUT,DELETE,OPTIONS");
            res.header("Access-Control-Allow-Headers", "Content-Type,Authorization");
        });
    }

    public static void main(String[] args) {

        port(4567);

        jdbcUrl = "jdbc:mysql://127.0.0.1:3306/tu_base";
        username = "root";
        password = "";

        enableCORS();

        get("/juegos", new Route() {
            @Override
            public Object handle(Request req, Response res) throws Exception {
                res.type("application/json");

                // Se conecta a la Base
                Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

                // Ejecutar consulta a la base de datos
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM juegos");

                ArrayList<Juegos> juegos = new ArrayList<>();
                while (resultSet.next()) {
                    Integer id = resultSet.getInt("id");
                    String nombre = resultSet.getString("nombre");
                    String genero = resultSet.getString("genero");
                    String perspectiva = resultSet.getString("perspectiva");
                    String descripcion = resultSet.getString("descripcion");

                    Juegos juego = new Juegos(id, nombre, genero, perspectiva, descripcion);
                    juegos.add(juego);

                }
                if (juegos.isEmpty()) {
                    res.status(404);
                    return "No se encontraron juegos";
                }
                return gson.toJson(juegos);
            }

        });

        get("/juegos/:id", new Route() {
            @Override
            public Object handle(Request req, Response res) throws Exception {
                int id = Integer.parseInt(req.params(":id"));
                res.type("application/json");

                // Se conecta a la Base
                Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

                // Ejecutar consulta a la base de datos
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("select * from juegos where id = " + id);
                if (resultSet.next()) {
                    String nombre = resultSet.getString("nombre");
                    String genero = resultSet.getString("genero");
                    String perspectiva = resultSet.getString("perspectiva");
                    String descripcion = resultSet.getString("descripcion");

                    Juegos juego = new Juegos(id, nombre, genero, perspectiva, descripcion);
                    return gson.toJson(juego);
                } else {
                    res.status(404);
                    return "Juego no encontrado";
                }
            }
        });

    }
}


  




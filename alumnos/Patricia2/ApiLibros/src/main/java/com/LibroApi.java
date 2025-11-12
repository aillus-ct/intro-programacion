package com;

import static spark.Spark.*;
import com.google.gson.Gson;
import java.util.*;
import spark.Request;
import spark.Response;
import spark.Route;

public class LibroApi {

    private static List<Libro> libros = new ArrayList<>();
    private static int nextId = 1;
    private static Gson gson = new Gson();

    public static void main(String[] args) {
        port(4567);

        get("/libros", new Route() {
            @Override
            public Object handle(Request req, Response res) throws Exception {
                res.type("application/json");
                return gson.toJson(libros);
            }
        });

        get("/libros/:id", new Route() {
            @Override
            public Object handle(Request req, Response res) throws Exception {
                res.type("application/json");
                int id = Integer.parseInt(req.params(":id"));
        
                for (Libro libro : libros) 
                    if (libro.getId() == id) 
                        return gson.toJson(libro);
                
                res.status(404);
                return "";
            }
        });

        post("/libros", new Route() {
            @Override
            public Object handle(Request req, Response res) throws Exception {
                res.type("application/json");
                Libro libro = gson.fromJson(req.body(), Libro.class);
                libro = new Libro(nextId++, libro.getTitulo(), libro.getAutor(), libro.getAño(), libro.getGenero());
                libros.add(libro);
                return gson.toJson(libro);
            }
        });

        delete("/libros/:id", new Route() {
            @Override
            public Object handle(Request req, Response res) throws Exception {
                int id = Integer.parseInt(req.params(":id"));
                res.type("application/json");
                for (Libro libro : libros) {
                    if (libro.getId() == id) {
                        libros.remove(libro);
                        return gson.toJson(libro);
                    }
                }
                
                res.status(404);
                return "";
            }
        });

        put("/libros/:id", new Route() {
            @Override
            public Object handle(Request req, Response res) throws Exception {
            int id = Integer.parseInt(req.params(":id"));
                res.type("application/json");
                for (Libro libro : libros) {
                    if (libro.getId() == id) {
                        Libro libroAEditar = gson.fromJson(req.body(), Libro.class);
                        libro.setTitulo(libroAEditar.getTitulo());
                        return gson.toJson(libro);
                    }
                }
                
                res.status(404);
                return "";
            }
        });
    }
}

package com;

import static spark.Spark.*;
import com.google.gson.Gson;
import java.util.*;
import spark.Request;
import spark.Response;
import spark.Route;

public class MascotaApi {

    private static List<Mascota> mascotas= new ArrayList<>();
    private static int nextId = 1;
    private static Gson gson = new Gson();

    public static void main(String[] args) {
        port(4567);

        get("/mascotas", new Route() {
            @Override
            public Object handle(Request req, Response res) throws Exception {
                res.type("application/json");
                return gson.toJson(mascotas);
            }
        });

        get("/mascotas/:id", new Route() {
            @Override
            public Object handle(Request req, Response res) throws Exception {
                res.type("application/json");
                int id = Integer.parseInt(req.params(":id"));
        
                for (Mascota mascota : mascotas) 
                    if (mascota.getId() == id) 
                        return gson.toJson(mascota);
                
                res.status(404);
                return "";
            }
        });

        post("/mascotas", new Route() {
            @Override
            public Object handle(Request req, Response res) throws Exception {
                res.type("application/json");
                Mascota mascota = gson.fromJson(req.body(), Mascota.class);
                mascota = new Mascota(nextId++, mascota.getNombre(), mascota.getTipo(), mascota.getEdad());
                mascotas.add(mascota);
                return gson.toJson(mascota);
            }
        });

        delete("/mascotas/:id", new Route() {
            @Override
            public Object handle(Request req, Response res) throws Exception {
                int id = Integer.parseInt(req.params(":id"));
                res.type("application/json");
                for (Mascota mascota : mascotas) {
                    if (mascota.getId() == id) {
                        mascotas.remove(mascota);
                        return gson.toJson(mascota);
                    }
                }
                
                res.status(404);
                return "";
            }
        });

        put("/mascotas/:id", new Route() {
            @Override
            public Object handle(Request req, Response res) throws Exception {
            int id = Integer.parseInt(req.params(":id"));
                res.type("application/json");
                for (Mascota mascota : mascotas) {
                    if (mascota.getId() == id) {
                        Mascota mascotaAEditar = gson.fromJson(req.body(), Mascota.class);
                        mascota.setTipo(mascotaAEditar.getTipo());
                        return gson.toJson(mascota);
                    }
                }
                
                res.status(404);
                return "";
            }
        });
    }
}

package com;

import static spark.Spark.*;
import com.google.gson.Gson;
import java.util.*;
import spark.Request;
import spark.Response;
import spark.Route;

public class HerosApi {

    private static List<Hero> heroes = new ArrayList<>();
    private static int nextId = 1;
    private static Gson gson = new Gson();

    public static void main(String[] args) {
        port(4567);

        get("/heroes", new Route() {
            @Override
            public Object handle(Request req, Response res) throws Exception {
                res.type("application/json");
                return gson.toJson(heroes);
            }
        });

        get("/heroes/:id", new Route() {
            @Override
            public Object handle(Request req, Response res) throws Exception {
                res.type("application/json");
                int id = Integer.parseInt(req.params("id"));

                for (Hero h : heroes) 
                    if (h.getId() == id) 
                        return gson.toJson(h);
                
                res.status(404);
                return "";
            }
        });

        post("/heroes", new Route() {
            @Override
            public Object handle(Request req, Response res) throws Exception {
                res.type("application/json");
                Hero hero = gson.fromJson(req.body(), Hero.class);
                hero = new Hero(nextId++, hero.getNombre(), hero.getPoderes(), hero.getDebilidades());
                heroes.add(hero);
                return gson.toJson(hero);
            }
        });
    
        delete("/heroes/:id", new Route() {
            @Override
            public Object handle(Request req, Response res) throws Exception {
                int id = Integer.parseInt(req.params(":id"));
                res.type("application/json");
                for (Hero h : heroes) {
                    if (h.getId() == id) {
                        heroes.remove(h);
                        return gson.toJson(h);
                    }
                }
                
                res.status(404);
                return "";
            }
        });
    }
}

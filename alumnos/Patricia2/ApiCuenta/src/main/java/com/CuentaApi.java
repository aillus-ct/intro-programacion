package com;

import static spark.Spark.*;
import com.google.gson.Gson;
import java.util.*;
import spark.Request;
import spark.Response;
import spark.Route;

public class CuentaApi {

    private static List<Cuenta> cuentas = new ArrayList<>();
    private static int nextId = 1;
    private static Gson gson = new Gson();

    public static void main(String[] args) {
        port(4567);

        get("/cuentas", new Route() {
            @Override
            public Object handle(Request req, Response res) throws Exception {
                res.type("application/json");
                return gson.toJson(cuentas);
            }
        });

        get("/cuentas/:id", new Route() {
            @Override
            public Object handle(Request req, Response res) throws Exception {
                res.type("application/json");
                int id = Integer.parseInt(req.params(":id"));
        
                for (Cuenta c : cuentas) 
                    if (c.getId() == id) 
                        return gson.toJson(c);
                
                res.status(404);
                return "";
            }
        });

        post("/cuentas", new Route() {
            @Override
            public Object handle(Request req, Response res) throws Exception {
                res.type("application/json");
                Cuenta cuenta = gson.fromJson(req.body(), Cuenta.class);
                cuenta = new Cuenta(nextId++, cuenta.getNombre(), cuenta.getSaldo());
                cuentas.add(cuenta);
                return gson.toJson(cuenta);
            }
        });

        delete("/cuentas/:id", new Route() {
            @Override
            public Object handle(Request req, Response res) throws Exception {
                int id = Integer.parseInt(req.params(":id"));
                res.type("application/json");
                for (Cuenta c : cuentas) {
                    if (c.getId() == id) {
                        cuentas.remove(c);
                        return gson.toJson(c);
                    }
                }
                
                res.status(404);
                return "";
            }
        });

        put("/cuentas/:id", new Route() {
            @Override
            public Object handle(Request req, Response res) throws Exception {
            int id = Integer.parseInt(req.params(":id"));
                res.type("application/json");
                for (Cuenta c : cuentas) {
                    if (c.getId() == id) {
                        Cuenta cuentaBody = gson.fromJson(req.body(), Cuenta.class);
                        c.setNombre(cuentaBody.getNombre());
                        return gson.toJson(c);
                    }
                }
                
                res.status(404);
                return "";
            }
        });
    }
}

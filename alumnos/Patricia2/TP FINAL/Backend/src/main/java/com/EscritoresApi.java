package com;

/*import static spark.Spark.before;
import static spark.Spark.delete;
import static spark.Spark.get;
import static spark.Spark.options;
import static spark.Spark.port;
import static spark.Spark.post;*/
import static spark.Spark.*;

//import java.util.ArrayList;
import java.util.*;

import com.google.gson.Gson;

import spark.Request;
import spark.Response;
import spark.Route;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.SQLException;

public class EscritoresApi {

    private static Gson gson = new Gson();
    private static String jdbcUrl = "jdbc:mysql://146.190.118.241:3306/tp2025";
    private static String username = "oficios2025";
    private static String password = "Oficios2025!";

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

    //  Validar formato de URL
    private static boolean isValidURL(String url) {
        try {
            java.net.URL urlObj = new java.net.URL(url);
            return url.startsWith("http://") || url.startsWith("https://");
        } catch (Exception e) {
            return false;
        }
    }

    // ✅ MÉTODO CENTRALIZADO DE VALIDACIONES
    private static String validarEscritor(Escritores escritor, boolean esActualizacion, Integer idActual) {
        // escritor: objeto a validar, esActualizacion: true si es PUT, false si es POST, idActual: id del escritor en caso de ser PUT
        // VALIDACIÓN 1: Verificar que el objeto no sea null
        if (escritor == null) {
            return "Los datos del escritor son requeridos";
        }
        
        // VALIDACIÓN 2: Campos obligatorios 
        if (escritor.getNombre() == null || escritor.getNombre().trim().isEmpty()) {
            return "El nombre es obligatorio";
        }
        
        if (escritor.getPais() == null || escritor.getPais().trim().isEmpty()) {
            return "El país es obligatorio";
        }
        
        if (escritor.getGenero() == null || escritor.getGenero().trim().isEmpty()) {
            return "El género es obligatorio";
        }
        
        if (escritor.getDescripcion() == null || escritor.getDescripcion().trim().isEmpty()) {
            return "La descripción es obligatoria";
        }
        
        if (escritor.getObras() == null || escritor.getObras().trim().isEmpty()) {
            return "Las obras son obligatorias";
        }
        
        if (escritor.getUrlImagen() == null || escritor.getUrlImagen().trim().isEmpty()) {
            return "La URL de la imagen es obligatoria";
        }
        
        // VALIDACIÓN 3: Longitud de campos
        if (escritor.getNombre().trim().length() < 2) {
            return "El nombre debe tener al menos 2 caracteres";
        }
        
        if (escritor.getNombre().trim().length() > 100) {
            return "El nombre no puede tener más de 100 caracteres";
        }
        
        if (escritor.getDescripcion().trim().length() < 10) {
            return "La descripción debe tener al menos 10 caracteres";
        }
        
        if (escritor.getDescripcion().trim().length() > 1000) {
            return "La descripción no puede tener más de 1000 caracteres";
        }
        
        // VALIDACIÓN 4: Formato de URL
        if (!isValidURL(escritor.getUrlImagen())) {
            return "La URL de la imagen no tiene un formato válido";
        }
        
        // VALIDACIÓN 5: Verificar unicidad del nombre (solo si no es actualización del mismo registro)
        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            String query;
            PreparedStatement checkStatement;
            
            if (esActualizacion && idActual != null) {
                // Para PUT: verificar que no exista otro escritor con el mismo nombre (excepto el actual)
                query = "SELECT COUNT(*) FROM escritores WHERE nombre = ? AND id != ?";
                checkStatement = connection.prepareStatement(query);
                checkStatement.setString(1, escritor.getNombre().trim());
                checkStatement.setInt(2, idActual);
            } else {
                // Para POST: verificar que no exista ningún escritor con ese nombre
                query = "SELECT COUNT(*) FROM escritores WHERE nombre = ?";
                checkStatement = connection.prepareStatement(query);
                checkStatement.setString(1, escritor.getNombre().trim());
            }
            
            ResultSet checkResult = checkStatement.executeQuery();
            
            if (checkResult.next() && checkResult.getInt(1) > 0) {
                connection.close();
                return "Ya existe un escritor con ese nombre";
            }
            
            connection.close();
            
        } catch (Exception e) {
            return "Error al verificar la unicidad del nombre: " + e.getMessage();
        }
        
        // Si llegamos aquí, todas las validaciones pasaron
        return null;
    }

    // ✅ MÉTODO PARA SANITIZAR DATOS - remover espacios de más
    private static void sanitizarEscritor(Escritores escritor) {
        escritor.setNombre(escritor.getNombre().trim());
        escritor.setPais(escritor.getPais().trim());
        escritor.setGenero(escritor.getGenero().trim());
        escritor.setDescripcion(escritor.getDescripcion().trim());
        escritor.setObras(escritor.getObras().trim());
        escritor.setUrlImagen(escritor.getUrlImagen().trim());
    }

    // ✅ MÉTODO CENTRALIZADO PARA VALIDAR ID - debe ser un entero positivo
    private static int validarId(String idParam) throws IllegalArgumentException {
        try {
            int id = Integer.parseInt(idParam);
            if (id <= 0) {
                throw new IllegalArgumentException("El ID debe ser un número positivo mayor a 0");
            }
            return id;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("El ID debe ser un número válido");
        }
    }
    
    // Sanitizar texto (remover caracteres peligrosos o espacios de más)
    private static String sanitizarTexto(String texto) {
        if (texto == null) return null;
        return texto.replaceAll("[<>\"'&]", "").trim();
    }

    public static void main(String[] args) {

        port(4567);

        enableCORS();
  
        get("/escritores", new Route() {
            @Override
            public Object handle(Request req, Response res) throws Exception {
                res.type("application/json");

                // conexión a la base de datos
                Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

                // ejecutar la consulta
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM escritores");

                ArrayList<Escritores> escritor = new ArrayList<>();

                while (resultSet.next()) {
                    Integer id = resultSet.getInt("id");
                    String nombre = resultSet.getString("nombre");
                    String pais = resultSet.getString("pais");
                    String genero = resultSet.getString("genero");
                    String descripcion = resultSet.getString("descripcion");
                    String obras = resultSet.getString("obras");
                    String urlImagen = resultSet.getString("urlImagen");

                    Escritores e = new Escritores(id, nombre, pais, genero, descripcion, obras, urlImagen);
                    escritor.add(e);
                }
                if (escritor.isEmpty()) {
                    res.status(404);
                    return "No se encontraron escritores.";
                }
                return gson.toJson(escritor);
                
            }
        });

        get("/escritores/:id", new Route() {
            @Override
            public Object handle(Request req, Response res) throws Exception {
                res.type("application/json");
                
                // ✅ VALIDACIÓN 1: Usar método centralizado para validar ID
                int id;
                try {
                    id = validarId(req.params("id"));
                } catch (IllegalArgumentException e) {
                    res.status(400);
                    return gson.toJson(Map.of("error", e.getMessage()));
                }

                // conexión a la base de datos
                Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
                // ejecutar la consulta
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM escritores where id=" + id);

                if(resultSet.next()) {
                    Integer _id = resultSet.getInt("id");
                    String nombre = resultSet.getString("nombre");
                    String pais = resultSet.getString("pais");
                    String genero = resultSet.getString("genero");
                    String descripcion = resultSet.getString("descripcion");
                    String obras = resultSet.getString("obras");
                    String urlImagen = resultSet.getString("urlImagen");

                    Escritores e = new Escritores(_id, nombre, pais, genero, descripcion, obras, urlImagen);
                    return gson.toJson(e);
                } else {
                    res.status(404);
                    return gson.toJson(Map.of("error", "No se encontró el escritor con id: " + id));
                }

            }
        });

        post("/escritores", new Route() {
            @Override
            public Object handle(Request req, Response res) throws Exception {
                res.type("application/json");
                
                // VALIDACIÓN 1: Verificar que el body no esté vacío
                if (req.body() == null || req.body().trim().isEmpty()) {
                    res.status(400);
                    return gson.toJson(Map.of("error", "El cuerpo de la petición no puede estar vacío"));
                }
                
                Escritores nuevoEscritor;
                try {
                    nuevoEscritor = gson.fromJson(req.body(), Escritores.class);
                } catch (Exception e) {
                    res.status(400);
                    return gson.toJson(Map.of("error", "Formato JSON inválido"));
                }
                
                // VALIDACIÓN 2: Verificar que el objeto no sea null y usar validaciones centralizadas
                if (nuevoEscritor == null) {
                    res.status(400);
                    return gson.toJson(Map.of("error", "Los datos del escritor son requeridos"));
                }
                
                // ✅ VALIDACIÓN 3: Usar método centralizado de validaciones
                String errorValidacion = validarEscritor(nuevoEscritor, false, null);
                if (errorValidacion != null) {
                    res.status(errorValidacion.contains("Ya existe") ? 409 : 400);
                    return gson.toJson(Map.of("error", errorValidacion));
                }
                
                // ✅ SANITIZAR datos
                sanitizarEscritor(nuevoEscritor);
                
                // INSERTAR en la base de datos
                Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
                PreparedStatement preparedStatement = connection.prepareStatement(
                    "INSERT INTO escritores (nombre, pais, genero, descripcion, obras, urlImagen) VALUES (?, ?, ?, ?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS
                );
                // bindear los parámetros
                preparedStatement.setString(1, nuevoEscritor.getNombre());
                preparedStatement.setString(2, nuevoEscritor.getPais());
                preparedStatement.setString(3, nuevoEscritor.getGenero());
                preparedStatement.setString(4, nuevoEscritor.getDescripcion());
                preparedStatement.setString(5, nuevoEscritor.getObras());
                preparedStatement.setString(6, nuevoEscritor.getUrlImagen());
               
                // ejecutar el insert
                preparedStatement.executeUpdate();
                
                // obtener el id generado                                                                                                                       
                ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
                
                if (generatedKeys.next()) {
                    int lastInsertedId = generatedKeys.getInt(1);
                    nuevoEscritor.setId(lastInsertedId);
                    System.out.println("Escritor insertado con ID: " + lastInsertedId);
                } else {
                    System.out.println("No se pudo obtener el ID generado.");
                }
                
                // Cerrar conexiones
                preparedStatement.close();
                connection.close();
                
                res.status(201);

                //devolver el escritor insertado
                return gson.toJson(nuevoEscritor);
            }
        });
    
        delete("/escritores/:id", new Route() {
            @Override
            public Object handle(Request req, Response res) throws Exception {
                res.type("application/json");
                
                // ✅ VALIDACIÓN 1: Usar método centralizado para validar ID
                int id;
                try {
                    id = validarId(req.params("id"));
                } catch (IllegalArgumentException e) {
                    res.status(400);
                    return gson.toJson(Map.of("error", e.getMessage()));
                }
                
                // conexión a la base de datos
                Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
                
                //  VALIDACIÓN 2: Verificar que el escritor existe antes de eliminar
                PreparedStatement checkStatement = connection.prepareStatement("SELECT COUNT(*) FROM escritores WHERE id = ?");
                checkStatement.setInt(1, id);
                ResultSet checkResult = checkStatement.executeQuery();
                
                if (checkResult.next() && checkResult.getInt(1) == 0) {
                    res.status(404);
                    return gson.toJson(Map.of("error", "No se encontró el escritor con id: " + id));
                }
                
                // prepara la consulta
                PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM escritores WHERE id = ?");
                preparedStatement.setInt(1, id);

                // ejecutar la consulta
                int rowsAffected = preparedStatement.executeUpdate();
                System.out.println("Filas eliminadas: " + rowsAffected);
                
                if (rowsAffected > 0) {
                    res.status(200);
                    return gson.toJson(Map.of("message", "Escritor eliminado exitosamente", "id", id));
                } else {
                    res.status(500);
                    return gson.toJson(Map.of("error", "Error interno del servidor al eliminar"));
                }
            }
        });

         put("/escritores/:id", new Route() {
            @Override
            public Object handle(Request req, Response res) throws Exception {
                res.type("application/json");
                
                // ✅ VALIDACIÓN 1: Usar método centralizado para validar ID
                int id;
                try {
                    id = validarId(req.params("id"));
                } catch (IllegalArgumentException e) {
                    res.status(400);
                    return gson.toJson(Map.of("error", e.getMessage()));
                }
                
                // VALIDACIÓN 2: Verificar que el body no esté vacío
                if (req.body() == null || req.body().trim().isEmpty()) {
                    res.status(400);
                    return gson.toJson(Map.of("error", "El cuerpo de la petición no puede estar vacío"));
                }
                
                // VALIDACIÓN 3: Parsear JSON
                Escritores escritorActualizado;
                try {
                    escritorActualizado = gson.fromJson(req.body(), Escritores.class);
                } catch (Exception e) {
                    res.status(400);
                    return gson.toJson(Map.of("error", "Formato JSON inválido"));
                }
                
                // ✅ VALIDACIÓN 4: Usar método centralizado de validaciones (para actualización)
                String errorValidacion = validarEscritor(escritorActualizado, true, id);
                if (errorValidacion != null) {
                    res.status(errorValidacion.contains("Ya existe") ? 409 : 400);
                    return gson.toJson(Map.of("error", errorValidacion));
                }
                
                // ✅ SANITIZAR datos
                sanitizarEscritor(escritorActualizado);

                // ACTUALIZAR en la base de datos
                Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
                
                // Verificar que el escritor existe antes de actualizar
                PreparedStatement checkStatement = connection.prepareStatement("SELECT COUNT(*) FROM escritores WHERE id = ?");
                checkStatement.setInt(1, id);
                ResultSet checkResult = checkStatement.executeQuery();
                
                if (!checkResult.next() || checkResult.getInt(1) == 0) {
                    connection.close();
                    res.status(404);
                    return gson.toJson(Map.of("error", "No se encontró el escritor con id: " + id));
                }
                
                // Preparar la consulta de actualización
                PreparedStatement preparedStatement = connection.prepareStatement(
                    "UPDATE escritores SET nombre = ?, pais = ?, genero = ?, descripcion = ?, obras = ?, urlImagen = ? WHERE id = ?"
                );
                
                // Bindear los parámetros
                preparedStatement.setString(1, escritorActualizado.getNombre());
                preparedStatement.setString(2, escritorActualizado.getPais());
                preparedStatement.setString(3, escritorActualizado.getGenero());
                preparedStatement.setString(4, escritorActualizado.getDescripcion());
                preparedStatement.setString(5, escritorActualizado.getObras());
                preparedStatement.setString(6, escritorActualizado.getUrlImagen());
                preparedStatement.setInt(7, id);

                // Ejecutar la actualización
                int rowsAffected = preparedStatement.executeUpdate();
                
                // Cerrar conexiones
                preparedStatement.close();
                connection.close();
                
                if (rowsAffected > 0) {
                    escritorActualizado.setId(id);
                    return gson.toJson(escritorActualizado);
                } else {
                    res.status(404);
                    return gson.toJson(Map.of("error", "No se encontró el escritor con id: " + id));
                }
            }
        });
    }
}


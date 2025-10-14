public class HerosApi {

    public static void main(String[] args) {

        port(4567);

        get("/juegos", new Route() {
            @Override
            public Object handle(Request req, Response res) throws Exception {
                res.type("application/json");
            
        });

        
        get("/heroes/:id", new Route() {
            @Override
            public Object handle(Request req, Response res) throws Exception {

               
            }
        });

    
        post("/heroes", new Route() {
            @Override
            public Object handle(Request req, Response res) throws Exception {
                res.type("application/json");

                

                // Bindear los campos

                preparedStatement.setString(1, hero.getNombre());
                preparedStatement.setString(2, hero.getPoderes());
                preparedStatement.setString(3, hero.getDebilidades());

                // Ejecutar el INSERT

                preparedStatement.executeUpdate();

                // Obtener el ID generado por la DB

                ResultSet generatedKeys = preparedStatement.getGeneratedKeys();

                if (generatedKeys.next()) {
                    int lastInsertedId = generatedKeys.getInt(1);
                    hero.setId(lastInsertedId);
                    System.out.println("Last inserted ID: " + lastInsertedId);
                } else {
                    System.out.println("Error ejecutando el insert");
                }

                // Devolver el heroe
                
                return gson.toJson(hero);
            }
        });
    
        delete("/heroes/:id", new Route() {
            @Override
            public Object handle(Request req, Response res) throws Exception {
                int id = Integer.parseInt(req.params(":id"));
                res.type("application/json");
                
                // Se conecta a la Base
                
                Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

                // Prepara consulta

                PreparedStatement preparedStatement = connection.prepareStatement("delete from heroes where id = ?");
                preparedStatement.setInt(1, id); 

                // Ejecutar consulta

                int rowsAffected = preparedStatement.executeUpdate();
                System.out.println(rowsAffected + " row(s) deleted successfully.");

                if (rowsAffected > 0){
                    res.status(200);
                    return rowsAffected + " filas(s) borradas";
                }else{
                    res.status(404);
                    return "No existe un registro con ese id";
                }
            }
        });
    }
}
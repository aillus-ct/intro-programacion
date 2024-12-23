package Main.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion1 {
    static String jdbcUrl = "jdbc:mysql://45.55.169.185:3306/tp_patricia";
    static String username = "patricia";
    static String password = "Patricia2024!";

    public static Connection obtenerConexion1() throws SQLException {
        return DriverManager.getConnection(jdbcUrl, username, password);
    }
    
}



    

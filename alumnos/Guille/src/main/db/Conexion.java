package main.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    static String url = "jdbc:mysql://45.55.169.185:3306/cursojava";
    static String user = "tallerjava";
    static String password = "Newen2024!";

    public static Connection obtenerConexion() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
}

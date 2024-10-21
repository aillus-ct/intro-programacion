package com.empresa.proyecto.infraestructure.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfig {
    private static final String URL = "jdbc:mysql://45.55.169.185:3306/cursojava";
    private static final String USER = "tallerjava";
    private static final String PASSWORD = "Newen2024!";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}


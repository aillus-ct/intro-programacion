package com;

public class Mascota {
    private int id;
    private String nombre;
    private String tipo;
    private int edad;

    //Constructor
    public Mascota(int id, String nombre, String tipo, int edad) {
        this.id = id;
        this.nombre = nombre;
        this. tipo = tipo;
        this.edad = edad;
    }

    //Getters
    public int getId() { return id; }

    public String getNombre() { return nombre; }

    public String getTipo() { return tipo; }

    public int getEdad() { return edad; }

    //Setters
    public void setId(int id) { this.id = id; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public void setTipo(String tipo) { this.tipo = tipo; }

    public void setEdad(int edad) { this.edad = edad; }
    
}

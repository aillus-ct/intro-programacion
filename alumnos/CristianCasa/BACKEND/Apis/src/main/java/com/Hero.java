package com;

public class Hero {
    // Propiedades

    private int id;
    private String nombre;
    private String poderes;
    private String debilidades;

    // Metodos 

    // Constructores

    public Hero(){

    }

    public Hero(String nombre, String poderes) {
        this.nombre = nombre;
        this.poderes = poderes;
    }

    public Hero(int id, String nombre, String poderes, String debilidades) {
        this.id = id;
        this.nombre = nombre;
        this.poderes = poderes;
        this.debilidades = debilidades;
    }

    // Getters
    public int getId() { return id; }

    public String getNombre() { return nombre; }
    public String getPoderes() { return poderes; }
    public String getDebilidades() { return debilidades; }
    
    // Setters
    public void setId(Integer id) { this.id = id; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setPoderes(String poderes) { this.poderes = poderes; }
    public void setDebilidades(String debilidades) { this.debilidades = debilidades; }
}
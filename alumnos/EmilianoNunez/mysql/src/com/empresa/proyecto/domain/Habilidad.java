package com.empresa.proyecto.domain;

public class Habilidad {
    private int id;
    private String nombre;

    public Habilidad(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId(){
        return id;
    }
    
    public String getNombre(){
        return nombre;
    }   
}

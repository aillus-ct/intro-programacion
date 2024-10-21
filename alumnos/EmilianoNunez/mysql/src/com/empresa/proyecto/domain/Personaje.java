package com.empresa.proyecto.domain;

public class Personaje {
    private int id;
    private String nombre;

    public Personaje(int id, String nombre) {
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
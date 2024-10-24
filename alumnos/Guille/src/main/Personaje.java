package main;

public class Personaje {
    private int id;
    private String nombre;
    private int raza;
    private int nivel;
    private int puntosSalud;

    // Constructor
    public Personaje(int id, String nombre, int raza, int nivel, int puntosSalud) {
        this.id = id;
        this.nombre = nombre;
        this.raza = raza;
        this.nivel = nivel;
        this.puntosSalud = puntosSalud;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getRaza() {
        return raza;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPuntosSalud() {
        return puntosSalud;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setPuntosSalud(int puntosSalud) {
        this.puntosSalud = puntosSalud;
    }
}

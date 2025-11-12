package com;

public class Cuenta {
    private int id;
    private String nombre;
    private double saldo;

    //Constructor
    public Cuenta(int id, String nombre, double saldo) {
        this.id = id;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    //Getters
    public int getId() { return id; }

    public String getNombre() { return nombre; }

    public double getSaldo() { return saldo; }

    //Setters
    public void setId(int id) { this.id = id; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public void setSaldo(double saldo) { this.saldo = saldo; }

    
}

package com;

public class Cuenta { 
    private String name;
    private double saldo;
    private int id;

    public Cuenta(String name, double saldo, int id) {
        this.name = name;
        this.saldo = saldo;
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    

    public int getId() {
        return id;
    }
    public void setId (int id) {
        this.id = id;
    }
}

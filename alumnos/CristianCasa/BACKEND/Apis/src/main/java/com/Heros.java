package com;



// Propiedades
public class Heros {
    private int id;
    private String name;
    private String power;
    private String avatar;  

// Constructor

    public Heros(String name, String power, String avatar) {
        this.name = name;
        this.power = power;
        this.avatar = avatar;
    }

    public Heros(int id, String name, String power, String avatar) {
        this.id = id;
        this.power = power;
        this.name = name;
        this.avatar = avatar;
    }


    // Getters
    public int getId() { return id;}

    public String getName() {return name; }

    public String getPower() {return power; }

    public String getAvatar() {return avatar;}

}


// Setters

    public void setId(int id) { this.id = id; }

    public void setName(String name) { this.name = name; }

    public void setPower(String power) { this.power = power; }

    public void setAvatar(String avatar) { this.avatar = avatar; }

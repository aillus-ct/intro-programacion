package com;

public class Escritores {
    private int id;
    private String nombre;
    private String pais;
    private String genero;
    private String descripcion;
    private String obras;
    private String urlImagen;

    //Constructor
    public Escritores(int id, String nombre, String pais, String genero, String descripcion, String obras, String urlImagen) {
        this.id = id;
        this.nombre = nombre;
        this.pais = pais;
        this.genero = genero;
        this.descripcion = descripcion;
        this.obras = obras;
        this.urlImagen = urlImagen;
    }

    //Getters
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getPais() { return pais; }
    public String getGenero() { return genero; }
    public String getDescripcion() { return descripcion; } 
    public String getObras() { return obras; }
    public String getUrlImagen() { return urlImagen; }

    //Setters
    public void setId(Integer id) { this.id = id; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setPais(String pais) { this.pais = pais; }
    public void setGenero(String genero) { this.genero = genero; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public void setObras(String obras) { this.obras = obras; }
    public void setUrlImagen(String urlImagen) { this.urlImagen = urlImagen; }

}

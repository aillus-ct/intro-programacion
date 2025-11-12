package com;

public class Libro {
    private int id;
    private String titulo;
    private String autor;
    private int año;
    private String genero;

    //Constructor
    public Libro(int id, String titulo, String autor, int año, String genero) {
        this.id = id;
        this.titulo = titulo;
        this. autor = autor;
        this.año = año;
        this.genero = genero;
    }

    //Getters
    public int getId() { return id; }

    public String getTitulo() { return titulo; }

    public String getAutor() { return autor; }

    public int getAño() { return año; }

    public String getGenero() { return genero; }

    //Setters
    public void setId(int id) { this.id = id; }

    public void setTitulo(String titulo) { this.titulo = titulo; }

    public void setAutor(String autor) { this.autor = autor; }

    public void setAño(int año) { this.año = año; }

    public void setGenero(String genero) { this.genero = genero; }
    
}

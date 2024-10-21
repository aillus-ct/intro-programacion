package main;

public class Raza {
	
	int id_raza;
	String nombre_raza;
	
	public Raza(int id_raza, String nombre_raza) {
		this.id_raza = id_raza;
		this.nombre_raza = nombre_raza;
	}
	
	public int getId_raza() {
		return id_raza;
	}

	public void setId_raza(int id_raza) {
		this.id_raza = id_raza;
	}

	public String getNombre_raza() {
		return nombre_raza;
	}

	public void setNombre_raza(String nombre_raza) {
		this.nombre_raza = nombre_raza;
	}

}

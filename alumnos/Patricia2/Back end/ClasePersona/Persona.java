public class Persona {
    private String nombre;
    private int edad;
    private String genero;

    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String esMayorDeEdad() {
        if (edad >= 18 ){
            return "La persona es mayor de edad.";
        } else {
            return "La persona es menor de edad.";
        }
    }

    public String mostrarInformacion() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Género: " + genero;
    }
}

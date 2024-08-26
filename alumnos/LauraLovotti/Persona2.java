abstract public class Persona2 {
    String nombre;
    int edad;

    public Persona2 (String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
     public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setEdad(int edad){
        this.edad = edad; 
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getEdad(){
        return this.edad;
    }
    abstract void mostrarInformacion();
    public String getNombreEdad(){
        return this.nombre + this.edad;
    } 
}
public class Personas {
    
    private String nombre;
    private int edad;

    public Personas (String nombre, int edad){
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

    public void mostrarInformacion(){
        System.out.println("El nombre es: " + this.nombre + "\nLa edad es: " + this.edad);
    }

}

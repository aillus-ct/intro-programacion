public class Estudiantes extends Persona {

    private String grado;
    private double promedio;

    public Estudiantes(String nombre, int edad, String grado, double promedio){
        super(nombre, edad);
        this.grado = grado;
        this.promedio = promedio;
    }
    
    public void mostrarInformacion(){
        System.out.println("Nombre: " + nombre + "\nEdad: " + edad + "\ngrado: " + grado + "\nPomedio: " + promedio);

    }
}

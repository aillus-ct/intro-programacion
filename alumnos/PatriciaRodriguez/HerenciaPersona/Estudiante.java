package HerenciaPersona;
public class Estudiante extends PersonaDos{
    private String grado;
    private double promedio;

    public Estudiante(String nombre, int edad, String grado, double promedio){
        super(nombre, edad);
        this.grado = grado;
        this.promedio = promedio;
    }
    
    
    public void mostrarInformacion(){
        System.out.println("La estudiante ");
        super.mostrarInformacion();
        System.out.println(" Va a " + grado + " y tiene un promedio de " + promedio);
    }
    
}

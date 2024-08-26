public class Estudiante extends Persona2{
    private String grado;
    private double promedio;

    public Estudiante(String nombre, int edad, String grado, double promedio){
        super (nombre, edad);
        this.grado = grado;
        this.promedio = promedio;
    }

    public void setPromedio(double promedio){
        this.promedio = promedio;
    }
    public void setGrado(String grado){
       this.grado = grado;
    }
    
    public double getPromedio(){
        return this.promedio;
    }
    public String getGrado(){
        return this.grado;
    }

    public void mostrarInformacion(){
        System.out.println("El estudiante: " + this.nombre + " tiene " + this.edad + " años, concurre al grado " + this.grado +
         " y tiene un promedio de " + this.promedio);
    }

}
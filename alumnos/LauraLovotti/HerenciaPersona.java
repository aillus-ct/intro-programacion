public class HerenciaPersona {
    public static void main (String [] args){
        Empleado empleado1 = new Empleado("Laura", 47, 123.5, "cajera");
        empleado1.mostrarInformacion();
        Estudiante estudiante1 = new Estudiante("Gino", 11 , "Septimo", 8.5);
        estudiante1.mostrarInformacion();
              
    }    
}
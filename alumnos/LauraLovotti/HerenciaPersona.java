public class HerenciaPersona {
    public static void main (String [] args){
        
        Empleado empleado1 = new Empleado("Laura", 47, 123.5, "cajera");
    
        Estudiante estudiante1 = new Estudiante("Gino", 11 , "Septimo", 8.5);
        
        Persona2[] personas = {empleado1, estudiante1};
        for (Persona2 persona : personas){
            persona.mostrarInformacion();
        }
    }    
}
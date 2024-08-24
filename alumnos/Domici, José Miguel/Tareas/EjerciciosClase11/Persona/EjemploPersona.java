public class EjemploPersona {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Pepito", 18, "Masculino");
        
        Empleados empleado1 = new Empleados("Juan perez", 35, 1000000, "Operario");
        Empleados empleado2 = new Empleados("Diego Garcia", 55, 1100000, "Supervisor");

        Estudiantes estudiante1 = new Estudiantes("Matías Magdaleno", 17, "5°", 8.42);
        Estudiantes estudiante2 = new Estudiantes("Franco Basualdo", 17, "5°", 7.5);

        persona1.mostrarInformacion();
        
        System.out.println(persona1.esMayorDeEdad() ? "Mayor" : "Menor");
        
        String esMayor = persona1.esMayorDeEdadString();
        System.out.println(esMayor);

        persona1.setNombre("Juan");
        System.out.println(persona1.getNombre());

        System.out.println();
        System.out.println("Informacion de los empleados");
        empleado1.mostrarInformacion();
        empleado2.mostrarInformacion();

        System.out.println();
        System.out.println("Informacion de los estudiantes");
        estudiante1.mostrarInformacion();
        estudiante2.mostrarInformacion();
       
        
    }
    
}
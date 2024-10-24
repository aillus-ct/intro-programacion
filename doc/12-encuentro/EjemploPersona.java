public class EjemploPersona {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Pepito", 18, "Masculino");

        persona1.mostrarInformacion();
        
        System.out.println(persona1.esMayorDeEdad() ? "Mayor" : "Menor");
        
        String esMayor = persona1.esMayorDeEdadString();
        System.out.println(esMayor);

        persona1.setNombre("Juan");
        System.out.println(persona1.getNombre());
        
    }
    
}

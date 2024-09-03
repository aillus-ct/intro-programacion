public class PersonaEjemplo {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Pepito", 18, "Masculino");

        persona1.mostrarInformacion();
        // este es con el operador ternario
        System.out.println(persona1.esMayorDeEdad() ? "Mayor" : "Menor");
        
        String esMayor = persona1.esMayorDeEdadString();
        System.out.println(esMayor);

        persona1.setNombre("Juan");
        System.out.println(persona1.getNombre());
    }   

}


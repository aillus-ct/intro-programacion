public class PrincipalPersona {
    public static void main(String[] args) {
        Persona persona = new Persona("Juliana", 45, "Femenino");
        System.out.println(persona.mostrarInformacion());
        System.out.println(persona.esMayorDeEdad());
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayDePersonas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Personas> personas = new ArrayList<>();

   
        while (true) {
            System.out.println("Ingrese el nombre de una persona:");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese la edad de la persona:");
            int edad = Integer.parseInt(scanner.nextLine());

            Personas persona = new Personas(nombre, edad);
            personas.add(persona);

            
            System.out.println("¿Desea ingresar otra persona? (Sí/No)");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("No")) {
                break;
            }
        }

        System.out.println();

        int suma = 0;
        for (Personas persona : personas) {
            suma += persona.getEdad();
        }
        int length = personas.size();
        double promedio = suma / length;
        System.out.println("El promedio de edad es de: " + promedio);

        Personas personaMayor = personas.get(0);
        for (Personas persona : personas) {
            if (persona.getEdad() > personaMayor.getEdad()) {
                personaMayor = persona;
            }
        }
        System.out.println("La persona mayor es: " + personaMayor.getNombre());
        
        Personas personaMenor = personas.get(0);
        for (Personas persona : personas) {
            if (persona.getEdad() < personaMenor.getEdad()) {
                personaMenor = persona;
            }
        }
        System.out.println("La persona menor es: " + personaMenor.getNombre());

        scanner.close();
    }
}
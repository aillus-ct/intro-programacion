import java.util.Scanner;
import java.util.ArrayList;

public class PrincipalGestion {
    public static void main(String[] args) {
        
        ArrayList<Gestion> personas = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
        String respuesta;

        do {
            System.out.println("¿Desea ingresar los datos de una persona? (si/no)");
            respuesta = scanner.nextLine();

            if (respuesta.equalsIgnoreCase("si")) {
                System.out.print("Ingrese el nombre: ");
                String nombre = scanner.nextLine();

                System.out.print("Ingrese la edad: ");
                int edad = scanner.nextInt();
                scanner.nextLine();  

                // para agregar al array
                if (!nombre.isEmpty() && edad > 0) {
                Gestion persona = new Gestion(nombre, edad);
                personas.add(persona); 
                System.out.println("Se agregó a la lista.");
                } else {
                System.out.println("No se pudo agregar a la lista.");
                }
            }
        }
        while (respuesta.equalsIgnoreCase("si"));
        for (Gestion persona : personas) {
            System.out.println(persona.imprimeNombreEdad());
        }

        scanner.close();
    }
}
    


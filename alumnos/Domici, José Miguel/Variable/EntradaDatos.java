import java.util.Scanner;

public class EntradaDatos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese un apellido");
        String apellido = scanner.nextLine();
            
        System.out.println("Su nombre es: " + nombre + " " + apellido);

        scanner.close();
    }

}
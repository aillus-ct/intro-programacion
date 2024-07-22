import java.util.Scanner;
public class EdadEnAñosPerro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su edad");
        int edad = scanner.nextInt();

        int edadPerro = edad * 7;
        System.out.println("Su edad en años de perro es: " + edadPerro);
        scanner.close();
    }
}
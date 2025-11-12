package Sentencias;
import java.util.Scanner;

public class CualEsMayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2) {
            System.out.println("El primer número es mayor.");
        } else if (numero1 < numero2) {
            System.out.println("El segundo número es mayor.");
        } else {
            System.out.println("Los números son iguales.");
        }
        
        scanner.close();
    }
}

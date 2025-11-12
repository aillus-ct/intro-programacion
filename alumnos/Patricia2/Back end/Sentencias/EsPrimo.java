package Sentencias;
import java.util.Scanner;

public class EsPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un número: ");
        int numero = scanner.nextInt();
        
        if (numero <= 1) {
            System.out.println("El número debe ser mayor que 1.");
        } else {
            boolean esPrimo = true;


            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            
            if (esPrimo) {
                System.out.println(numero + " es un número primo.");
            } else {
                System.out.println(numero + " no es un número primo.");
            }
        }
        
        scanner.close();
    }
}

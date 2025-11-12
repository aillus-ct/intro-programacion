package Sentencias;
import java.util.Scanner;

public class AdivinarNumero {
    public static void main(String[] args) {
        int numeroSecreto = 33; // Número a adivinar
        Scanner scanner = new Scanner(System.in); // Scanner fuera del bucle
        int numeroUsuario; // Variable declarada fuera del bucle
        
        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("Tienes que adivinar un número entre 1 y 100.");
        
        do {
            System.out.print("Ingrese un número: ");
            numeroUsuario = scanner.nextInt();
            
            if (numeroUsuario == numeroSecreto) {
                System.out.println("¡Felicidades! Has adivinado el número.");
            } else if (numeroUsuario < numeroSecreto) {
                System.out.println("El número es mayor. Inténtalo de nuevo.");
            } else {
                System.out.println("El número es menor. Inténtalo de nuevo.");
            }
        } while (numeroUsuario != numeroSecreto);

        scanner.close();
        System.out.println("¡Gracias por jugar!");
    }
}

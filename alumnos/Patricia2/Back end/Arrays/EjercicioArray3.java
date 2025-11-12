/* 3 - Pedile al usuario que ingrese 15 números. Al finalizar, mostrar cuántos fueron pares y cuántos impares.*/
import java.util.Scanner;

public class EjercicioArray3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[15];
        int contadorPares = 0;
        int contadorImpares = 0;

        // Pedimos los 15 números
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Contamos los pares e impares
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                contadorPares++;
            } else {
                contadorImpares++;
            }
        }

        // Mostramos el resultado
        System.out.println("Cantidad de números pares: " + contadorPares);
        System.out.println("Cantidad de números impares: " + contadorImpares);

        scanner.close();
    }
}

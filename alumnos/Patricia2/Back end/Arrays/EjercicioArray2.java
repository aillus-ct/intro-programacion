/* 2 - Pedile al usuario que cargue 10 números en un array y luego ingresá un número a buscar. 
    Decír si se encuentra y en qué posición.*/
import java.util.Scanner;
public class EjercicioArray2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 10 números: ");
        
        int[] numeros = new int[10];
        
        // Primero cargamos los números en el array
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        // Después pedimos el número a buscar
        System.out.println("Ingrese un número a buscar: ");
        int numeroABuscar = scanner.nextInt();

        // Buscamos el número en el array
        boolean encontrado = false;
        int posicion = -1;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroABuscar) {
                encontrado = true;
                posicion = i;
                break; // Salimos del bucle si encontramos el número
            }
        }
        
        // Mostramos el resultado
        if (encontrado) {
            System.out.println("El número " + numeroABuscar + " se encuentra en el array en la posición " + posicion + ".");
        } else {
            System.out.println("El número " + numeroABuscar + " no se encuentra en el array.");
        }
        scanner.close();
    }
}

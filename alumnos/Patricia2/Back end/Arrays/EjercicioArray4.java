/* 4 - Pedile al usuario un número del 1 al 10 y mostrár su tabla de multiplicar hasta el 10. 
    Guardá los resultados en un array y luego mostralos todos.*/

import java.util.Scanner;

public class EjercicioArray4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        // Pedimos un número del 1 al 10. El do while es para validar la entrada.
        do {
            System.out.print("Ingrese un número del 1 al 10: ");
            numero = scanner.nextInt();
        } while (numero < 1 || numero > 10);

        // Creamos un array para guardar la tabla de multiplicar
        int[] tablaMultiplicar = new int[10];

        // Calculamos la tabla de multiplicar
        for (int i = 0; i < tablaMultiplicar.length; i++) {
            tablaMultiplicar[i] = numero * (i + 1);
        }

        // Mostramos la tabla de multiplicar
        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 0; i < tablaMultiplicar.length; i++) {
            System.out.println(numero + " x " + (i + 1) + " = " + tablaMultiplicar[i]);
        }

        scanner.close();
    }
}

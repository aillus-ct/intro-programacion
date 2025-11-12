package Operadores;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        int numero1 = entrada.nextInt();
        entrada.nextLine(); // Consumir el salto de línea pendiente

        System.out.println("Ingrese el segundo número: ");
        int numero2 = entrada.nextInt();
        entrada.nextLine(); // Consumir el salto de línea pendiente

        int resultadoSuma = numero1 + numero2;
        int resultadoResta = numero2 - numero1;
        int resultadoMultiplicacion = numero1 * numero2;
        int resultadoDivision = numero2 / numero1;
        int resultadoModulo = numero2 % numero1;

        System.out.println("Resultado de la suma: " + resultadoSuma);
        System.out.println("Resultado de la resta: " + resultadoResta);
        System.out.println("Resultado de la multiplicación: " + resultadoMultiplicacion);
        System.out.println("Resultado de la división: " + resultadoDivision);
        System.out.println("Resultado del módulo: " + resultadoModulo);

        entrada.close();  
    }
}

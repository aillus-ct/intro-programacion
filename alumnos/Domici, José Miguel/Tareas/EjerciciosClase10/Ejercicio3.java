import java.util.Scanner;

public class Ejercicio3 {
    
    private int numero;

    public Scanner scanner = new Scanner(System.in); {
    System.out.println("Ingrese un numero para Factorizar: " );
    numero = scanner.nextInt();

    if (numero < 0) {
        System.out.println("El número debe ser positivo.");
    } else {
        System.out.println("El factorial de " + numero + " es: ");
    }

    }

    public long calcularFactorial() {
        long resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }

}

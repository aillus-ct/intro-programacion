package Operadores;
import java.util.Scanner;

public class GradosCF {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese la temperatura
        System.out.print("Ingrese una temperatura: ");
        double temperatura = scanner.nextDouble();

        // Conversión asumiendo que es Celsius a Fahrenheit
        double fahrenheit = (temperatura * 9 / 5) + 32;
        
        // Conversión asumiendo que es Fahrenheit a Celsius
        double celsius = (temperatura - 32) * 5 / 9;

        // Mostrar ambos resultados
        System.out.println("\nResultados de conversión:");
        System.out.println(temperatura + "°C = " + fahrenheit + "°F");
        System.out.println(temperatura + "°F = " + celsius + "°C");

        scanner.close();
    }
}
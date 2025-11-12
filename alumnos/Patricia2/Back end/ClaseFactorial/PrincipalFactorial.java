import java.util.Scanner;
public class PrincipalFactorial {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número para calcular su factorial: ");
        int numero = scanner.nextInt(); 

        // Instancia de la clase Factorial
        Factorial factorial = new Factorial(numero);

        // Calculamos el factorial
        int resultado = factorial.calcularFactorial();  

        // Resultado
        System.out.println("El factorial de " + factorial.getNumero() + " es: " + resultado);
        
        scanner.close();
    }
}

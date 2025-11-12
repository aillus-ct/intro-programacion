import java.util.Scanner;

public class PrincipalPar {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número para ver si es par o impar: ");
        int numero = scanner.nextInt();

        // Instancia de la clase EsPar
        EsPar esPar = new EsPar(numero);

        // Verificamos si el número es par
        if (esPar.esPar()) {
            System.out.println("El número " + esPar.getNumero() + " es par (true).");
        } else {
            System.out.println("El número " + esPar.getNumero() + " es impar (false).");
        }
        scanner.close();
    }

}

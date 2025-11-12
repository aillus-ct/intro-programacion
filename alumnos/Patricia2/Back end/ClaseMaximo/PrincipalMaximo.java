import java.util.Scanner;

public class PrincipalMaximo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int numero3 = scanner.nextInt();

        Maximo maximo = new Maximo(numero1, numero2, numero3);

        System.out.println("El número máximo es: " + maximo.calcularMaximo());

        scanner.close(); 
    }

}

import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un nuevo entero: ");
        int numeroDecimal = 0;
        numeroDecimal = scanner.nextInt();

        System.out.println("numeroDecimal: " + numeroDecimal);
        scanner.close();
    }
}
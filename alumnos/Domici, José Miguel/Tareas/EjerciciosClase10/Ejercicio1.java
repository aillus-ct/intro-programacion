import java.util.Scanner;

public class Ejercicio1 {

    private int numero1;
    private int numero2;

    public Scanner scanner = new Scanner(System.in); {
        System.out.println("Sumemos dos numeros!!!");
        System.out.println("Ingrese el primer número: ");
        numero1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        numero2 = scanner.nextInt();

       
    }

    public int suma() {
        return numero1 + numero2;
    }
}

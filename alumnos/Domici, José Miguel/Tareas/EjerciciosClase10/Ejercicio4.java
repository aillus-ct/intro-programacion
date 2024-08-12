import java.util.Scanner;

public class Ejercicio4 {
    
    private int numero1;
    private int numero2;
    private int numero3;

    public Scanner scanner = new Scanner(System.in); {
        System.out.println("Veamos que numero es mayor!!!");
        System.out.println("Ingrese el primer número: ");
        numero1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        numero2 = scanner.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        numero3 = scanner.nextInt();
    }

    public int mayor = Math.max(Math.max (numero1, numero2), numero3); {
        System.out.println("El numero mayor es: ");
    }
    

}

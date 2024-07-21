import java.util.Scanner;

public class OperadoresEjercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero entero 1");
        int entero1 = entrada.nextInt();
        System.out.println("Ingrese un numero entero 2");
        int entero2 = entrada.nextInt();

        int suma = entero1 + entero2;
        System.out.println(suma);
        int resta = entero1 - entero2;
        System.out.println(resta);
        int multiplicacion = entero1 * entero2;
        System.out.println(multiplicacion);
        int division = entero1 / entero2;
        System.out.println(division);
        int modulo = entero1 % entero2;
        System.out.println(modulo);
        entrada.close();
    }
}

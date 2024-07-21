import java.util.Scanner;

public class OperadoresEjercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = entrada.nextInt();
        if (numero % 2 == 0) {
            System.out.println(numero + " es par ");
        } else {
            System.out.println(numero + " es impar ");
        }
        entrada.close();
    }
    
}

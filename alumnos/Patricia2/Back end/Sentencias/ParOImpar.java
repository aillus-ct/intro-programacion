package Sentencias;
import java.util.Scanner;

public class ParOImpar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un número: ");
        int numero = entrada.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
        entrada.close();
    }
}
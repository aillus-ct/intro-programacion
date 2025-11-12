package Operadores;
import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un número: ");
        int numero = entrada.nextInt();
        //este es con el operador ternario
        boolean esPar = numero % 2 == 0;
        
        String resultado = esPar ? "El número es par." : "El número es impar.";
        System.out.println(resultado);
        
        entrada.close();
    }
}


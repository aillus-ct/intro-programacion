import java.util.Scanner;

public class Ejercicio2 {

    private int numero;

    public Scanner scanner = new Scanner(System.in); 
    {
        System.out.println("Ingrese un numero para saber si es par: " );
        numero = scanner.nextInt();
    }

    public String parOImpar = (numero % 2 == 0) ? "Es par" : "Es impar";
       
     
}

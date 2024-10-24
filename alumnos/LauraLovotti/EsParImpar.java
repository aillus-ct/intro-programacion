import java.util.Scanner;
public class EsParImpar{
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int numeroing = numero.nextInt();

        String resultado = (numeroing % 2 == 0) ? "Par" : "Impar";
        System.out.println ("El numero ingresado es: " + resultado);
        numero.close();
    }
}

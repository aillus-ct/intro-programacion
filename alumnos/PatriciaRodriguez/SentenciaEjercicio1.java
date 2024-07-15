import java.util.Scanner;

public class SentenciaEjercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int numero = entrada.nextInt();
        if (numero % 2 == 0) {
            System.out.println(numero + " es par");
        } else {
            System.out.println(numero + " es impar");
            entrada.close();
        }
    }
    
}

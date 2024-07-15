import java.util.Scanner;

public class SentenciaEjercicio2 {
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int numero2 =entrada.nextInt();
        if (numero2 > 0) {
            System.out.println(numero2 + " es positivo");
        } else if (numero2 < 0) {
            System.out.println(numero2 + " es negativo");
        } else {
            System.out.println(numero2 + " es cero");
            entrada.close();
        }

    }

    
}

import java.util.Scanner;

public class SentenciaEjercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero 1: ");
        int numero1 = entrada.nextInt();
        System.out.println("Ingrese un numero 2:");
        int numero2 = entrada.nextInt();
        if (numero1 > numero2) {
            System.out.println(" El numero " + numero1 + " es mayor que el numero " + numero2);
            } else if (numero1 < numero2) {
                System.out.println(" El numero " + numero2 + " es mayor que el numero " + numero1);
        } entrada.close();
    }
    
}

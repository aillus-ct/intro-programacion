import java.util.Scanner;

public class Primo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un número entero:");
        int numero = entrada.nextInt();
        boolean esPrimo = true;
        for (int div = 2; div < numero; div++){
            if (numero % div == 0){
                esPrimo = false;
            }
        }   
        if (esPrimo) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }
        entrada.close();
        
    }
}

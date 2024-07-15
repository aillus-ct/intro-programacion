import java.util.Scanner;

   /*  public class SentenciaEjercicio6 {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            System.out.print("Introduce un número: ");
            int numero = entrada.nextInt();
            
            if (esPrimo(numero)) {
                System.out.println(numero + " es primo");
            } else {
                System.out.println(numero + " no es primo");
            }
            
            entrada.close();
        }
    
        public static boolean esPrimo(int numero) {
            if (numero <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
    
    import java.util.Scanner;  */

public class SentenciaEjercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = entrada.nextInt();
        boolean esPrimo = true;
        int i = 2;
        while (esPrimo == true && i < numero) {
            if (numero % i == 0) {
                esPrimo = false;
            } 
            i++;
        } 
        if (esPrimo)  {
            System.out.println("El numero " + numero + " es primo");
        } else {
            System.out.println("El numero " + numero + " no es primo");
        }
        entrada.close();
    }
}
    
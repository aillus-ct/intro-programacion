package Sentencias;
public class Primos1Al50 {
    public static void main(String[] args) {
        System.out.println("Números primos del 1 al 50:");
        
        for (int num = 2; num <= 50; num++) {
            boolean esPrimo = true;
            
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            
            if (esPrimo) {
                System.out.println(num);
            }
        }
    }
    
}
// math.squrt(num) para calcular la raíz cuadrada del número actual.

public class Primos1A50 {

    public static void main(String[] args) {
        boolean esPrimo = true;
        int div = 2;
        for(int numero = 1; numero <= 50; numero++){
            div = 2;
            esPrimo = true;
            while (esPrimo && div < numero) {
                if (numero % div == 0) {
                    esPrimo = false;
                }
                div++;
            }
        if (esPrimo) {
            System.out.print(numero + " ");
            }    
        }
    }
}    
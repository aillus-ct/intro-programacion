
public class EjercicioSentencia7 {
    public static void main(String[] args) {
       
        boolean esPrimo = true;
        int i = 2;
        for (int numero = 1; numero <= 50; numero++){
            i = 2;
            esPrimo = true;
            while (esPrimo == true && i < numero) {
                if (numero % i == 0) {
                    esPrimo = false;
                } 
                i++;
            } 
            if (esPrimo)  {
                System.out.println(numero);
            }
        }
    }
}


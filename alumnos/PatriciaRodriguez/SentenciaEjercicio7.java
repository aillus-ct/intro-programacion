
public class SentenciaEjercicio7 {
    public static void main(String[] args) {
        int limite = 50;

        System.out.println("Números primos del 1 al " + limite + ":");
        for (int num = 2; num <= limite; num++) {
            if (esPrimo(num)) {
                System.out.print(num + " ");
            }
        }
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



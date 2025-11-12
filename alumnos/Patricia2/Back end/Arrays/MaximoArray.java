package Arrays;

public class MaximoArray {
    public static void main(String[] args) {
        int[] numeros = {10, 22, 330, 47, 5};

        int maximo = 0;
        /*for (int numero : numeros) {
            if (numero > maximo) {
                maximo = numero;
            }
        } */
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }
        System.out.println("El número máximo del array es: " + maximo);
}
}

package Arrays;

public class ArrayInvertido {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 330, 47, 5};

        /*System.out.println("Array original:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();*/

        System.out.println("Array invertido:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }
    
}

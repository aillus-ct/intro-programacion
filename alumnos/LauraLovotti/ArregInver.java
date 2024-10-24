public class ArregInver {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        int[] invertidos = new int[5];
        int indInver = 0;
        for (int i = numeros.length - 1; i >= 0; i--) {
            invertidos[indInver] = numeros[i];
            indInver++;
        }
        System.out.println("El arreglo invertido es: " );
        for (int numero : invertidos) {
            System.out.print(numero + " ");
        }
        System.out.println(" ");
    }
}
package Arrays;

public class SumArray {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};

        int resultado = 0;

        for (int numero: numeros) {
            resultado += numero;
        }


        System.out.println("La suma de los elementos del array es: " + resultado);
    }
}

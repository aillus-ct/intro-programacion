public class Valormax {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 330, 47, 5};

        int maximo = numeros[0]; // Tomamos el primer valor como referencia

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }

        System.out.println("El maximo es: " + maximo);
    }
}
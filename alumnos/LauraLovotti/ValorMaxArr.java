public class ValorMaxArr {
    public static void main(String[] args) {
        int[] numeros ={ 17, 25, 95, 53, 77};
        int valorMax = 0;
        for (int numero : numeros) {
            if (numero > valorMax) {
                valorMax = numero;
            }
        }
        System.out.println("El valor maximo dentro del arreglo es: " + valorMax);
    }
}
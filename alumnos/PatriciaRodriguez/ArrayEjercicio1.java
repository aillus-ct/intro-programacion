public class ArrayEjercicio1 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int suma = 0;
        for (int numero : array) {
            suma += numero;
        }
        System.out.println("La suma del array es de: " + suma);
}
}
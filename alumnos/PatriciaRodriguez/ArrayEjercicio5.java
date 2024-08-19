public class ArrayEjercicio5 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int suma = 0;

        for (int number : numbers) {
            suma += number;
        }
        double promedio = (double) suma / numbers.length;
        System.out.println("El promedio del array es: " + promedio);
    
}
}

public class ArrayExample {
    public static void main(String[] args) {
        // Declarar y crear un array de enteros
        int[] numbers = new int[5];
        
        // Inicializar el array
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        
        // Acceder a elementos del array
        System.out.println("El primer número es: " + numbers[0]);
        System.out.println("El último número es: " + numbers[numbers.length - 1]);
        
        // Iterar sobre el array
        System.out.println("Todos los números en el array:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
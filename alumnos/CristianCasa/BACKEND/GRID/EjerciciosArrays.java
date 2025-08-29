
public class EjerciciosArrays {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        System.out.println("La suma de los elementos del array es: " + sum);
    }
}

public class EjerciciosArrays {
    public static void main(String[] args) {
        int[] numbers = {23, 45, 67, 89, 12, 34};
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("El valor máximo en el array es: " + max);
    }
}

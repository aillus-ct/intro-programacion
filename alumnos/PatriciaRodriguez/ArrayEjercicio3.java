public class ArrayEjercicio3 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int length = numbers.length;

        for (int i = 0; i < length / 2; i++) {
            int temporal = numbers[i];
        numbers[i] = numbers[length - i - 1];
        numbers[length - 1 - i] = temporal;
        }
        System.out.println("Array invertido: ");
        for (int number : numbers) {
            System.out.print(number + " ");
} 
       
        } 
     }
    
public class ArrayEjercicio2 {
    public static void main(String[] args) {
        int[] numbers = {45, 83, 99, 12, 115, 30};
        int numeroMaximo = numbers[0];
        int numeroMinimo = numbers[0];
        for (int i = 0; i < numbers.length; i++ ){
            if (numbers[i] > numeroMaximo) {
                numeroMaximo = numbers[i];
            }
            if (numbers[i] < numeroMinimo) {
                    numeroMinimo = numbers[i];  
            }
        }

    System.out.println("El numero maximo del array es: " + numeroMaximo);
    System.out.println("El numero minimo del array es: " + numeroMinimo);        
    }
} 


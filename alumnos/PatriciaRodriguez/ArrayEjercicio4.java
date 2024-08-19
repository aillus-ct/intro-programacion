public class ArrayEjercicio4 {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 2, 4, 5, 2};
        int numeroRepetido = 2;
        int contador = 0;
        for (int number : numbers) {
            if (number == numeroRepetido) {
                contador++;
                }
        }

System.out.println("El numero " + numeroRepetido + " aparece " + contador + " veces en el array");
    
}
}

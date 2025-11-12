package Sentencias;
public class SumaConWhile {
    public static void main(String[] args) {
        int num = 1;
        int suma = 0;
        while (num <= 100) {
            suma += num;
            num++;
        }
        // Mostrar el resultado
        System.out.println("La suma de los números del 1 al 100 es: " + suma);
    }
}

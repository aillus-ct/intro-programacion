import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayEjercicioEnClase {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        Scanner entrada = new Scanner(System.in);
        try { 
        System.out.println("Ingrese un numero: ");
        int numero = entrada.nextInt();
        boolean encontrado = false;

        for (int i = 0; i < array.length; i++)
            if (array[i] == numero) {
            System.out.println("El " + numero + " se encuentra en el indice: " + i);
            encontrado = true;
            break;
        } 
            
        if (!encontrado) {
            System.out.println("El " + numero + " no se encuentra en el indice");
        }
            entrada.close();
        
        } catch (InputMismatchException e){
            System.out.println("Error, ingrese un numero entero.");
            entrada.next();
        }
    }
}


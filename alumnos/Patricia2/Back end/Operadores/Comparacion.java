import java.util.Scanner;

public class Comparacion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número: ");
        int numero1 = entrada.nextInt();
        entrada.nextLine(); // Consumir el salto de línea pendiente

        System.out.println("Ingrese el segundo número: ");
        int numero2 = entrada.nextInt();
        entrada.nextLine(); // Consumir el salto de línea pendiente

        boolean sonIguales = numero1 == numero2; 
        boolean sonDiferentes = numero1 != numero2; 
        boolean esMayor = numero1 > numero2; 
        boolean esMenor = numero1 < numero2; 
        boolean esMayorIgual = numero1 >= numero2; 
        boolean esMenorIgual = numero1 <= numero2; 

        System.out.println("¿Los números son iguales? " + sonIguales);
        System.out.println("¿Los números son diferentes? " + sonDiferentes);
        System.out.println("¿El primer número es mayor que el segundo? " + esMayor);
        System.out.println("¿El primer número es menor que el segundo? " + esMenor);
        System.out.println("¿El primer número es mayor o igual que el segundo? " + esMayorIgual);
        System.out.println("¿El primer número es menor o igual que el segundo? " + esMenorIgual);
        
        entrada.close();
    }
}

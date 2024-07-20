import java.util.Scanner;
public class EjemploScanner {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        //Leer un entero
        System.out.println("Introduce un entero: ");
        int entero = scanner.nextInt();
        System.out.println("Entero introducido: " + entero);
        scanner.nextLine();
        
        //limpiar el buffer de entrada
        scanner.nextLine();

        //leer una linea de texto
        System.out.println("introduce nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Nombre: " + nombre);
        System.out.println("Introduce apellido: ");
        String apellido = scanner.nextLine();
        System.out.println("Apellido: " + apellido);

        //leer un booleano
        System.out.println ("Introduce verdadero o falso: ");
        boolean booleano = scanner.nextBoolean();
        System.out.println("Booleano introducido: " + booleano);

        scanner.close();
    }
}
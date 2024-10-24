import java.util.Scanner;

public class EntradaDatos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println();
        System.out.println();

        System.out.println("Ingrese un numero entero: ");

        int numero = entrada.nextInt();

        entrada.nextLine();

        System.out.println(numero);

        System.out.println("Ingrese un nombre: ");

        String nombre = entrada.nextLine();

        System.out.println("Ingrese un apellido: ");

        String apellido = entrada.nextLine();

        System.out.println(nombre + " " + apellido);

    
}
}
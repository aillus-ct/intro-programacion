import java.util.*;

public class ScannerEjemplo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre: ");
        entrada.nextLine();
        System.out.println("Ingrese su edad: ");
        int edad = entrada.nextInt();


        String nombre = entrada.nextLine();


        System.out.println(nombre);
        System.out.println(edad);

        int lengthPalabra = nombre.length();

        System.out.println(lengthPalabra);


        entrada.close();
        
    }
}

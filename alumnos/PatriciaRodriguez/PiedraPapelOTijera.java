import java.util.Scanner;
import java.util.Random;

public class PiedraPapelOTijera {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una opcion (Piedra, Papel o Tijera): ");
        String opcion = entrada.nextLine();

        Random random = new Random ();
        int opcionComputadora = random.nextInt(3); 
        String eleccionComputadora;
        if (opcionComputadora == 0)  {
        eleccionComputadora = "Piedra";
        } else if (opcionComputadora == 1) {
        eleccionComputadora = "Papel";
        } else {
        eleccionComputadora = "Tijera";
        }
        System.out.println("La computadora eligio: " + eleccionComputadora);
        int comparacion = 3;
       

if (0 > 2) {
    System.out.println("La Piedra vence a la Tijera");
} else if (1 < 2) {
    System.out.println("La Tijera vence al Papel");
} else {
    System.out.println("El Papel vence a la Piedra");
}

switch (comparacion) {
    String opcion;
    case 1: (opcion == eleccionComputadora);
        System.out.println("Empate");
        break;
    case 2: (opcion = 0 && eleccionComputadora == 2) ||
    (opcion = 1 && eleccionComputadora == 0) ||
    (opcion = 2 && eleccionComputadora == 1);
        System.out.println("El usuario gana");
        break;
    default:
        System.out.println("La computadora gana");
        break;
}
System.out.println(resultado);
    } 
} 
        




    

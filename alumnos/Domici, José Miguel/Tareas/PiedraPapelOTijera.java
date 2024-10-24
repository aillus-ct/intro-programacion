import java.util.Scanner;
import java.util.Random;

public class PiedraPapelOTijera {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una opcion (Piedra, Papel o Tijera): ");
        String opcion = entrada.nextLine();

        Random random = new Random();
        int opcionComputadora = random.nextInt(3);
        String eleccionComputadora;
        if (opcionComputadora == 0) {
            eleccionComputadora = "Piedra";
        } else if (opcionComputadora == 1) {
            eleccionComputadora = "Papel";
        } else {
            eleccionComputadora = "Tijera";
        }
        System.out.println("La computadora eligio: " + eleccionComputadora);

        // Compare the user's choice with the computer's choice
        if (opcion.equals(eleccionComputadora)) {
            System.out.println("Empate");
        } else if ((opcion.equals("Piedra") && eleccionComputadora.equals("Tijera")) ||
                (opcion.equals("Papel") && eleccionComputadora.equals("Piedra")) ||
                (opcion.equals("Tijera") && eleccionComputadora.equals("Papel"))) {
            System.out.println("El usuario gana");
        } else {
            System.out.println("La computadora gana");
        }

        entrada.close();
    }
}
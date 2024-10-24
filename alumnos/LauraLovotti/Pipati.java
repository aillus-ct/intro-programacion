
import java.util.Random;
import java.util.Scanner;


public class Pipati {
    //piedra, papel o tijera
    public static void main(String[] args) {
        boolean jugarDeNuevo = true;

        while (jugarDeNuevo == true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese su eleccion (Piedra,Papel o Tijera): ");
            String eleccionUsuario = scanner.nextLine();

            // compu elige su opcion
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

            // decide resultado
            System.out.println("La computadora eligio: " + eleccionComputadora);
            if (eleccionComputadora.equals("Piedra") && eleccionUsuario.equalsIgnoreCase("Papel")
                || eleccionComputadora.equals("Papel") && eleccionUsuario.equalsIgnoreCase("Tijera")
                || eleccionComputadora.equals("Tijera") && eleccionUsuario.equalsIgnoreCase("Piedra")
            ) {
                System.out.println("Usuario gana");
            } else if (eleccionComputadora.equals("Piedra") && eleccionUsuario.equalsIgnoreCase("Tijera")
                || eleccionComputadora.equals("Papel") && eleccionUsuario.equalsIgnoreCase("Piedra")
                || eleccionComputadora.equals("Tijera") && eleccionUsuario.equalsIgnoreCase("Papel")
            ) {
                System.out.println("La computadora gana");
            
            } else if (eleccionComputadora.equals("Piedra") && eleccionUsuario.equalsIgnoreCase("Piedra")
                || eleccionComputadora.equals("Papel") && eleccionUsuario.equalsIgnoreCase("Papel")
                || eleccionComputadora.equals("Tijera") && eleccionUsuario.equalsIgnoreCase("Tijera")
            ) {
                System.out.println("Empate");
            } else {
                System.out.println("No introdujo una opcion correcta");
            }

            // pregunta volver a jugar
            System.out.println("Desea jugar de nuevo? (Si/No)");
            String volver = scanner.nextLine();
            if (volver.equalsIgnoreCase("No")) {
                jugarDeNuevo = false;
            }           
            scanner.close();
        }
        
    }
}

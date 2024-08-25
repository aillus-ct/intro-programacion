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
        
        String resultado = "";
        int contador = 1;
        while (opcion != eleccionComputadora && contador <= 5){
            if (opcion.equalsIgnoreCase(eleccionComputadora)) {
                resultado = "Empate";
            } else if ((opcion.equalsIgnoreCase("Piedra") && eleccionComputadora.equalsIgnoreCase("Tijera")) 
                    || (opcion.equalsIgnoreCase("Papel") && eleccionComputadora.equalsIgnoreCase("Piedra"))
                    || (opcion.equalsIgnoreCase("Tijera")) && eleccionComputadora.equalsIgnoreCase("Papel")) {
                resultado = "El usuario gana";
            } else {
                resultado = "La computadora gana";
                }
                contador++;
        }
        
        System.out.println(resultado);
        entrada.close();
    }
} 



        




    

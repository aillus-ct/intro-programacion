import java.util.Scanner;

public class ElJuego {
    public static void main(String[] args) {
        System.out.println("Bienvenidos al Juego");
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        int NumeroGanador = 513;
        int contador = 0;
        while (numero != NumeroGanador && contador < 3) {
            System.out.println("Introduce un numero");

                 numero = scanner.nextInt();

                if (numero > NumeroGanador) {
                    System.out.println(numero + " es muy alto. Intente de nuevo");
                } else if (numero < NumeroGanador) {
                    System.out.println(numero + " es muy bajo. Intente de nuevo");
                    } else if (numero == NumeroGanador){
                     System.out.println("Ganaste");
                    break;
                    
              
                }
            
            contador++;
        }
            if (contador == 3)
            System.out.println("Has perdido");

        scanner.close();
    }
}
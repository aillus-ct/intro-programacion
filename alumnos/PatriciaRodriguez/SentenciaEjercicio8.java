import java.util.Scanner;

public class SentenciaEjercicio8 {
    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        int numeroElegido = 17;
        int contador = 0;
        while (numero != numeroElegido && contador < 3){
            System.out.println("Ingrese un numero: ");
            
                numero = entrada.nextInt();

                if (numero > numeroElegido) {
                    System.out.println(" El numero es alto, intenta de nuevo");
                } else if (numero < numeroElegido){
                    System.out.println("El numero es bajo, intenta de nuevo");
                } else if (numero == numeroElegido) {
                    System.out.println("Ganaste");
                    break;
        }
            contador++;
/*jjs
 * jsjsjs
 * jdjvnjv
 */
        } 

        if (contador == 3) {
            System.out.println("Perdiste");
            }
            entrada.close();
}       
    
} 



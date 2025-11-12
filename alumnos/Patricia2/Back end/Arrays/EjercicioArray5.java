/* 5 - Simulá una encuesta a 5 personas. Preguntales (con números del 1 al 5) cómo califican un servicio. 
    Usá un array para guardar las respuestas y mostrá un resumen de cuántas personas eligieron cada opción.*/ 

import java.util.Scanner;

import java.util.Arrays;
public class EjercicioArray5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] respuestas = new int[5];
        int[] conteo = new int[5];

        // Simulamos la encuesta
        for (int i = 0; i < respuestas.length; i++) {
            System.out.print("Persona " + (i + 1) + ", califique el servicio (1-5): ");
            respuestas[i] = scanner.nextInt();
            if (respuestas[i] >= 1 && respuestas[i] <= 5) {
                conteo[respuestas[i] - 1]++;
                System.out.println(Arrays.toString (conteo));
            } else {
                System.out.println("Calificación inválida, debe ser entre 1 y 5.");
                i--; // Repetimos la iteración si la entrada es inválida
            }
        }

        // Mostramos el resumen de las respuestas
        System.out.println("Resumen de calificaciones:");
        for (int i = 0; i < conteo.length; i++) {
            System.out.println("Calificación " + (i + 1) + ": " + conteo[i] + " persona(s)");
        }

        scanner.close();
    }
    
}

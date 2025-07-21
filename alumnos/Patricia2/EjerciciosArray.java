/*1 - Pedile al usuario que ingrese las calificaciones del alumno. 
  Guardalas en un array. Calculá el promedio y decír si está aprobado (promedio ≥ 6) o no.
/

import java.util.Scanner;

public class Ejercicios{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de calificaciones:");
        int cantidadNotas = sc.nextInt();

        double[] calificacion = new double[cantidadNotas];
        double sumaNotas = 0;

        for(int i = 0; i < cantidadNotas; i++) {
            System.out.println("Ingrese la nota" + (i+1) +":" );
            calificacion[i] = sc.nextDouble();
            sumaNotas += calificacion[i];
        }

        double promedio = sumaNotas / cantidadNotas;

        if(promedio >= 6) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Desaprobado");
        }


    }
}

/
2 - Pedile al usuario que cargue 10 números en un array y luego ingresá un número a buscar. 
    Decír si se encuentra y en qué posición.

3 - Pedile al usuario que ingrese 15 números. Al finalizar, mostrar cuántos fueron pares y cuántos impares.

4 - Pedile al usuario un número del 1 al 10 y mostrár su tabla de multiplicar hasta el 10. 
    Guardá los resultados en un array y luego mostralos todos.

5 - Simulá una encuesta a 5 personas. Preguntales (con números del 1 al 5) cómo califican un servicio. 
    Usá un array para guardar las respuestas y mostrá un resumen de cuántas personas eligieron cada opción.
*/
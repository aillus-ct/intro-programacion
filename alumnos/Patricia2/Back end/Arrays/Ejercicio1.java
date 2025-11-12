package Arrays;

import java.util.Scanner;

class Ejercicio1 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.println("Ingrese la cantidad de calificaciones:");
       int cantidadNotas = scanner.nextInt();

       double[] calificacion = new double[cantidadNotas];
       double sumaNotas = 0;

       for(int i = 0; i < cantidadNotas; i++) {
           System.out.println("Ingrese la nota " + (i + 1) + ":");
           calificacion[i] = scanner.nextDouble();
           sumaNotas += calificacion[i];
       }

        double promedio = sumaNotas / cantidadNotas;

        if (promedio >= 6) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Desaprobado");
        }
       scanner.close();
    }
}
    
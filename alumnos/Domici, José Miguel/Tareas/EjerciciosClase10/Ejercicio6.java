import java.util.Scanner;

public class Ejercicio6 {

    private  int[] numeros = new int[5]; 

    public Scanner scanner = new Scanner(System.in); {
        

        System.out.println("Creemos otro Array para saber su promedio!!!");
        System.out.println("Ingrese el primer número: ");
        numeros[0] = scanner.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        numeros[1] = scanner.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        numeros[2] = scanner.nextInt();
        System.out.println("Ingrese el cuarto numero: ");
        numeros[3] = scanner.nextInt();
        System.out.println("Ingrese el quinto numero: ");
        numeros[4] = scanner.nextInt();
    }    

    public String promedioArray = "-Fin-"; {
        int suma = 0;
        for (int numerosarray : numeros) {
            suma += numerosarray;
        }
        int length = numeros.length;

        double promedio = (double) suma / length;

       System.out.println("El promedio de los numeros del Array es: " + promedio);
       System.out.println();
    }

}
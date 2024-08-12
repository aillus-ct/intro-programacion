import java.util.Scanner;

public class Ejercicio5 {

    private  int[] numeros = new int[5]; 

    public Scanner scanner = new Scanner(System.in); {
        

        System.out.println("Creemos un Array!!!");
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

    public String array = "-Fin del Array-"; {
    
        for (int numerosArray: numeros) {
        System.out.println("Los numeros del Array son: "+ numerosArray);
    }
        
    }    
}
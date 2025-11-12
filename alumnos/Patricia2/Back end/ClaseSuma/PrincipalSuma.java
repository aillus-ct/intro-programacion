import java.util.Scanner;

public class PrincipalSuma {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        // Instancia de la clase Suma
        Suma suma = new Suma(numero1, numero2);

        // Para llamar al método y mostrar el resultado
        int resultado = suma.sumar();
        System.out.println("La suma de " + suma.getNumero1() + " y " + suma.getNumero2() + " es: " + resultado);
    
        scanner.close();




    }


}





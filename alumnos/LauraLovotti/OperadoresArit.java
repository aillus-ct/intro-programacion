import java.util.Scanner;
public class OperadoresArit {
    public static void main(String[] args){
    Scanner numeros = new Scanner(System.in);
    System.out.println("Ingrese un numero entero: ");
    int numero1 = numeros.nextInt();
    System.out.println("Ingrese otro numero entero: ");
    int numero2 = numeros.nextInt();
    
    int suma = numero1 + numero2;
    int resta = numero1 - numero2;
    int producto = numero1 * numero2;
    int division = numero1 / numero2;
    int modulo = numero1 % numero2;

    System.out.println("El resultado de la suma es: " + suma);
    System.out.println("El resultado de la resta es: " + resta);
    System.out.println("El resultado de la multiplicacion es: " + producto);
    System.out.println("El resultado de la division es: " + division);
    System.out.println("El resto de la division es: " + modulo);
    numeros.close();
    } 
}
import java.util.Scanner;
public class OperadoresComp {
    public static void main(String[] args){
    Scanner numeros = new Scanner(System.in);
    System.out.println("Ingrese un numero entero: ");
    int numero1 = numeros.nextInt();
    System.out.println("Ingrese otro numero entero: ");
    int numero2 = numeros.nextInt();

    boolean igual = (numero1 == numero2);   
    boolean distinto = (numero1 != numero2);   
    boolean mayorQue = (numero1 > numero2);   
    boolean menorQue = (numero1 < numero2);   
    boolean mayorIgual = (numero1 >= numero2);   
    boolean menorIgual = (numero1 <= numero2); 
    
    System.out.println("Numero 1 es igual a numero 2: " + igual);
    System.out.println("Numero 1 es distinto a numero 2: " + distinto);
    System.out.println("Numero 1 es mayor que numero 2: " + mayorQue);
    System.out.println("Numero 1 es menor que numero 2: " + menorQue);
    System.out.println("Numero 1 es mayor o igual que numero 2: " + mayorIgual);
    System.out.println("Numero 1 es menor o igual que numero 2: " + menorIgual);
    numeros.close();
    }
}
import java.util.Scanner;

public class OperadoresEjercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero 1");
        int numero1 = entrada.nextInt();
        System.out.println("Ingrese un numero 2");
        int numero2 = entrada.nextInt();
        boolean igual = (numero1 == numero2);
        System.out.println(igual);
        boolean distinto = (numero1 != numero2);
        System.out.println(distinto);
        boolean mayorQue = (numero1 > numero2);
        System.out.println(mayorQue);
        boolean menorQue = (numero1 < numero2);
        System.out.println(menorQue);
        boolean mayorIgual = (numero1 >= numero2);
        System.out.println(mayorIgual);
        boolean menorIgual = (numero1 <= numero2);
        System.out.println(menorIgual);
        entrada.close();

    }
    
}

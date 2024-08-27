import java.util.Scanner;

public class TrianguloDeAsteriscos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero entero positivo: ");
        int numero = entrada.nextInt();
        
        for (int i = 1; i <= numero; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
        
                 System.out.println();
                }
        entrada.close();
    }
        } 
    
    


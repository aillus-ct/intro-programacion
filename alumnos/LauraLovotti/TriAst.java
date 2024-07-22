import java.util.Scanner;
public class TriAst {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("Ingrese un numero entero positivo: ");
        int numeroIng = numero.nextInt();
        for (int linea = 1; linea <= numeroIng; linea++) {
            for (int ast = 1; ast <= linea; ast++) {
                System.out.print("*");
            }
            System.out.println(" ");  
        }
        numero.close();
    }
}
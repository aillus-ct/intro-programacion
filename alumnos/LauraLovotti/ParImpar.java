import java.util.Scanner;
public class ParImpar {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("ingrese un numero: ");
        int numeroIng = numero.nextInt();
        if (numeroIng % 2 == 0){
            System.out.println(numeroIng + " es un numero par");
        } else {
            System.out.println(numeroIng + " es un numero impar");  
        }
        numero.close();
    }
}
import java.util.Scanner;
public class PosONeg {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("ingrese un numero: ");
        int numeroIng = numero.nextInt();
        if (numeroIng < 0){
            System.out.println(numeroIng + " es un numero negativo");
        } else if (numeroIng > 0){
            System.out.println(numeroIng + " es un numero positivo");  
        } else {
            System.out.println("El numero ingresado es cero");
        }
        numero.close();
    }
}

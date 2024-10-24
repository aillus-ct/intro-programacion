import java.util.Scanner;
public class MayorMenor {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("ingrese un numero: ");
        int numeroIng1 = numero.nextInt();
        System.out.println("ingrese otro numero: ");
        int numeroIng2 = numero.nextInt();

        if (numeroIng1 < numeroIng2){
            System.out.println(numeroIng1 + " es menor que " + numeroIng2);
        } else if (numeroIng1 > numeroIng2){
            System.out.println(numeroIng1 + " es mayor que " + numeroIng2);  
        } else {
            System.out.println("Los numeros ingresados son iguales");
        }
        numero.close();
    }
}

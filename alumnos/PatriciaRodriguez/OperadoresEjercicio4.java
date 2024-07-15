import java.util.Scanner;

public class OperadoresEjercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la edad");
        int edad = entrada.nextInt();
        System.out.println("Ingrese el equivalente en años de perro");
        int equivalente = entrada.nextInt();
        int multiplicacion = edad * equivalente;
        System.out.println(multiplicacion); 
        entrada.close();
    }
    
}

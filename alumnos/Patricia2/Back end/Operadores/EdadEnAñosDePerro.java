import java.util.Scanner;

public class EdadEnAñosDePerro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese su edad: ");
        int edadHumana = entrada.nextInt(); 
        
        // Calcular la edad del perro en años de perro
        int edadPerro = edadHumana * 7; // Asumiendo que 1 año humano equivale a 7 años de perro
        
        // Imprimir el resultado
        System.out.println("Su edad en años de perro equivale a " + edadPerro + " años.");

        entrada.close();
    }
    
}

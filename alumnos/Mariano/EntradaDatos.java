import java.util.Scanner;

 
 public class EntradaDatos {

    public static void main(String[] args) {

      Scanner entrada = new Scanner(System.in);

      System.out.println("ingrese un numero entero");

      int numero = entrada.nextInt();
      
      System.out.println( numero);
      
      System.out.println(" ingrese un nombre");

      String nombre = entrada.nextLine();
      String apellido = entrada.nextLine();

      System.out.println(nombre + ""+ apellido);
      entrada.close();
    }
    
}


import java.util.Scanner;
public class ProgramaManejoDeNombres {

    public static void main(String[]args) {
    Scanner nombres = new Scanner(System.in);
        
    System.out.println("Ingrese el nombre de la primer persona: ");
    String nombre1 = nombres.nextLine();
    String nombreMod1 = nombre1.toUpperCase().charAt(1) + "." + nombre1.substring(nombre1.length()-2);
    System.out.println("Ingrese el nombre de la segunda persona: ");
    String nombre2 = nombres.nextLine();
    String nombreMod2 = nombre2.toUpperCase().charAt(1) + "." + nombre2.substring(nombre2.length()-2);
    System.out.println("Ingrese el nombre de la tercer persona: ");
    String nombre3 = nombres.nextLine();
    String nombreMod3 = nombre3.toUpperCase().charAt(1) + "." + nombre3.substring(nombre3.length()-2);
    System.out.println(nombreMod1 + "_" + nombreMod2 + "_" + nombreMod3);
        nombres.close();
    }
}
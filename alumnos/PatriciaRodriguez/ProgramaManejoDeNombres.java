import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre de su padre");
        String nombrePadre = entrada.nextLine();
        String nombrePadre1 = nombrePadre.toUpperCase().charAt(1) + "." + nombrePadre.substring(nombrePadre.length()-2);

        System.out.println("Ingrese el nombre de su madre");
        String nombreMadre = entrada.nextLine();
        String nombreMadre1 = nombreMadre.toUpperCase().charAt(1) + "." + nombreMadre.substring(nombreMadre.length()-2);

        System.out.println("Ingrese el nombre de su hermana");
        String nombreHermana = entrada.nextLine();
        String nombreHermana1 = nombreHermana.toUpperCase().charAt(1) + "." + nombreHermana.substring(nombreHermana.length()-2);

        String resultado = nombrePadre1 + "_" + nombreMadre1 + "_" + nombreHermana1;

        System.out.println(resultado); 
        entrada.close();
    }
    
}

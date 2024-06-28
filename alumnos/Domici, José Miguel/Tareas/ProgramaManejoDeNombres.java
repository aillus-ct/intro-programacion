import java.util.Scanner;

public class ProgramaManejoDeNombres {
public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Introducir 3 nombres");
    System.out.println("Primer nombre:");
    String PrimerNombre = scanner.nextLine();
    System.out.println("Segundo nombre:");
    String SegundoNombre = scanner.nextLine();
    System.out.println("Tercer nombre:");
    String TercerNombre = scanner.nextLine();

    if (PrimerNombre.length() >= 2 && SegundoNombre.length() >= 2 && TercerNombre.length() >= 2) {
            
        char segundoCaracter1 = Character.toUpperCase(PrimerNombre.charAt(1));
        char segundoCaracter2 = Character.toUpperCase(SegundoNombre.charAt(1));
        char segundoCaracter3 = Character.toUpperCase(TercerNombre.charAt(1));

        String ultimosDosCaracteres1 = PrimerNombre.substring(PrimerNombre.length() - 2);
        String ultimosDosCaracteres2 = SegundoNombre.substring(SegundoNombre.length() - 2);
        String ultimosDosCaracteres3 = TercerNombre.substring(TercerNombre.length() - 2);
        
        
        String resultado = segundoCaracter1 + "." + ultimosDosCaracteres1 + "_" + segundoCaracter2 + "." + ultimosDosCaracteres2 + "_" + segundoCaracter3 + "." + ultimosDosCaracteres3;
        
        
        System.out.println(resultado);
    } else {
        System.out.println("Cada palabra debe tener al menos dos caracteres.");
    }
    
    scanner.close();
}
    
}
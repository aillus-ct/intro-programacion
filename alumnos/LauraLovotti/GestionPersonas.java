import java.util.Scanner;
public class GestionPersonas {
  public static void main (String [] args){
        
    Persona2[] persona = new Persona2[2500];
    Scanner scanner = new Scanner(System.in);
    int indice = 0;
      
    while (true) {
      System.out.print("Ingrese el nombre de la persona (o 'salir' para terminar): ");
      String nombre = scanner.nextLine();
        if (nombre.equalsIgnoreCase("salir")) {
          break;
        }

      System.out.print("Ingrese la edad de la persona: ");
      int edad = scanner.nextInt();
      scanner.nextLine(); 
      persona [indice] = new Persona2(nombre, edad);
      indice ++;
    } 
       
    double suma = 0;
    Persona2 personaMayor = persona[0];
    Persona2 personaMenor = persona[0];
      for (int cont = 0; cont < indice ; cont++){
        suma += persona[cont].getEdad();
        if (persona[cont].getEdad() > personaMayor.getEdad()){
          personaMayor = persona[cont];
        }
        if (persona[cont].getEdad() < personaMenor.getEdad()){
          personaMenor = persona[cont];
        }
      }
        
      double promedio = suma / indice;
      System.out.println("El promedio de la edad de las personas es: " + promedio);
      System.out.println("La persona de mayor edad es: " + personaMayor.getNombre());   
      System.out.println("La persona de menor edad es: " + personaMenor.getNombre()); 
  }
  
}
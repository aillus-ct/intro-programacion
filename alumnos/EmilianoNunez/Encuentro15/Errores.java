import java.util.InputMismatchException;
import java.util.Scanner;

public class Errores {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        boolean ingreso_fail = true;

        while(ingreso_fail){

            try {

                System.out.println("Ingrese el primer numero:");
                int numero1 = s.nextInt();
                s.nextLine();
                
                System.out.println("Ingrese el segundo numero:");
                int numero2 = s.nextInt();
                s.nextLine();

                int resultado = numero1 / numero2;

                System.out.println("El resultado de la division es: " + resultado);

                ingreso_fail = false;

            } catch (InputMismatchException e){
                
                System.out.println("No se ha ingresado un numero entero valido, pruebe de nuevo");
                System.out.println(e.getMessage());
                s.nextLine();

            } catch (ArithmeticException e){

                System.out.println("No se puede dividir por 0, intente de nuevo");
                System.out.println(e.getMessage());

            } catch(Exception e){
                System.out.println("Se produjo un error, intente de nuevo");
                System.out.println(e.getMessage());
                s.nextLine();
            }

        }

    }
    
}

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        //System.out.print("Ingrese un nombre para la cuenta: ");
        //String nombre = scanner.nextLine();

        //ContabilidadCuentas cuenta1 = new ContabilidadCuentas(nombre);
        
        ArrayList<ContabilidadCuentas> cuentas = new ArrayList<>(10);
        
        //cuentas.add(new ContabilidadCuentas("Cuenta uno"));
        //cuentas.add(new ContabilidadCuentas("Cuenta dos"));
        
int opcion;
        do{
            System.out.println("Menú manejo cuentas");
            System.out.println("1- Ingresar cuenta");
            System.out.println("2- Listar cuentas");
            System.out.println("3- Operar con cuenta");
            System.out.println("4- Salir");
            System.out.println("Elija una opción: ");
            opcion = scanner.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("Ingrese un nombre de cuenta: ");
                    String nombre = scanner.nextLine();
                    cuentas.add(new ContabilidadCuentas(nombre));
                    break;
                case 2:
                    for (int i = 0; i < cuentas.size(); i++) {
                        cuentas.get(i).mostrarSaldo();
                    }
                    break;
                case 3:
                    for (int i = 0; i < cuentas.size(); i++) {
                        System.out.println(i + 1 + "- " + cuentas.get(i).getNombre());
                    }
                    System.out.println("Elija una cuenta para operar:");
                    int valor = scanner.nextInt();
                    
                    ContabilidadCuentas cuenta  = cuentas.get(valor - 1);
                    OperarCuentas.operarCuenta(scanner, cuenta);
                    
                    break;
                case 4:
                    System.out.println("Saliendo del programa");
                    break;
                    default:
                    System.out.println("Opción incorrecta.");
            }
        } while(opcion != 4);

        /*for (ContabilidadCuentas cuenta : cuentas){
            System.out.println(cuenta.getNombre());
        }* /

        

        //cuenta1.mostrarSaldo();*/


        scanner.close();
    }
}

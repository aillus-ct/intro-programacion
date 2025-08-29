package Clases2;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        ArrayList<ContabilidadCuentas> cuentas = new ArrayList<>();

         int opcion;

        do {
            System.out.println("Menu manejo Cuentas");
            System.out.println("1 - Ingresar Cuenta");
            System.out.println("2 - Listar cuentas");
            System.out.println("3 - Operar con cuenta");
            System.out.println("4 - Salir");
            System.out.println("Elija una opcion");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                        System.out.println("Ingrese un nombre de cuenta:");
                        String nombre = sc.nextLine();
                        cuentas.add(new ContabilidadCuentas(nombre));
                    break;
                case 2:
                        for(int i = 0; i < cuentas.size(); i++) {
                            cuentas.get(i).mostrarSaldo();
                        }          
                    break;
                case 3:
                        for(int i = 0; i < cuentas.size(); i++) {
                            System.out.print( (i + 1) + "- "); cuentas.get(i).mostrarSaldo();
                        }  
                        
                        System.out.println("Elije una cuenta para operar: ");
                        int valor = sc.nextInt();
                        if (valor > 0 && valor <= cuentas.size()) {
                            ContabilidadCuentas cuentaSeleccionada = cuentas.get(valor - 1);
                            OperarCuentas.OperacionCuentas(sc, cuentaSeleccionada, cuentas);
                        } else {
                            System.out.println("Cuenta no válida.");
                        }


                       
                    break;
                case 4:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }

        } while( opcion != 4);

        sc.close();
        
        

    }
}

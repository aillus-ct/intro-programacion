package Clases2;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.println();
        System.out.println();

        System.out.println("Ingrese un nombre para la cuenta");
        String nombre = sc.nextLine();

        ContabilidadCuentas cuenta1 = new ContabilidadCuentas(nombre);

        int opcion;

        do {
            System.out.println("Menu manejo Cuentas");
            System.out.println("1 - Deposito");
            System.out.println("2 - Retiro");
            System.out.println("3 - Mostrar Saldo");
            System.out.println("4 - Salir");
            System.out.println("Elija una opcion");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese un monto a depositar");
                    Double deposito = sc.nextDouble();
                    cuenta1.depositar(deposito);
                    break;
                case 2:
                    System.out.println("Ingrese un monto a retirar");
                    Double retiro = sc.nextDouble();
                    cuenta1.retirar(retiro);
                    break;
                case 3:
                    System.out.println(cuenta1.ge);
                    cuenta1.mostrarSaldo();
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

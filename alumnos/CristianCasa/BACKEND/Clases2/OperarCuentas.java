package Clases2;

import java.util.Scanner;

public class OperarCuentas {

    public static void Transferir(ContabilidadCuentas cuentaOrigen, ContabilidadCuentas cuentaDestino, double monto) {
        cuentaOrigen.retirar(monto);
        cuentaDestino.depositar(monto);
        
    }
    
    public static void OperacionCuentas(Scanner sc, ContabilidadCuentas cuenta, java.util.List<ContabilidadCuentas> cuentas) {

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
                    cuenta.depositar(deposito);
                    break;
                case 2:
                    System.out.println("Ingrese un monto a retirar");
                    Double retiro = sc.nextDouble();
                    cuenta.retirar(retiro);
                    break;
                case 3:
                    System.out.println();
                    cuenta.mostrarSaldo();
                    break;
                case 4:
                    System.out.println("Desea transferir de una cuenta a otra? (si/no)");
                    String respuesta = sc.next();
                    if (respuesta.equalsIgnoreCase("si")) {
                        System.out.println("Seleccione la cuenta de origen:");
                        for (int i = 0; i < cuentas.size(); i++) {
                            System.out.print((i + 1) + "- ");
                            cuentas.get(i).mostrarSaldo();
                        }
                            int cuentaOrigenIndex = sc.nextInt() - 1;

                            System.out.println("Seleccione la cuenta de destino:");
                            for (int i = 0; i < cuentas.size(); i++) {
                                System.out.print((i + 1) + "- ");
                                cuentas.get(i).mostrarSaldo();
                            }
                                int cuentaDestinoIndex = sc.nextInt() - 1;

                                System.out.println("Ingrese el monto a transferir:");
                                double monto = sc.nextDouble();

                                ContabilidadCuentas cuentaOrigen = cuentas.get(cuentaOrigenIndex);
                                ContabilidadCuentas cuentaDestino = cuentas.get(cuentaDestinoIndex);

                                cuentaOrigen.Transferir(cuentaDestino, monto);
                            }
                            break;
                    
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }

        } while( opcion != 4);
    }
}

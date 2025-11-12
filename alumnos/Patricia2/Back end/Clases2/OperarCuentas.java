import java.util.Scanner;

public class OperarCuentas {
    public static void operarCuenta(Scanner scanner, ContabilidadCuentas cuenta) {
        int opcion;
        do {
            System.out.println("Menú de operaciones");
            System.out.println("1- Depositar");
            System.out.println("2- Retirar");
            System.out.println("3- Mostrar Saldo");
            System.out.println("4- Transferir");
            System.out.println("5- Convertir Moneda");
            System.out.println("6- Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un monto a depositar: ");
                    double deposito = scanner.nextDouble();
                    cuenta.depositar(deposito);
                    break;
                case 2:
                    System.out.print("Ingrese un monto a retirar: ");
                    double retiro = scanner.nextDouble();
                    cuenta.retirar(retiro);
                    break;
                case 3:
                    cuenta.mostrarSaldo();
                    break;
                case 4:
                    System.out.print("Ingrese el monto a transferir: ");
                    double montoTransferir = scanner.nextDouble();
                    //System.out.print("Ingrese el número de cuenta destino: ");
                    //int cuentaDestino = scanner.nextInt();
                    transferir(cuenta, montoTransferir);
                    break;
                case 5:
                    System.out.print("Ingrese la tasa de cambio: ");
                    double tasaCambio = scanner.nextDouble();
                    convertirMoneda(cuenta, tasaCambio);
                    break;
                case 6:
                    System.out.println("Saliendo del menú de operaciones");
                    break;
                default:
                    System.out.println("Opción incorrecta.");
            }
        } while (opcion != 6);
    }

    public static void transferir(ContabilidadCuentas cuentaOrigen, ContabilidadCuentas cuentaDestino, double monto) {
        cuentaOrigen.retirar(monto);
        cuentaDestino.depositar(monto);
    }

    public static void convertirMoneda(ContabilidadCuentas cuenta, double tasaCambio) {
        double saldoEnPesos = cuenta.getSaldo();
        double saldoEnDolares = saldoEnPesos / tasaCambio;
        System.out.println("Saldo en pesos: " + saldoEnPesos);
        System.out.println("Saldo en dólares: " + saldoEnDolares);
    }
}

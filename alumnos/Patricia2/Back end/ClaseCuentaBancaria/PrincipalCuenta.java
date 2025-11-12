public class PrincipalCuenta {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("123456", "Juan Perez", 1000.35);
        System.out.println(cuenta.mostrarInformacion());

        cuenta.depositar(500);
        System.out.println(cuenta.mostrarInformacion());

        System.out.println(cuenta.retirar(200));
        System.out.println(cuenta.mostrarInformacion());

        System.out.println(cuenta.retirar(1500));
        System.out.println(cuenta.mostrarInformacion());
    }
    
}

public class CuentaBancariaEjemplo {
    public static void main(String[] args) {
        CuentaBancaria cuentaBancaria1 = new CuentaBancaria("2850590940090418135201", 100000, "Pepito Perez");
        cuentaBancaria1.depositar(25000);
        cuentaBancaria1.mostrarInformacion();
    
        cuentaBancaria1.retirar(150000);
        cuentaBancaria1.mostrarInformacion();

        cuentaBancaria1.retirar(120000);
        cuentaBancaria1.mostrarInformacion();
    }
}

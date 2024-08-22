public class ResumenBancario {
    
    public static void main(String[] args) {
        
        CuentaBancaria cuenta1 = new CuentaBancaria("CC$ 191-370-874512/3", 482739, "Mateo González");
        cuenta1.mostrarInformacion();

        System.out.println();

        cuenta1.deposito(250000);
        System.out.println();
        cuenta1.retiro(175000);
        System.out.println();
        cuenta1.retiro(980000);
        System.out.println();
        cuenta1.mostrarInformacion();
        
        
    }

}

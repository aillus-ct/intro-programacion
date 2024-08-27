public class OperacionBancaria {
    public static void main (String [] args){
        CuentaBancaria cuenta1 = new CuentaBancaria("123", 25.50, "Laura");
        cuenta1.depositar(35.5);
        cuenta1.mostrarInformacion();
        cuenta1.retirar(25.5);
        cuenta1.mostrarInformacion();
        cuenta1.retirar(45.5);
        cuenta1.mostrarInformacion();
        cuenta1.depositar(35.5);
        cuenta1.mostrarInformacion();
        
    }    
}
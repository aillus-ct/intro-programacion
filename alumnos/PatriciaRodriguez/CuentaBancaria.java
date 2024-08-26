public class CuentaBancaria {
    // declaro variables
    private String numeroCuenta;
    private double saldo;
    private String titular;

    // constructor
    public CuentaBancaria(String numeroCuenta, double saldo, String titular) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.titular = titular;
    }

    // metodos get
    public String getNumeroCuenta(){
        return this.numeroCuenta;
    }
    public double getSaldo(){
        return this.saldo; 
    }
    public String getTitular(){
        return this.titular;
    }

    // metodo depositar para aumentar el saldo
    public void depositar(double monto){
        this.saldo += monto;
    }

    // metodo retirar para disminuir el saldo, si hay suficiente saldo
    public void retirar(double monto){
        if (monto > 0) {
            if (this.saldo >= monto) {
            this.saldo -= monto;
        } else {
            System.out.println("No hay suficiente saldo. Intente con un monto menor.");
        }
    }
    }

    // mostrar info
    public void mostrarInformacion(){
        System.out.println("El numero de la cuenta es: " + this.numeroCuenta + "\nEl titular de la cuenta es: " + this.titular + "\nEl saldo de la cuenta es: " + this.saldo);
    }

}
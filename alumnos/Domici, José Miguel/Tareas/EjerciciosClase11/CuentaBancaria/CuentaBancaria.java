public class CuentaBancaria {

    private String numeroCuenta;
    private double saldo;
    private String titular;
        
    public CuentaBancaria (String numeroCuenta, double saldo, String titular){
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.titular = titular;

    }

    public String getNumeroCuenta(){
        return this.numeroCuenta;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public String getTitular(){
        return this.titular;
    }

    public void deposito(double montoDepositado){
        this.saldo += montoDepositado;
        System.out.println("Se deposito $" + montoDepositado + "\nSu nuevo saldo es de $" + this.saldo);
    }

    public void retiro (double montoRetirado){
        if (montoRetirado <= this.saldo){
            this.saldo -= montoRetirado;
            System.out.println("Se retiro $" + montoRetirado + "\nSu nuevo saldo es de $" + this.saldo);
        } else {
            System.out.println("No hay saldo suficiente");
        }
    }

    public void mostrarInformacion (){
        System.out.println("Número de cuenta: " + this.numeroCuenta + "\nEl titular de la cuenta es: " + this.titular + "\nSu saldo es de $" + this.saldo);
    }

}
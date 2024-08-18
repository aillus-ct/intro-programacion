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

    public double getSaldo() {
        return this.saldo;
    }

    public String getTitular() {
        return this.titular;
    }

    public double depositar(double monto){
       this.saldo= this.saldo + monto;
        return this.saldo;
    }

    public double retirar(double monto){
      if (this.saldo >= monto){
        this.saldo = this.saldo - monto;
        return this.saldo;
        } else {
         System.out.println("El saldo es insuficiente para la operacion que quiere realizar") ;
        return this.saldo;

        }   
    }
    public void mostrarInformacion(){
        System.out.println("El saldo de la cuenta nro: " + this.numeroCuenta + 
        " del titular: " + this.titular + " es $: " + this.saldo);
    }
}
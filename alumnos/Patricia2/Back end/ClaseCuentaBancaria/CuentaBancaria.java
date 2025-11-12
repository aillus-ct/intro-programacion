public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    private String titular;

    public CuentaBancaria(String numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public String retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            return "Retiro exitoso. Nuevo saldo: " + saldo;
        }
        return "Fondos insuficientes. Saldo actual: " + saldo;
    }

    public String mostrarInformacion() {
        return "Número de Cuenta: " + numeroCuenta + ". Titular: " + titular + ". Saldo: " + saldo;
    }
}

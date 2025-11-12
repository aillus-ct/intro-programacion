public class ContabilidadCuentas {
    private String nombre;
    private double saldo;

    //Contructor: inicializa el nombre y el saldo
    public ContabilidadCuentas(String nombre) {
        this.nombre = nombre;
        this.saldo = 0;
    }

    public void depositar(double deposito) {
        saldo = saldo + deposito;

    }

    public void retirar(double retiro) {
        if (retiro > saldo) {
            System.out.println("No posee los fondos suficientes.");
            
        } else {
            saldo -= retiro;
        }
        System.out.println("Su saldo es: $" + getSaldo());
    }

    public void mostrarSaldo(){
        System.out.println("Nombre: " + nombre + " $" + saldo);
    }

    public String getNombre() {
        return nombre;
    }

    public double getSaldo() {
        return saldo;
    }



}

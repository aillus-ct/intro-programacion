package Clases2;

public class ContabilidadCuentas {
    
    private String nombre;
    private Double saldo;

    //Constructor: inicializa los atributos 
    public ContabilidadCuentas(String nombre){
        this.nombre = nombre;
        this.saldo = 0.0;
    }

    public void depositar(Double deposito){
        saldo = saldo + deposito;
    }

    public void retirar(Double retiro){
        if(retiro > saldo){
            System.out.println("No posee los fondos suficientes");
        } else {
            saldo -= retiro;
        }
        System.out.println("Su saldo es: $" + getSaldo());
    }

    public void mostrarSaldo(){
        System.out.println("Nombre: " + nombre + " | $" + saldo);
    }

    public String getNombre(){
        return nombre;
    }

    public Double getSaldo(){
        return saldo;
    }


}

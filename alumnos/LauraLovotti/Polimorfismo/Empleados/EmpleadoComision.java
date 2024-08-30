public class EmpleadoComision extends Empleado {
    private double salarioBase;
    private double totalVentas;
    private double porcComision;

    public EmpleadoComision (String nombre, int antigüedad, String puesto, double salarioBase, double totalVentas, double porcComision){
        super (nombre, antigüedad, puesto);
        this.salarioBase = salarioBase;
        this.totalVentas = totalVentas;
        this.porcComision = porcComision;
    }

    public void calcularSalario(){
        double salario = this.salarioBase + (this.totalVentas * this.porcComision);
        System.out.println("Al empleado Fijo " + this.nombre + " de " + this.antigüedad + " años de antigüedad que trabaja como " + 
        this.puesto + " le corresponde un salario de $: " + salario);
    }
}
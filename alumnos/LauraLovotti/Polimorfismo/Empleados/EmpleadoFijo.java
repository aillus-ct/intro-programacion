public class EmpleadoFijo extends Empleado {
    private double salario;

    public EmpleadoFijo (String nombre, int antigüedad, String puesto, double salario){
        super (nombre, antigüedad, puesto);
        this.salario = salario;
    }

    public void calcularSalario(){
        System.out.println("Al empleado Fijo " + this.nombre + " de " + this.antigüedad + " años de antigüedad que trabaja como " + 
        this.puesto + " le corresponde un salario de $: " + this.salario);
    }
}
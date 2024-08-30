public class EmpleadoxHora extends Empleado {
    private double precioHora;
    private int cantHorasTrab;

    public EmpleadoxHora (String nombre, int antigüedad, String puesto, double precioHora, int cantHorasTrab){
        super (nombre, antigüedad, puesto);
        this.precioHora = precioHora;
        this.cantHorasTrab = cantHorasTrab;
    }

    public void calcularSalario(){
        double salario = this.precioHora * this.cantHorasTrab;
        System.out.println("Al empleado x comision " + this.nombre + " de " + this.antigüedad + " años de antigüedad que trabaja como " + 
        this.puesto + " le corresponde un salario de $: " + salario);
    }
}
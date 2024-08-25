public class EmpleadoComision extends Empleado {
    
    private double ventas;
    private double salarioMinimo;

    public EmpleadoComision(double ventas){
        super();
        this.ventas = ventas;
    }

    public void calcularSalario(){
        salarioMinimo = 850000;
        double salario = salarioMinimo + (ventas * 0.1);
        System.out.println("El empleado por comision cobra: $" + salario);
    }
}

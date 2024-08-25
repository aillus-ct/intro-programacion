public class EmpleadoFijo extends Empleado{
    
    public EmpleadoFijo(){
        super();
    }

    public void calcularSalario(){
        double salario = 1000000;
        System.out.println("El salario del empleado fijo es: " + salario);
    }
}
package PolimorfismoEmpleados;

public class EmpleadoFijo extends Empleado {
    public void calcularSalario(){
        double salario = 300000;
        System.out.println("El salario fijo mensual es de $ " + salario);
    }

    
}

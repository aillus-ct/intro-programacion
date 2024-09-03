package PolimorfismoEmpleados;

public class EmpleadoComision extends Empleado {
    double sueldoBasico = 695.347;
    double comision = 100.000;

    public void calcularSalario(){
        double salario = sueldoBasico + comision;
        System.out.println("El salario basado en comisiones es de $ " + salario);
    }

    
}

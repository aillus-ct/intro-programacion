package PolimorfismoEmpleados;

public class LosEmpleados {
    public static void main(String[] args) {
        Empleado[] empleados= new Empleado[3];
        empleados[0] = new EmpleadoFijo();
        empleados[1] = new EmpleadoPorHoras();
        empleados[2] = new EmpleadoComision();
        for (Empleado empleado : empleados) {
            empleado.calcularSalario();
        }
    }
}


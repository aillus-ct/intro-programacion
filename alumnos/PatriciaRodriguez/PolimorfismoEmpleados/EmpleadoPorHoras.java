package PolimorfismoEmpleados;

public class EmpleadoPorHoras extends Empleado {

    int horasTrabajadas = 192;
    double valorHora = 205.5;


    public void calcularSalario(){
        double sueldo = horasTrabajadas * valorHora;
        System.out.println("El salario basado en horas trabajadas es de $ " + sueldo);
    }

    
}

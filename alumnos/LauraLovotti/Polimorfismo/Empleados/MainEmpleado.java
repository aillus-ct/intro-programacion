public class MainEmpleado {

    public static void main (String[] args){
        Empleado[] empleados = new Empleado[3];

        empleados[0] = new EmpleadoFijo("Jose", 5, "cajero", 12538.5);
        empleados[1] = new EmpleadoxHora("Manuel", 3, "vigilancia", 1587.3, 20);
        empleados[2] = new EmpleadoComision("Sofia", 10, "vendedora", 11548.3, 25874.3, 0.25);

        for (Empleado empleado:empleados){
            empleado.calcularSalario();
        } 
    }
}
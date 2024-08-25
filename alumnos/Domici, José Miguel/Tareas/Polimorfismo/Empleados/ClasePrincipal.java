public class ClasePrincipal {

    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[3];
        
        empleados[0] = new EmpleadoComision(200000);
        empleados[1] = new EmpleadoFijo();
        empleados[2] = new EmpleadoPorHoras(155);

        for (Empleado empleado:empleados){
            empleado.calcularSalario();
        }
    }
    
}

public class EmpleadoPorHoras extends Empleado {
    private int horasTrabajadas;
    private double salarioPorHora;

    public EmpleadoPorHoras(int horasTrabajadas){
        super();
        this.horasTrabajadas = horasTrabajadas;
    }

    public void calcularSalario(){
        salarioPorHora = 7000;
        double sueldo = salarioPorHora * horasTrabajadas;
        System.out.println("El empleado por hora cobra: $" + sueldo);
    }
}

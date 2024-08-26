public class Empleado extends Persona2{
    private double salario;
    private String puesto;

    public Empleado(String nombre, int edad, double salario, String puesto){
        super (nombre, edad);
        this.salario = salario;
        this.puesto = puesto;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }
    public void setPuesto(String puesto){
        this.puesto = puesto;
    }
    
    public double getSalario(){
        return this.salario;
    }
    public String getPuesto(){
        return this.puesto;
    }

    public void mostrarInformacion(){
        System.out.println("El empleado: " + this.nombre + " tiene " + this.edad + " años trabaja en el puesto de " + this.puesto +
         " y tiene un salario de $ " + this.salario);
    }

}
public class Empleados extends Persona {
    
    private double salario;
    private String puesto;

    public Empleados(String nombre, int edad, double salario, String puesto){
        super(nombre, edad, puesto);
        this.salario = salario;
        this.puesto = puesto;
       
    }

    public void mostrarInformacion(){
        System.out.println("Nombre: " + nombre + "\nEdad: " + edad + "\nSalario: " + salario + "\nPuesto: " + puesto);

    }
}
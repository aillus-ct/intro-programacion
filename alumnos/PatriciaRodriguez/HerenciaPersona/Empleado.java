package HerenciaPersona;
public class Empleado extends PersonaDos{
    private double salario;
    private String puesto;

    public Empleado(String nombre, int edad, double salario, String puesto) {
        super(nombre, edad);
        this.salario = salario;
        this.puesto = puesto;
    }


    public void mostrarInformacion() {      
        System.out.println(" El empleado ");
        super.mostrarInformacion();
        System.out.println("Trabaja de " + puesto + " y su salario es de $" + salario);
    
    }

   
}



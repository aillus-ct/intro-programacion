abstract public class Empleado {
    String nombre;
    int antigüedad;
    String puesto;

    public Empleado (String nombre, int antigüedad, String puesto){
        this.nombre = nombre;
        this.antigüedad = antigüedad;
        this.puesto = puesto;
    }

    abstract public void calcularSalario();
}
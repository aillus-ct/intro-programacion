abstract public class Vehiculo {
    String marca;
    String modelo;
    int año;

    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    abstract public void mover();
}

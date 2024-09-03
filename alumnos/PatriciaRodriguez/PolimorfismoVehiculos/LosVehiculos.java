package PolimorfismoVehiculos;

public class LosVehiculos {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = new Vehiculo[3];
        vehiculos[0] = new Auto();
        vehiculos[1] = new Bicicleta();
        vehiculos[2] = new Barco();
        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.mover();
        }
    }
}

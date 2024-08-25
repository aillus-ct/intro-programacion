public class ClasePrincipal {
    
    public static void main(String[] args) {
        Vehiculo[] vehiculos = new Vehiculo[3];
        
        vehiculos[0] = new Auto("Ford", "Falcon", 69);
        vehiculos[1] = new Barco("Cruceros SK", "Sk 35", 2001);
        vehiculos[2] = new Bicicleta("Mtb Overtech", "R29", 2024);

        for (Vehiculo vehiculo:vehiculos){
            vehiculo.mover();
        }
    }
}

package PolimorfismoElectrodomesticos;

public class LosElectrodomesticos {
    public static void main(String[] args) {
        Electrodomestico[] electrodomesticos = new Electrodomestico[3];
        electrodomesticos[0] = new Lavadora();
        electrodomesticos[1] = new Refrigerador();
        electrodomesticos[2] = new Microondas();
        for (Electrodomestico electrodomestico : electrodomesticos) {
            electrodomestico.funcionar();
        }
    }
}

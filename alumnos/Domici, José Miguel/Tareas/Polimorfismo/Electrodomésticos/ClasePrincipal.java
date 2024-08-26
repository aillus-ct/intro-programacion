public class ClasePrincipal {
    
    public static void main(String[] args) {
        Electrodomestico[] electrodomesticos = new Electrodomestico[3];
        
        electrodomesticos[0] = new Lavadora();
        electrodomesticos[1] = new Microondas();
        electrodomesticos[2] = new Refrigerador();

        for (Electrodomestico electrodomestico:electrodomesticos){
            electrodomestico.funcionar();
        }
    }
}

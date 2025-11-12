
public class FabricaAutomovil {
    public static void main(String[] args) {
        
        //String nombre = new String("Fabrica de Autos");
        Auto auto1 = new Auto("Ford", "Fiesta", "Rojo", 2025);
        Auto auto2 = new Auto("Chevrolet", "Corsa", "Negro", 2021);
        Auto auto3 = new Auto("Audi", "tt", "Blanco", 2023);

        auto1.setMarca("Ford");
        /*auto2.setMarca("Chevrolet");
        auto3.setMarca("Audi");
        auto1.getMarca();
        String marcaAuto1 = auto1.getMarca();
        String marcaAuto2 = auto2.getMarca();
        String marcaAuto3 = auto3.getMarca();*/

        //System.out.println(marcaAuto1 + marcaAuto2 + marcaAuto3);
        auto1.mostrarInfo();
        System.out.println(auto1.getColor());
        //auto2.mostrarInfo();
        //auto3.mostrarInfo();

    }
}

public class Main {
    public static void main(String[] args) {
        
        Circulo circulo1 = new Circulo(13);
        Cilindro cilindro = new Cilindro(17, 25);

        circulo1.mostrarInformacion();
        System.out.println();
        circulo1.setRadio(15);  
        circulo1.mostrarInformacion();

        System.out.println();
        System.out.println("Informacion del Cilindro");
        System.out.println("El área de la base del cilindro es: " + cilindro.calcularArea() + "\nEl volumen del cilindro es: " + cilindro.calcularVolumen() + "\nEl área de la superficie del cilindro: " + cilindro.calcularAreaSuperficie());
    }
}

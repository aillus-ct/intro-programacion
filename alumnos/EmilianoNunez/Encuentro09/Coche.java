public class Coche {

    static int ruedas = 4;

    static void service(int km){
        if (km < 1000){
            System.out.println("Proximo service a los 1000");
        } else if (km < 3000) {
            System.out.println("Proximo servicio a los 3000");
        } else if (km < 10000){
            System.out.println("Proximo servicio a los 10000");
        } else {
            System.out.println("Llama a su vendedor");
        }
    }

    // Atributos
    private String marca;
    private String modelo;
    private int anio;

    // Constructor
    public Coche(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    // Métodos
    public void arrancar() {
        System.out.println("El coche está arrancando");
    }

    public void frenar() {
        System.out.println("El coche está frenando");
    }
}
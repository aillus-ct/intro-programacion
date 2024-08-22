
public class Main {
    public static void main(String[] args) {

        Coche miToyota = new Coche("Toyota", "Corolla", 2022);
        Coche miFord = new Coche("Ford", "K", 2023);
        
        miToyota.arrancar();
        miToyota.frenar();

        miFord.arrancar();
        miFord.frenar();

        System.out.println("Ruedas: " + Coche.ruedas);

    }
}
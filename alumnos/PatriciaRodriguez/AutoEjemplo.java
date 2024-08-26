public class AutoEjemplo {
    public static void main(String[] args) {
        
        Automovil auto = new Automovil();
        auto.modelo = "Ka";
        auto.marca = "Ford";
        auto.color = "Azul";
        auto.cilindrada = 4;
        auto.peso = 1300;
        auto.año = 2015;

        System.out.println("El modelo es auto es: " + auto.modelo);
        System.out.println("La marca del auto es: " + auto.marca);
        System.out.println("El color del auto es: " + auto.color);
        System.out.println("El auto tiene: " + auto.cilindrada + " cilindradas");
        System.out.println("El auto pesa: " + auto.peso + " kilos");
        System.out.println("El auto es del año: " + auto.año);
    }
}

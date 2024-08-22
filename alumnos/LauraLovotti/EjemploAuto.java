public class EjemploAuto {
    public static void main(String[] args) {
        Automovil ford = new Automovil();
        ford.version = "Ka";
        ford.color = "Negro";
        ford.año = 2020;
        ford.peso = 1300;
        ford.cilindrada = 4;
        
        System.out.println("La version del auto es: " + ford.version);
        System.out.println("El color del auto es: " + ford.color);
        System.out.println("El año del auto es: " + ford.año);
        
        Automovil toyota = new Automovil();
        toyota.version = "Corolla";
        toyota.color = "Rojo";
        toyota.año = 2019;
        
        System.out.println("La version del auto es: " + toyota.version);
        System.out.println("El color del auto es: " + toyota.color);
        System.out.println("El año del auto es: " + toyota.año);

    }
}


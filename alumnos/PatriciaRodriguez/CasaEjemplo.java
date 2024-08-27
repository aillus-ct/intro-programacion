public class CasaEjemplo {
    public static void main(String[] args) {
        Casa casa = new Casa();
        casa.planta = 2;
        casa.habitaciones = 3;
        casa.baño = 1;
        casa.metrosCuadrados = 20.3;
        casa.domilicio = "Calle 123";
        casa.barrio = "Barrio 123";
        casa.precio = 21.5;

        System.out.println("La casa tiene " + casa.planta + " plantas.");
        System.out.println("La casa tiene " + casa.habitaciones + " habitaciones.");
        System.out.println("La casa tiene " + casa.baño + " baño.");
        System.out.println("La casa tiene " + casa.metrosCuadrados + " metros cuadrados.");
        System.out.println("La casa queda en " + casa.domilicio);
        System.out.println("Esta ubicada en el " + casa.barrio);
        System.out.println("El precio de la casa es de " + casa.precio + " millones de pesos.");
    }
}

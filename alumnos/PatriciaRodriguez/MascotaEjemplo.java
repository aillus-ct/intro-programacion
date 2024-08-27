public class MascotaEjemplo {
    public static void main(String[] args) {
        Mascota mascota = new Mascota();
        mascota.tipo = "perro";
        mascota.nombre = "Fido";
        mascota.raza = "mestizo";
        mascota.color = "negro";
        mascota.largoDePelo = "corto";
        mascota.edad = 6;
        mascota.peso = 39.3;
        mascota.altura = 89;
        mascota.largo = 1.23;

        System.out.println("El tipo de mascota es un " + mascota.tipo);
        System.out.println("Su nombre es " + mascota.nombre);
        System.out.println("Es de raza " + mascota.raza);
        System.out.println("El color de pelo es " + mascota.color);
        System.out.println("Tiene el pelo " + mascota.largoDePelo);
        System.out.println("Tiene " + mascota.edad + " años");
        System.out.println("Pesa " + mascota.peso + " kilos");
        System.out.println("Mide " + mascota.altura + " centrimetros de alto");
        System.out.println("Mide " + mascota.largo + " metros de largo");

    }
}

public class BotellaEjemplo {
    public static void main(String[] args) {
        Botella botella = new Botella();
        botella.marca = "Romania";
        botella.material = "acero inoxidable";
        botella.color = "rojo";
        botella.capacidad = 500;
        botella.altura = 33.2;
        botella.tapa = "a rosca";
        botella.pico = "Si";

        System.out.println("La botella es de marca " + botella.marca);
        System.out.println("Esta hecha de " + botella.material);
        System.out.println("La botella es de color " + botella.color);
        System.out.println("Tiene capacidad para " + botella.capacidad + " mililitros");
        System.out.println("Su altura es de " + botella.altura + " centrimetros");
        System.out.println("La tapa es " + botella.tapa);
        System.out.println(botella.pico + " tiene pico y esta en la tapa.");
    }
}

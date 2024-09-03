 package HerenciaCirculo;

public class EjercicioCirculoHerencia {
    public static void main(String[] args) {
        Cilindro cilindro1 = new Cilindro(5, 13.5);
        double areaBase = Math.PI * Math.pow(cilindro1.getRadio(), 2);
        double volumen = cilindro1.calcularVolumen();
        double areaSuperficie = cilindro1.calcularAreaSuperficie();
        System.out.println("La base del cilindro es: " + areaBase + "\nEl volumen es de " + volumen + "\nY el area de la superficie es de " + areaSuperficie);
    }
}


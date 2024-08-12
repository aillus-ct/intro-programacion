public class Main {
    public static void main(String[] args) {
        Rectangulo cuadrado1 = new Rectangulo(10, 20);
        System.out.println("Area: " + cuadrado1.obtenerArea());
        System.out.println("Perimetro: " + cuadrado1.obtenerPerimetro());
        cuadrado1.setAltura(5);
        cuadrado1.setBase(5);
        System.out.println("Area: " + cuadrado1.obtenerArea());
        cuadrado1.setAltura(100);
        cuadrado1.setBase(100);
        System.out.println("Area: " + cuadrado1.obtenerArea());
        
        System.out.println("Base: " + cuadrado1.getBase());
        System.out.println("Altura: " + cuadrado1.getAltura());
        
        
        
    }
}

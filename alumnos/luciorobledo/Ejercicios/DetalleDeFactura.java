import java.util.Scanner;
public class DetalleDeFactura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la factura:");
        String nombreFactura = scanner.nextLine();
        System.out.println("Ingrese valor de producto 1 ");
        double valorProducto1 = scanner.nextDouble();
        System.out.println("Ingrese el valor de producto 2");
        double valorProducto2 = scanner.nextDouble();
        double total = valorProducto1 + valorProducto2;
        double Impuesto = total * 0.19;
        double totalFactura = total + Impuesto;
        System.out.println("La factura " +nombreFactura+ " tiene un total bruto de " +total+ " con un impuesto de " +Impuesto+ " y el monto después de impuesto es de " +totalFactura);


    }

}

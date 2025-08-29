import java.util.Scanner;
public class DetalleFactura {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la factura");
        String nombreFactura = scanner.nextLine();
        System.out.println("Ingrese valor de producto 1");
        double valorproducto1 = scanner.nextDouble();
        System.out.println("Ingrese valor de prodcuto 2");
        double valorproducto2 = scanner.nextDouble();
        double total = valorproducto1 + valorproducto2;
        double impuesto = total * 0.19;
        double totalFactura = total + impuesto;
        System.out.println(" La factura " +nombreFactura+ " Tiene un total de " +totalFactura+ " Tiene un total bruto de " +total+ " Con un impuesto de " +impuesto+ " Y el monto despues de impuestos es de " +totalFactura);
        scanner.close();


    }
}
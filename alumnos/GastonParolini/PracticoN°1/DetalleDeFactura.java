import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);

        System.out.println();
        System.out.println();

        System.out.println("Ingrese el nombre o descripcion de la factura: ");

        String nombreFactura = entrada.nextLine();

        System.out.println("Ingrese el valor del 1° producto: ");

        double precio1 = entrada.nextDouble();

        System.out.println("Ingrese el valor del 2° producto: ");
        
        double precio2 = entrada.nextDouble();

        double totalBruto = precio1 + precio2;

        double impuesto = totalBruto * 0.19;

        double totalNeto = totalBruto + impuesto;

        System.out.println("La factura "+nombreFactura+" tiene un toltal bruto de $"+totalBruto+", con un impuesto de $"+impuesto+" y el monto despues de impuesto es $"+totalNeto);

        
    }
    
}

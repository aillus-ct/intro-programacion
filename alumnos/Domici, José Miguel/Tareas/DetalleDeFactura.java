import java.util.Scanner;


public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre de factura o Descripción: ");
        String linea = scanner.nextLine();
        

        System.out.print("Importe 1: ");
        double importe1 = scanner.nextDouble();
        
        System.out.println("Importe 2");
        double importe2 = scanner.nextDouble();
       


        double totalBruto = importe1 + importe2;

        double impuesto = totalBruto * 0.19;

        double totalNeto = totalBruto + impuesto;

        System.out.println("Nombre de factura o Descripción: " + linea);
        System.out.println("Importe 1: $ " + importe1);
        System.out.println("Importe 2: $ " + importe2);
        System.out.println("Total Bruto: $ " + totalBruto);
        System.out.println("Impuesto: $ " + impuesto);
        System.out.println("Total Neto: $ " + totalNeto);

        scanner.close();
    }
}
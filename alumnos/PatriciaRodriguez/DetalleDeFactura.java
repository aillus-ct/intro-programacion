import java.util.Scanner;

public class DetalleDeFactura {

    public static void main(String[] args) {

        System.out.println();

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la factura");
        String nombreFactura = entrada.nextLine();
        System.out.println("Ingrese el valor del producto 1");
        double valorProducto1 = entrada.nextDouble();
        System.out.println("Ingrese el valor del producto 2");
        double valorProducto2 = entrada.nextDouble();
        double total = valorProducto1 + valorProducto2;
        double impuesto = total + 0.19;
        double totalFactura = total + impuesto;
        System.out.println("La factura " + nombreFactura + " tiene un total bruto de " + total +  " con un impuesto de " + impuesto + " y el monto después de impuesto es de " + totalFactura);
       entrada.close();


        

        
        
    }
    
}

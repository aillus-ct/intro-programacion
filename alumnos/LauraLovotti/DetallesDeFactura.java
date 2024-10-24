import java.util.Scanner;
public class DetallesDeFactura {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre de la factura o descripcion: ");
        String nombreFactura = scanner.nextLine();
                
        System.out.println("Introduce el importe bruto del primer producto: ");
        double precio1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Introduce el importe bruto del segundo producto: ");
        double precio2 = scanner.nextDouble();
        scanner.nextLine();
        double totalBruto = precio1 + precio2;
        double impuesto = totalBruto * 0.19;
        double totalFactura = totalBruto + impuesto;
        System.out.print("La factura " + nombreFactura);
        System.out.print(" tiene un total bruto de $ " + totalBruto);
        System.out.print(" con un impuesto de $ " + impuesto);
        System.out.println(" y el monto despues de impuesto es $ " + totalFactura);
        scanner.close();
    }
}
    
                

       
       

        
       

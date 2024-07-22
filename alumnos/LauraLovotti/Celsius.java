import java.util.Scanner;
public class Celsius {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tipo de grados(Celsius/Farenheit): ");
        String tipoTemp = scanner.nextLine();

        System.out.println("Ingrese la temperatura:");
        Double temp = scanner.nextDouble();
        
        if (tipoTemp.equals("Celsius")) {
        Double tempConv =  (temp * 9/5) + 32;
        System.out.println("La temperatura en grados Farenheit es: " + tempConv); 

        }else {
        Double tempConv =  (temp - 32) * 5/9;
        System.out.println("La temperatura en grados Celsius es: " + tempConv); 

        }
        scanner.close();
    }
}

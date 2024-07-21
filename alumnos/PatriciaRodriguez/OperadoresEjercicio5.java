import java.util.Scanner;

public class OperadoresEjercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la temperatura en grados Celsius");
        double temperaturaCelsius = entrada.nextDouble();

        double temperaturaFahrenheit = (temperaturaCelsius * 9.0/5.0) + 32;
        System.out.println(temperaturaCelsius + " grados Celsius equivale a " + temperaturaFahrenheit + " grados Fahrenheit.");

        System.out.println("Ingrese la temperatura en grados Fahrenheit");
         temperaturaFahrenheit = entrada.nextDouble();
        
         temperaturaCelsius = (temperaturaFahrenheit - 32) *(5.0/9.0);
        System.out.println(temperaturaFahrenheit + " grados Fahrenheit equivale a " + temperaturaCelsius + " grados Celsius.");
         entrada.close();
         
        }
    }


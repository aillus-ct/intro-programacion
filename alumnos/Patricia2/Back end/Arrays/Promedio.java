package Arrays;

public class Promedio {

    public static void main(String[] args) {
        int[] numeros = {11, 28, 32, 49, 57};
        int suma = 0;
        
        for (int numero : numeros) {
            suma += numero;
        }
        
        double promedio = (double) suma / numeros.length;
        System.out.println("El promedio de los números es: " + promedio);
    }
    
}

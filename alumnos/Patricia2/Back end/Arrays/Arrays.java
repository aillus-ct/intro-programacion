package Arrays;
public class Arrays {
    public static void main(String[] args) {
      //int[] numeros = {1, 2, 3, 4, 5};
     // String[] nombres = {"Juan", "Ana", "Pedro", "Maria"};

        int[] edades;// Declaración de un arraysin inicializar
        
        edades = new int[5];// Inicialización del array

        edades[0] = 30;
        edades[1] = 31;
        edades[2] = 5;
        edades[3] = 2;
        edades[4] = 32;

        for (int i = 0; i < edades.length; i++) {
            System.out.println("Posición " + (i + 1) + ": " + edades[i]);
        }
      
        for (int edad : edades) {
            System.out.println("Edad: " + edad);
        }
    }
}

public class Ejercicios {
    // ejercicio 1
    public static int suma (int num1, int num2){
        return num1 + num2;
    }
    // ejercicio 2
    public static boolean esPar (int numero) {
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }  
    public static void main(String[] args) {
        System.out.println("La suma es: " + suma(10, 15));
        System.out.println("Es par: " + esPar(20));
    }

    
}

import java.util.Scanner;

public class Ejercicios {
    
    // ejercicio 1
    public static int suma(int numero1, int numero2){
        return numero1 + numero2;
    }
    // public static void suma1(){}
    // ejercicio 2
    public static boolean esPar(int numero) {
       if (numero % 2 == 0){
        return true;
       } else {
        return false;
       }
    }
    // ejercicio 3
    public static void factorial() {  
    }
    // ejercicio 4
    public static void numeroMaximo() {
    }
    // ejercicio 5
    public static void Array() {
    }
    // ejercicio 6
    public static void arrayPromedio(){
    }

public static void main(String[] args) {
    // ejercicio 1
    System.out.println("La suma es: " + suma(48, 18));

    Scanner entrada = new Scanner(System.in);
    System.out.println("Ingrese un número: ");
    int numeroUno = entrada.nextInt();
    System.out.println("Ingrese otro número: ");
    int numeroDos = entrada.nextInt();
    int suma1 = numeroUno + numeroDos;
    System.out.println("La suma es " + suma1);
    
    
    // ejercicio 2
    System.out.println("El numero es " + esPar(29));
    
    // ejercicio 3
    
    System.out.println("Ingrese un numero: ");
    int numeroUsuario = entrada.nextInt();
    int factorial = 1;
    for (int i = 1; i <= numeroUsuario; i++) {
        factorial *= i;
    }
    
    System.out.println("El factorial del numero " + numeroUsuario + " es " + factorial);
    
    // ejercicio 4
    int numeros3[] = {20, 85, 46};
    int numeroMaximo = numeros3[0];
    for (int i = 1; i < numeros3.length; i++){
        if (numeros3[i] > numeroMaximo) {
            numeroMaximo = numeros3[i];
        }
    }  
    System.out.println("El numero maximo del array es: " + numeroMaximo); 

    // ejercicio 5
    int[] numeros = {1, 2, 3, 4, 5};
    for (int numero :numeros){
        System.out.println(numero);
    }
    
    // ejercicio 6
    int[] numeros1 = {1, 2, 3, 4, 5, 6};
    double promedio;
    int suma = 0;

    for (int i = 0; i < numeros1.length; i++) {
        suma += numeros1[i];
        }
    promedio = (double) suma / numeros1.length;
    System.out.println("El promedio es: " + promedio);
    entrada.close();
}
}

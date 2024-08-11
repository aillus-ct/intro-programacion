import java.util.Scanner;
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
    // ejercicio 3
    public static int factorial (int numero) {
       int calcfact = numero;
        for (int cont = numero - 1; cont >= 1; cont --) {
            calcfact = calcfact * cont;
        }
        return calcfact;
    } 
    //ejercicio 4
    public static int mayor (int num1, int num2, int num3) {
        int numMayor = 0;
        if (num1 > num2 && num1 > num3) {
            numMayor = num1;
        } else if (num2 > num3) {
            numMayor = num2;
        } else {
            numMayor = num3;
        } 
        return numMayor;
    }
    // ejercicio 5
    public static void imprimirArreglo(int[] arrNumeros) {
    for (int numero : arrNumeros) {
            System.out.println(numero);
        }
    }
    // ejercicio 6
     public static double promedio (int[] arrNumeros) {
        double suma = 0;
        for (int numero : arrNumeros){
            suma += numero;
        }
        return suma / arrNumeros.length;
     }
    // llamador de funciones
        public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("ingrese un numero: ");
        int numeroIng1 = numero.nextInt();
        System.out.println("ingrese otro numero: ");
        int numeroIng2 = numero.nextInt(); 
        System.out.println("ingrese otro numero: ");
        int numeroIng3 = numero.nextInt();       
        System.out.println("La suma es: " + suma(numeroIng1, numeroIng2));
        System.out.println("Es par: " + esPar(numeroIng1));
        System.out.println("El factorial es:" + factorial(numeroIng2));
        System.out.println("El mayor de los numeros es: " + 
        mayor(numeroIng1, numeroIng2, numeroIng3));
        int[] numeros = {18, 23, 34, 41, 58};
        imprimirArreglo(numeros);
        System.out.println("El promedio es: " + promedio(numeros));
    } 
}

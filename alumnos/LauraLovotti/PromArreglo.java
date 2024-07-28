public class PromArreglo {
    public static void main(String[] args) {
        int[] numeros = {18, 23, 34, 41, 58};
        int suma = 0;
        for (int numero : numeros){
            suma += numero;
        }
        int longArreglo = numeros.length;
        double promedio = (double) suma / longArreglo;
        System.out.println("El promedio de los elementos del arreglo es: " + promedio);
    }
}       
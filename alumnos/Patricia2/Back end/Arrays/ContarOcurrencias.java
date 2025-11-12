package Arrays;

public class ContarOcurrencias {

    public static void main(String[] args) {
        int[] numeros = {11, 20, 37, 20, 43, 20, 56, 20, 89, 20};
        int numeroRepetido = 20;
        int contador = 0;
      
        for (int numero : numeros) {
            if (numero == numeroRepetido) {
                contador++;
            }
        }
        System.out.println("El número " + numeroRepetido + " aparece " + contador + " veces en el array.");
    }
    
}

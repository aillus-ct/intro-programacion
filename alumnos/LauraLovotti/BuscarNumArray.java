import java.util.Scanner;
public class BuscarNumArray {
        public static void main(String[] args) {
            int [] numeros = {1, 2, 7, 3, 8, 6, 5};
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese un numero a buscar: ");
            int numBusc = scanner.nextInt();
            int indNum = -1;
            for (int indice = 0;indice <= numeros.length - 1; indice++) {
                if (numeros[indice] == numBusc){
                    indNum = indice;
                    break;
                }
            }
            if (indNum >= 0){
                System.out.println("El numero " + numBusc + " aparece en el indice: " + indNum);
            }else {
                    System.out.println("El numero " + numBusc + " no se encuentra en el array");
            }
            scanner.close();    
    }
}


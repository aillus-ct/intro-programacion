import java.util.Scanner;

public class Examples {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numeros[] = new int[2];
        int i = 0;

        try {
            while (true) {
                System.out.println("Ingrese un numero: ");
                int numero = s.nextInt();
                s.nextLine();
                numeros[i] = numero;
                i++;
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Limite alcanzado");
        }

        System.out.println("Los numeros igresados son:");
        for (int n : numeros) {
            System.err.print(n + ",");
        }
        System.out.println();

    }
}

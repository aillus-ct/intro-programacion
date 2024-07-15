import java.util.Scanner;

public class Bucles {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        //int c = 2;

        System.out.println("Ingrese limite:");
        int limite = s.nextInt();

        /* 
        while (c <= limite) {

            System.out.println(c);
            c = c  + 2;

        }
        */

        
        for( int c = 2;  c < limite;  c += 2){
            System.out.println(c);
        }

        
        
        System.out.println("fin");
        s.close();

    }
}

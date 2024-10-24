import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int z = scanner.nextInt();
        
        if(z == 0){
            System.out.println("z es 0");
        } else if (z % 2 == 0) {
            System.out.println("z es par");
        } else {
            System.out.println("z es impar");
        }







        System.exit(0);









        /**
         * Operadores Aritméticos:
         */

        int n = 10;
        int m = 3;
        int suma = n + m;       // suma = 13
        int resta = n - m;      // resta = 7
        int multiplicacion = n * m;  // multiplicacion = 30
        int division = n / m;   // division = 3
        int modulo = n % m;     // modulo = 1

        System.out.println(suma);
        System.out.println(resta);
        System.out.println(multiplicacion);
        System.out.println(division);
        System.out.println(modulo);

        /**
         * Cuanto vale (2 + 2) * 2  ??? Precedencia??
         */
            
        /**
         * Operadores de Asignación:
         */

        
        int x = 5;
        x += 3;   // equivalente a x = x + 3;   ahora x es 8
        System.out.println(x);
        
        x -= 2;   // equivalente a x = x - 2;   ahora x es 6
        System.out.println(x);
        
        x *= 4;   // equivalente a x = x * 4;   ahora x es 24
        System.out.println(x);
        
        x /= 3;   // equivalente a x = x / 3;   ahora x es 8
        System.out.println(x);
        
        x %= 5;   // equivalente a x = x % 5;   ahora x es 3
        System.out.println(x);


        /** 
         * Operadores de Incremento y Decremento:
         */


        int y = 10;
        y++;   // equivalente a: y = y + 1;   ahora y es 11
        y--;   // equivalente a: y = y - 1;   ahora y es 10 otra vez
          
        /**
         * Operadores de Comparacion
         */

        int num1 = 10;
        int num2 = 5;

        boolean igual = (num1 == num2);     // igual es false
        boolean distinto = (num1 != num2);   // distinto es true
        boolean mayorQue = (num1 > num2);   // mayorQue es true
        boolean menorQue = (num1 < num2);   // menorQue es false
        boolean mayorIgual = (num1 >= num2);   // mayorIgual es true
        boolean menorIgual = (num1 <= num2);    // menorIgual es false

        System.out.println("igual:" + igual);
        System.out.println("distinto:" + distinto);
        System.out.println("mayorQue:" + mayorQue);
        System.out.println("menorQue:" + menorQue);
        System.out.println("mayorIgual:" + mayorIgual);
        System.out.println("menorIgual:" + menorIgual);

        /***
         * Operadores Lógicos:
         */ 

        boolean condicion1 = true;
        boolean condicion2 = false;
        boolean resultadoAnd = condicion1 && condicion2;   // resultadoAnd es false
        boolean resultadoOr = condicion1 || condicion2;   // resultadoOr es true
    
        boolean resultadoNot = !condicion1;   // resultadoNot es false

        System.out.println("resultadoAnd: " + resultadoAnd);
        System.out.println("resultadoOr: " + resultadoOr);
        System.out.println("resultadoNot: " + resultadoNot);

        /**  
         * Si a = true, b = false y c = false cuanto es (a && b) || !c  ???
         * 
         * (true && false) || !false
         * false || !false
         * false || true
         * true
         * 
         */

        
        boolean a = true;
        boolean b = false;
        boolean c = true;

        boolean resultado;

        resultado = a || b && !c;
        System.out.println("a || b && !c :" + resultado);
        // true || false && !true
        // true || false && false
        // true || false
        // true

        resultado = a || (b && !c);
        System.out.println("a || (b && !c) :" + resultado);

        resultado = (a || b) && !c;
        System.out.println("(a || b) && !c :" + resultado);
        // (true || false) && !true
        // (true || false) && false
        // true && false
        // false

        System.out.println("Verdadero: " + 1);

    }
}



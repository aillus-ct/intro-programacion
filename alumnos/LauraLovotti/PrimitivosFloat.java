public class PrimitivosFloat{

    public static void main(String[]args) {
        System.out.println();
        System.out.println();

        float numeroFloat = 0.000000015f;
        System.out.println("numero float: " + numeroFloat);

        System.out.println("tipo float corresponde en bytes a: " + Float.BYTES);
        System.out.println("tipo float corresponde en bits a: " + Float.SIZE);
        System.out.println("Valor maximo de un float: " + Float.MAX_VALUE);
        System.out.println("Valor minimo de un float: " + Float.MIN_VALUE);

        double realDouble = 3.4028235E39;
        System.out.println("double: " + realDouble);
        System.out.println("tipo double corresponde en bytes a: " + Double.BYTES);
        System.out.println("tipo double corresponde en bits a: " + Double.SIZE);
        System.out.println("Valor maximo de un double: " + Double.MAX_VALUE);
        System.out.println("Valor minimo de un double: " + Double.MIN_VALUE);

        float varFlotante = 3.1416f;
        System.out.println("var Flotante: " + varFlotante);
    }
}

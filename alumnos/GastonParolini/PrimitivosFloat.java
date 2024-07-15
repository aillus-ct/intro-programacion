public class PrimitivosFloat {
    public static void main(String[] args) {
        System.out.println();
        System.out.println();
    
        float numeroFloat = 0.000000258f;
        System.out.println("Numero byte: " + numeroFloat);
    
        System.out.println("Tipo float corresponde en byte a:" + Float.BYTES);
        System.out.println("Valor Maximo de un float: " + Float.MAX_VALUE);
        System.out.println("Valor Minimo de un float: " + Float.MIN_VALUE);

        double numeroDouble = 10.5;
        System.out.println("Numero double: " + numeroDouble);
    
        System.out.println("Tipo double corresponde en byte a:" + Double.BYTES);
        System.out.println("Valor Maximo de un double: " + Double.MAX_VALUE);
        System.out.println("Valor Minimo de un double: " + Double.MIN_VALUE);
}
}

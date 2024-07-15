public class PrimitivoFloat {
    

    public static void main(String[] args) {
        System.out.println();
        System.out.println();

        // float
        float numeroFloat=127;
        System.out.println("numero float: " + numeroFloat);
    
        System.out.println("tipo float corresponde en byte a : " + numeroFloat);
        System.out.println("Valor maximo de un float: " + Float.MAX_VALUE);
        System.out.println("Valor minimo de un float: " + Float.MIN_VALUE);

        
        // double
        double numeroDouble = 3.4028235E39;
        System.out.println("realDouble = " + numeroDouble);

        System.out.println("tipo double corresponde en bytes a = " + Double.BYTES);
        System.out.println("tipo double corresponde en bits a = " + Double.SIZE);
        System.out.println("Valor maximo para double = " + Double.MAX_VALUE);
        System.out.println("Valor minimo para double = " + Double.MIN_VALUE);
        
}
}

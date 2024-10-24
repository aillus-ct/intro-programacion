public class PrimitivosFloat {
    public static void main(String[] args) {
        
        float numeroFloat = 0.0000000015f;
        System.out.println("numeroFloat:" + numeroFloat);

        System.out.println("Tipo float corresponde en byte a:" + Float.BYTES);
        System.out.println("float corresponde en bits a = " + Float.SIZE);
        System.out.println("Valor Maximo de un float:" + Float.MAX_VALUE);
        System.out.println("Valor Minimo de un float:" + Float.MIN_VALUE);

        double realDouble = 3.4028235E39;
        System.out.println("realDouble = " + realDouble);
        System.out.println("double corresponde en bytes a = " + Double.BYTES);
        System.out.println("double corresponde en bits a = " + Double.SIZE);
        System.out.println("máximo valor para double = " + Double.MAX_VALUE);
        System.out.println("mínimo valor para double = " + Double.MIN_VALUE);

        float varFlotante = 3.1416f;
        System.out.println("varFlotante = " + varFlotante);
    }

}

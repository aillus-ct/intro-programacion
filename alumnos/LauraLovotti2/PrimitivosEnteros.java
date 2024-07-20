public class PrimitivosEnteros {
    
    public static void main(String[] args) {
        System.out.println();
        System.out.println();

        byte numeroByte = 127;
        System.out.println("numero byte: " + numeroByte);

        System.out.println("tipo byte corresponde en byte a: " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bits a: " + Byte.SIZE);
        System.out.println("Valor maximo de un byte: " + Byte.MAX_VALUE);
        System.out.println("Valor minimo de un byte: " + Byte.MIN_VALUE);
        

        short numeroShort = 32767;
        System.out.println("numero short: " + numeroShort);
        
        System.out.println("tipo short corresponde en byte a: " + Short.BYTES);
        System.out.println("tipo short corresponde en bits a: " + Short.SIZE);
        System.out.println("Valor maximo de un short: " + Short.MAX_VALUE);
        System.out.println("Valor minimo de un short: " + Short.MIN_VALUE);
        
        int numeroInt = 2147483647;
        System.out.println("numero Int: " + numeroInt);

        System.out.println("tipo int corresponde en bytes a: " + Integer.BYTES);
        System.out.println("tipo int corresponde en bits a: " + Integer.SIZE);
        System.out.println("Valor maximo de un int: " + Integer.MAX_VALUE);
        System.out.println("Valor minimo de un int: " + Integer.MIN_VALUE);

        long numeroLong = 9223372036854775807L;
        System.out.println("numero Long: " + numeroLong);

        System.out.println("tipo Long corresponde en bytes a: " + Long.BYTES);
        System.out.println("tipo Long corresponde en bits a: " + Long.SIZE);
        System.out.println("Valor maximo de un long: " + Long.MAX_VALUE);
        System.out.println("Valor minimo de un long: " + Long.MIN_VALUE);

        var numeroVar = 9223372036854775808f;
        

      }
}
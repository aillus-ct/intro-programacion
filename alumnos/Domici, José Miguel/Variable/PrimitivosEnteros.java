public class PrimitivosEnteros {
    public static void main(String[] args) {
        byte numeroByte = 117;
        System.out.println("NumeroByte: " + numeroByte);

        System.out.println("Tipo byte corresponde en byte a:" + Byte.BYTES);
        System.out.println("Valor maximo de un byte:" + Byte.MAX_VALUE);
        System.out.println("Valor minimo de un byte:" + Byte.MIN_VALUE);

        short numeroShort = 32767;
        System.out.println("NumeroShort:" + numeroShort);

        System.out.println("Tipo short corresponde en byte a:" + Short.BYTES);
        System.out.println("Valor maximo de un short:" + Short.MAX_VALUE);
        System.out.println("Valor minimo de un short" + Short.MIN_VALUE);

        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);

        System.out.println("tipo int corresponde en bytes a " + Integer.BYTES);
        System.out.println("tipo int corresponde en bits a " + Integer.SIZE);
        System.out.println("valor máximo de un int: " + Integer.MAX_VALUE);
        System.out.println("valor mínimo de un int: " + Integer.MIN_VALUE);

        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);

        System.out.println("tipo long corresponde en bytes a " + Long.BYTES);
        System.out.println("tipo long corresponde en bits a " + Long.SIZE);
        System.out.println("valor máximo de un long: " + Long.MAX_VALUE);
        System.out.println("valor mínimo de un long: " + Long.MIN_VALUE);
    }

}

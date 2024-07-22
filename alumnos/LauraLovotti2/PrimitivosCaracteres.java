public class PrimitivosCaracteres {

    public static void main(String[] args) {
        
        char caracter = '\u0040';
        char decimal = 64;
        System.out.println("Caracter: " + caracter);
        System.out.println("Decimal: " + decimal);
        System.out.println("Decimal = caracter: " + (decimal == caracter));

        char simbolo = '@';
        System.out.println("simbolo: " + simbolo);
        System.out.println("simbolo = caracter: " + (simbolo == caracter));

        char espacio = '\u0020';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';

        System.out.println("char corresponde en bytes: " + System.lineSeparator() + 
        Character.BYTES);
        System.out.println("Char corresponde en bits a: " + Character.SIZE);
        System.out.println("Valor maximo de un char: " + Character.MAX_VALUE);
        System.out.println("Valor minimo de un char: " + Character.MIN_VALUE);
    
    }
}

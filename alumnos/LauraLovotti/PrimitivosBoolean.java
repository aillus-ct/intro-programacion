public class PrimitivosBoolean {

    public static void main(String[] args){

        boolean datoLogico = true;
        System.out.println("dato logico: " + datoLogico);

        double d = 98765.43e-3; //98.76543
        System.out.println("d: " + d);

        float f = 1.2345e2f; //123.45
        System.out.println("f: " + f);

        datoLogico = d < f;
        System.out.println("dato logico: " + datoLogico);

        boolean esIgual = (3 - 2 == 1);
        System.out.println("es igual: " + esIgual);
    }
}
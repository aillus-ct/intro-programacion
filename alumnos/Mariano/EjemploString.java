public class EjemploString {
    public static void main(String[] args) {
        
        String curso = "Programacion java";
        String curso2 = new String("programacion java");

        boolean esIgual = curso == curso2;

        System.out.println(esIgual);

        System.out.println(curso.equals(curso2));

        System.out.println("Length"+ curso.length());
        System.out.println( curso.toLowerCase());
        System.out.println(curso.toUpperCase());

        String nombre = " Mariano";
        
        System.out.println(nombre.equals(" Mariano"));
}   
}
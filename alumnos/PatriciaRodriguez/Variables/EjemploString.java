public class EjemploString {

    public static void main(String[] args) {
        
        String curso = "Programacion Java";
        String curso2 = new String("Programacion Java");

        boolean esIgual = curso == curso2;

        System.out.println(esIgual);

        System.out.println(curso.equals(curso2));

        System.out.println("Length: " + curso.length());
        System.out.println(curso.toLowerCase());
        System.out.println(curso.toUpperCase());

        String nombre = "Patricia";

        System.out.println(nombre.equals("Patricia"));
        System.out.println(nombre.equals("patricia"));
        System.out.println(nombre.equalsIgnoreCase("patricia"));
        System.out.println(nombre.compareTo("Patricia"));
        System.out.println(nombre.compareTo("Gabriel"));

        
    }
    
}

public class EjmplosString {
    public static void main(String[] args) {
        String curso = "Programacion Java";
        String curso2 = new String("Programacion Java");

        boolean esIgual = curso == curso2;

        System.out.println(esIgual);

        System.out.println(curso.equals(curso2));

        System.out.println("Length: " + curso.length());
        System.out.println(curso.toLowerCase());
        System.out.println(curso.toUpperCase());

        String nombre = "Gastón";

        System.out.println(nombre.equals("Gastón"));
        System.out.println(nombre.equals("gastón"));
        System.out.println(nombre.equalsIgnoreCase ("gastón"));
        System.out.println(nombre.compareTo("Gastón"));
        System.out.println(nombre.compareTo("Guillermo"));



    }
}

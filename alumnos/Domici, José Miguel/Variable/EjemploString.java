public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programación en Java";
        String curso2 = new String("Programacion Java");

        System.out.println("esIgual");

        System.out.println(curso.equals(curso2));

        System.out.println("Leangth" + curso.length());
        System.out.println("tolowearcase" + curso.toLowerCase());
        System.out.println(curso.toUpperCase());

        String nombre = "José Miguel";

        System.out.println(nombre.equals("José Miguel"));
        System.out.println(nombre.equals("josé miguel"));
        System.out.println(nombre.equalsIgnoreCase("josé miguel"));
        System.out.println(nombre.compareTo("José Miguel"));
        System.out.println(nombre.compareTo("Marta"));
        }
}

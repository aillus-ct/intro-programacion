public class EjemploStringMetodos {

    public static void main(String[]args) {
        String nombre = "Laura";

        System.out.println("cantidad de letras de nombre: " + nombre.length());
        System.out.println("nombre a mayusculas: " + nombre.toUpperCase());
        System.out.println("nombre a minusculas: " + nombre.toLowerCase());
        System.out.println("nombre es igual a Laura: " + nombre.equals("Laura"));
        System.out.println("nombre es igual a laura: " + nombre.equals("laura"));
        System.out.println("nombre es igual a laura ignorando mayusculas: " + 
        nombre.equalsIgnoreCase("laura"));
        System.out.println("nombre comparado a Laura: " + nombre.compareTo("Laura"));
        System.out.println("nombre comparado a Aaron: " + nombre.compareTo("Aaron"));

        System.out.println("nombre.charAt(0): " + nombre.charAt(0));
        System.out.println("nombre.charAt(1): " + nombre.charAt(1));
        System.out.println("nombre.charAt(nombre.length() - 1: " + 
        nombre.charAt(nombre.length() - 1));

        System.out.println("nombre.substring(1): " + nombre.substring(1));
        System.out.println("nombre.substring(1, 4): " + nombre.substring(1, 4));
        System.out.println("nombre.substring(nombre.length() - 2): " + 
        nombre.substring(nombre.length()-2));

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas: " + trabalenguas.replace("a", "."));
        System.out.println("trabalenguas: " + trabalenguas);
        System.out.println("trabalenguas.indexOf('a'): " + trabalenguas.lastIndexOf('a'));
        System.out.println("trabalenguas.indexOf('t'): " + trabalenguas.indexOf("lenguas"));
        System.out.println("trabalenguas.contains('t'): " + trabalenguas.contains("lenguas"));
        System.out.println("trabalenguas.startsWith(\"tr\":" + trabalenguas.startsWith("tr"));
        System.out.println("trabalenguas.endsWith(\"s\"): " + trabalenguas.endsWith("s"));
        System.out.println("trabalenguas: ");
        System.out.println("trabalenguas ".trim());     
    }
}
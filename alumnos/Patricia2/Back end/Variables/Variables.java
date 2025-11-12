public class Variables {
    public static void main(String[] args) {
        System.out.println();

        int edad = 50;
        System.out.println(edad);

        boolean estaEnfermo;

        boolean ingresoEstaEnfermo = true;
        
        estaEnfermo = ingresoEstaEnfermo;

        System.out.println(estaEnfermo);

        String nombre = "Juan";
        System.out.println(nombre);

        String apellido = "Perez";

        String nombreCompleto = nombre + " " + apellido;
        System.out.println(nombreCompleto);

        double precio1 = 19.99;
        double precio2 = 6.00;
        double total = precio1 + precio2;

        double m = precio1 * precio2;

        System.out.println(m);
        System.out.println(total);


    }
}
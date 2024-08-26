import java.util.Scanner;

public class PersonasDosEjemplo {
    
    public PersonasDosEjemplo(String nombre, int edad) {
        
    }

    public static void main(String[] args) {
        //bucle for para ingresar varias personas
        Scanner entrada = new Scanner(System.in);
        PersonasDosEjemplo[] personas = new PersonasDosEjemplo[30];
        int contador = 0;
        
        while (contador < 30) {
            System.out.println("¿Quiere ingresar los datos de una persona?");
            String respuesta = entrada.nextLine();

            if (respuesta.equalsIgnoreCase("si")){
                System.out.println("Ingrese el nombre ");
                String nombre = entrada.nextLine();
                System.out.println("Ingrese la edad ");
                int edad = entrada.nextInt();
                entrada.nextLine();
                personas[contador] = new PersonasDosEjemplo(nombre, edad);
                contador++;
            } else {
                break;
            }
        }
        if (contador == 0){
            System.out.println("No se ingresaron personas");
            System.exit(contador);
        } 
        // imprimir personas ingresadas
        int suma = 0;
        String nombrePersonaMayorEdad = null;
        int edadPersonaMayorEdad = 0;
        String nombrePersonaMenorEdad = null;
        int edadPersonaMenorEdad = 0;
        for (int i = 0; i < contador; i++) {
            personas[i].imprimeNombreEdad();
            suma += personas[i].getEdad();
            if (personas[i].getEdad() > edadPersonaMayorEdad) {
                edadPersonaMayorEdad = personas[i].getEdad();
                nombrePersonaMayorEdad = personas[i].getNombre();
            } 
            if (personas[i].getEdad() < edadPersonaMenorEdad || edadPersonaMenorEdad == 0 ) {
                edadPersonaMenorEdad = personas[i].getEdad();
                nombrePersonaMenorEdad = personas[i].getNombre();
            } 
        }
        System.out.println("El promedio de edades es: " + (double) suma / contador);    
        System.out.println("La persona de mayor edad es: " + nombrePersonaMayorEdad + " con " + edadPersonaMayorEdad + " años.");
        System.out.println("La persona de menor edad es: " + nombrePersonaMenorEdad + " con " + edadPersonaMenorEdad + " años.");
        
        entrada.close();


        /*Object edades;
        //imprimir promedio
        double promedio = calcularPromedio(edades);
        System.out.println("El promedio de edades es: " + promedio);*/
        
    }

    private String getNombre() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNombre'");
    }

    private int getEdad() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEdad'");
    }

    private void imprimeNombreEdad() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'imprimeNombreEdad'");
    } 
}
// hacer una funcion que calcula el promedio, persona mayor y persona menor

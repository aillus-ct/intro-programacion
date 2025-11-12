

public class PrincipalPromedio {
    public static void main(String[] args) {
        int[] numeros = {5, 10, 15, 20, 25};

        Promedio promedio = new Promedio();
        
        int resultado = promedio.calcularPromedio(numeros);
        System.out.println("El promedio es: " + resultado);
    }
}

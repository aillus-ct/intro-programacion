public class Factorial {
    public int numero;

    // Constructor 
    public Factorial(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
    // Método para calcular el factorial 
    public int calcularFactorial() {
        int resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }
}

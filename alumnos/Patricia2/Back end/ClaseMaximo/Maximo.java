public class Maximo {
    public int numero1;
    public int numero2;
    public int numero3;

    // Constructor 
    public Maximo(int numero1, int numero2, int numero3) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero3 = numero3;
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public int getNumero3() {
        return numero3;
    }
    // Método para calcular el máximo
    public int calcularMaximo() {
        int maximo = numero1;
        if (numero2 > maximo) {
            maximo = numero2;
        }
        if (numero3 > maximo) {
            maximo = numero3;
        }
        return maximo;
    }
}

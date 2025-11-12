public class EsPar {
    public int numero;

    // Constructor que inicializa el número
    public EsPar(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    // Método para verificar si el número es par
    public boolean esPar() {
        return numero % 2 == 0;
    }
}

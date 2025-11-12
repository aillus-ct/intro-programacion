public class Suma {
    public int numero1;
    public int numero2;

    // Constructor que inicializa los números a sumar
    public Suma(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }


    // Método
    public int sumar() {
        return numero1 + numero2;
    }

}

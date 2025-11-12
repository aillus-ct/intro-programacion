public class Circulo {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2); // el math.pow... es el radio al cuadrado
    }

    public double calcularCircunferencia() {
        return 2 * Math.PI * radio;
    }

    public String mostrarInformacion() {
        return "El Radio es de: " + radio + ", el Área es de: " + calcularArea() + " y la Circunferencia es de: " + calcularCircunferencia();
    }
}

public class Circulo {
    // Declaro variables
    private double radio;

    //constructor
    public Circulo(double radio){
        this.radio = radio;
    }

    // set y get
    public void setRadio(double radio) {
        this.radio = radio;
        }
    public double getRadio() {
        return this.radio;
        }

    // metodo calcular area y circunferencia
    public double calcularArea(){
        return Math.PI * radio * radio;
    }
    public double calcularCircunferencia(){
        return 2 * Math.PI * radio;
    }

    // Mostrar info
    public void mostrarInformacion(){
        System.out.println("Datos del circulo: ");
        System.out.println("El radio del circulo es: " + this.radio + "\nEl area del circulo es " + calcularArea() + "\nLa circunferencia del circulo es " + calcularCircunferencia());

    }
}



public class Circulo {
    private double radio;

    public Circulo (double radio) {
        this.radio = radio;
    }
    
    public void setRadio(double radio){
        this.radio = radio;
    }

    public double getRadio(){
        return this.radio;
    }

    public double calcularArea(){
        double area = 0;
        area = Math.PI * this.radio * this.radio;
        return area;
    }
    
    public double calcularCircunferencia(){
        double circunferencia = Math.PI * 2 * this.radio;
        return circunferencia;
    }

    public void mostrarInformacion() {
         System.out.println ("El area del circulo de radio: " + this.radio + " es: "
          +  calcularArea()
        + " y la circunferencia es: " + calcularCircunferencia());
    }
}
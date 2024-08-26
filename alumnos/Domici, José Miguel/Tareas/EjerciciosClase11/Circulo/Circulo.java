public class Circulo {
    
    private double radio;

    public Circulo (double radio){
        this.radio = radio;
                 
    }

    public void setRadio(double radio){
        this.radio = radio;
    } 

    public double getRadio(){
        return this.radio;
    }

    public double calcularArea(){
        return Math.PI * this.radio * this.radio;
        
    }

    public double calcularCircunsferencia(){
       return 2 * Math.PI * this.radio;
       
    }

    public void mostrarInformacion(){
        System.out.println("El radio del circulo es: " + this.radio + "\nEl area del circulo es: " + calcularArea() + "\nLa circunferencia es: " + calcularCircunsferencia());
    }

}
public class Cilindro extends Circulo {
    
    private double altura;

    public Cilindro(double radio, double altura){
        super(radio);
        this.altura = altura;
    }

    public double calcularVolumen(){
        return Math.PI * Math.pow(getRadio(), 2) * this.altura;
    }

    public double calcularAreaSuperficie(){
        return 2 * Math.PI * getRadio() * getRadio() + this.altura;
    }
}

public class Cilindro extends Circulo{
     private double altura;

     public Cilindro(double radio, double altura){
        super(radio);
        this.altura = altura;
     }

     public void setAltura(double altura){
        this.altura = altura;
     }

     public double getAltura(){
        return this.altura;
     }
     public double calcularVolumen(){
        double volumen = Math.PI * this.radio * this.radio * this.altura;
        return volumen; 
     }
     
     public double calcularAreaCilindro(){
        double areaCilindro = 2 * Math.PI * this.radio * this.altura + 2 * Math.PI * this.radio * this.radio;
        return areaCilindro;
     }

     public void mostrarInformacion(){
        System.out.println("El area del Circulo q es base del cilindro es: " +  calcularArea() + 
        " el volumen del Cilindro es: " + calcularVolumen() + " el area del cilindro es: " + calcularAreaCilindro());
     }
}
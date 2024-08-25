public class Perro extends Mascota {

    public Perro(String nombre, int edad, String raza, String color){
        super(nombre, edad, raza, color);
    }

    public void corre(){
        System.out.println("Corriendo");
        this.energia -= 2; // this.energia = this.energia - 2 
    }

    public void saludar(){
        System.out.println("guau");
    }

}

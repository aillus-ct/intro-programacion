public class Pez extends Mascota{

    public Pez(String nombre, int edad, String raza, String color){
        super(nombre, edad, raza, color);
    }

    public void nadar(){
        System.out.println("Nadar");
    }


    public void saludar(){
        System.out.println("gluglu");
    }

}

public class Ave extends Mascota{
    
    Ave(String nombre, int edad, String raza, String color){
        super(nombre, edad, raza, color);
    }
    
    public void volar(){
        System.out.println( "Soy" + this.nombre + " y estoy volando");
    }

    public void saludar(){
        System.out.println("pio");
    }

}

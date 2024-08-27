public class Ave extends Mascota{
    
    Ave(String nombre, int edad, String raza, String color){
        super(nombre, edad, raza, color);
    }
    
    public void volar(){
        System.out.println( "Soy" + this.nombre + " y estoy volando");
    }

    //public void saludar(){
    //    System.out.println("pio");
    //}

    public void moverse(){
        if(this.energia > 0){
            this.energia -= 2;
        } else {
            System.out.println("Necesito descansar para poder moverme");
        }
    }
    
    public void comer() {
        this.tieneHambre = false;
        this.energia++;
    }

    public void descansar(){
        if(this.energia < 10){
            this.energia++;
        } else {
            System.out.println("No necesito descansar");
        }
    }

}

public class Perro extends Mascota {

    public Perro(String nombre, int edad, String raza, String color){
        super(nombre, edad, raza, color);
    }

    public void corre(){
        System.out.println("Corriendo");
        this.energia -= 2;
    }

    public void saludar(){
        System.out.println("guau");
    }

    public void moverse(){
        if(this.energia > 0){
            this.energia--;
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

public class Mascota {
    String nombre;
    int edad;
    String raza;
    String color;
    Boolean tieneHambre;
    int energia;
    
    public Mascota(String nombre, int edad, String raza, String color){
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.color = color;
        this.tieneHambre = false;
        this.energia = 10;
    }
    
    public void comer(){
        this.tieneHambre = false;
    }

    public void moverse(){
        if(this.energia > 0){
            this.energia--;
        } else {
            System.out.println("Necesito descansar para poder moverme");
        }
    }

    public void descansar(){
        if(this.energia < 10){
            this.energia++;
        } else {
            System.out.println("No necesito descansar");
        }
    }

}



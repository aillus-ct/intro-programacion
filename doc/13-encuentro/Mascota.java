import javafx.stage.StageStyle;

abstract public class Mascota {
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

    public void saludar(){
        System.out.println("Soy un mascota");
    }

    public void mostrarEnergia(){
        System.out.print("Mi nombre es: " + this.nombre + " ");
        System.out.println("Mi energia es: " + this.energia);
    }
    
    abstract public void comer();
    abstract public void moverse();
    abstract public void descansar();

}

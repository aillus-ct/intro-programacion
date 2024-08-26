public class Barco extends Vehiculo {
 
    public Barco(String marca, String modelo, int año) {
        super(marca, modelo, año);
    }

   public void mover(){
    System.out.println("El barco se mueve en el agua");
   }
}
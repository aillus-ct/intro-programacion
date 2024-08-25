public class Bicicleta extends Vehiculo {
    
    public Bicicleta(String marca, String modelo, int año) {
        super(marca, modelo, año);
    }

   public void mover(){
    System.out.println("La bicicleta se mueve en la vía");
   }
}
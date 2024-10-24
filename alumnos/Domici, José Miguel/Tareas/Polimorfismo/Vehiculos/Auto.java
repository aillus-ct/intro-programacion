public class Auto extends Vehiculo {
    
    public Auto(String marca, String modelo, int año) {
        super(marca, modelo, año);
    }

   public void mover(){
    System.out.println("El auto se mueve en carretera");
   }
}
public class UsarMascotas {
    public static void main(String[] args) {
        Perro perro = new Perro("Boby",10, "caniche", "marron");
        Ave ave = new Ave("Tweety",5, "canario", "amarillo");
        perro.saludar();
        ave.saludar();
        perro.descansar();
        perro.corre();
    }
}

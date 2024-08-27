public class UsarMascotas {
    public static void main(String[] args) {
        
        Perro perro = new Perro("Boby",10, "caniche", "marron");
        Ave ave = new Ave("Tweety",5, "canario", "amarillo");
        Pez pez = new Pez("Nemo", 10, "mojarrita", "anaranjado");

        perro.saludar();
        ave.saludar();
        perro.descansar();
        perro.corre();
        pez.comer();

        perro.mostrarEnergia();
        ave.mostrarEnergia();
        pez.mostrarEnergia();

        Entrenador entrenador = new Entrenador();
        entrenador.entrenar(ave);
        entrenador.entrenar(perro);
        entrenador.entrenar(pez);

        perro.mostrarEnergia();
        ave.mostrarEnergia();
        pez.mostrarEnergia();

        Mascota[] mascotas = new Mascota[3];
        mascotas[0] = new Perro("Firulai", 1, "galgo", "marron");
        mascotas[1] = new Pez("Nemo", 4, "payaso", "naranja");
        mascotas[2] = new Ave("Tweety", 10, "canario", "amarillo");

        for (Mascota mascota : mascotas) {
            mascota.comer();
            mascota.mostrarEnergia();
        }



    }
}

package HerenciaPersona;

public class EjercicioPersonaHerencia {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 35, 528230, "secretario");
        Empleado empleado1 = new Empleado("Maria", 52, 985471.35, "abogada");
        Empleado empleado2 = new Empleado("Pabro", 43, 753650, "mecanico");
        
        Estudiante estudiante = new Estudiante("Diana", 10, "quinto grado", 8.93);
        Estudiante estudiante1 = new Estudiante("Daniel", 20, "la universidad", 7.59);
        Estudiante estudiante2 = new Estudiante("Carla", 35, "un porgrado", 6.58);

        PersonaDos[] personas = {empleado, empleado1, empleado2, estudiante, estudiante1, estudiante2};
        for (PersonaDos persona : personas) {
            persona.mostrarInformacion();
        }
    }
}

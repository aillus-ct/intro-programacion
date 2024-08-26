public class HumanoEjemplo {
    public static void main(String[] args) {
        Humano persona = new Humano();
        /*persona.nombre = "Juan";
        persona.genero = "masculino";
        persona.edad = 25;
        persona.altura = 1.70;
        persona.peso = 70.0;

        System.out.println("El nombre es " + persona.nombre);
        System.out.println("El genero es " + persona.genero);
        System.out.println("La edad es " + persona.edad + " años");
        System.out.println("La altura es de " + persona.altura + " metros");
        System.out.println("El peso es de " + persona.peso + " kilos");

        persona.nombre = "Clara";
        persona.genero = "femenino";
        persona.edad = 30;
        persona.altura = 1.60;
        persona.peso = 60;

        System.out.println("El nombre es " + persona.nombre);
        System.out.println("El genero es " + persona.genero);
        System.out.println("La edad es " + persona.edad + " años");
        System.out.println("La altura es de " + persona.altura + " metros");
        System.out.println("El peso es de " + persona.peso + " kilos"); */

        persona.nombre = "Jane Austen";
        persona.genero = "femenino";
        persona.profesion = "escritora";
        Libro libro = new Libro();
        libro.titulo = "Emma";
        libro.genero = "Novela";
        libro.numeroDePaginas = 560;
        libro.añoDePublicacion = 1815;
        Casa casa = new Casa();
        casa.domilicio = "Chawton, Hampshire";
        casa.habitaciones = 4;

        System.out.println("Su nombre es " + persona.nombre + " de genero " + persona.genero);
        System.out.println("Fue " + persona.profesion);
        System.out.println("Uno de los libros que escribio fue " + libro.titulo);
        System.out.println("El libro pertenece al genero " + libro.genero + " y tiene " + libro.numeroDePaginas + " paginas.");
        System.out.println("Fue publicado en el año " + libro.añoDePublicacion);
        System.out.println("Durante la escritura y publicación del libro vivio en " + casa.domilicio);
        System.out.println("La casa tiene " + casa.habitaciones + " habitaciones.");
    }
}

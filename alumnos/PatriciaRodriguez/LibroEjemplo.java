public class LibroEjemplo {
    public static void main(String[] args) {
        Libro libro = new Libro();
        libro.titulo = "Emma";
        libro.autor = "Jane Austen";
        libro.genero = "Novela";
        libro.añoDePublicacion = 1815;
        libro.numeroDePaginas = 560;
        libro.personajeFemenino = "Emma";
        libro.personajeMasculino = "George Knightly";

        System.out.println("El libro se llama " + libro.titulo);
        System.out.println("La autora del libro es " + libro.autor);
        System.out.println("El libro pertenece al genero " + libro.genero);
        System.out.println("El libro se publico en el año " + libro.añoDePublicacion);
        System.out.println("El libro tiene " + libro.numeroDePaginas + " paginas");
        System.out.println("El personaje principal femenino es " + libro.personajeFemenino);
        System.out.println("El personaje principal masculino es " + libro.personajeMasculino);
    }
}

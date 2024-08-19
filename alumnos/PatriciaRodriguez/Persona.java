public class Persona {
    // Declaramos variables
    private String nombre;
    private int edad;
    private String genero;

    // Declaramos el constructor de la clase
    public Persona (String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    // Declaramos los metodos set y get de cada atributo
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public String getNombre(){
        return this.nombre;
    }
    public int getEdad(){
        return this.edad;
    }
    public String getGenero(){
        return this.genero;
    }

    // Declaramos mayor de edad
    public boolean esMayorDeEdad(){
        if(this.edad >= 18){
            return true;
        } else {
            return false;
        }
    }

    // Declaramos el metodo que pidio Laura
    public String esMayorDeEdadString(){
        if(this.edad >= 18){
            return "Es mayor";
        } else {
            return "Es menor";
        } 
    }

    // Declaramos que imprima la informacion de la persona
    public void mostrarInformacion(){
        System.out.println("El nombre es: " + this.nombre + "\nLa edad es " + this.edad + "\nEl genero es " + this.genero);
    }
    }


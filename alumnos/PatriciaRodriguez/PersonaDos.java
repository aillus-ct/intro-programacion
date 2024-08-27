public class PersonaDos {
    
    // declaro variables
    String nombre;
    int edad;

    // constructor
    public PersonaDos(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    // get y set
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public String getNombre(){
        return this.nombre;
    }
    public int getEdad(){
        return this.edad;
    }
    
    // imprimir nombre y edad
    public void imprimeNombreEdad(){
        System.out.println("La persona se llama " + this.nombre + " y tiene " + this.edad + " años");
    
    /* / para practicar las funciones
    public promedioEdades(){
        public static double calcularPromedio(int edades){
        int suma = 0;
        for (int edad : edades) {
            suma += edad;
            }
            return (double) suma / edades.length;
        }
        */
    }
    
    }
    


    

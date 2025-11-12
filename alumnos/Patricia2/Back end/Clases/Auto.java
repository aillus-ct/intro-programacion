public class Auto {
    
    String marca;
    String modelo;
    String color;
    int anio;

    // Constructor
    public Auto(String marca, String modelo, String color, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.anio = anio;
        
    }


    public void setMarca(String unaMarca){
        marca = unaMarca;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getAnio() {
        return anio;
    }

    // este es el método
    public void mostrarInfo(){
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Color: " + color + ", Año: " + anio);
    }
}

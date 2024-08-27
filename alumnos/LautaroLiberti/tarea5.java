public class tarea5 {
    public static void main(String[] args) {
        
        int [] numeros ={10,30,50,70,90};
        int suma=0;
        for(int numero:numeros){
            suma+=numero;
        }
        double promedio = (double) suma / numeros.length;
        System.out.println("El promedio de los elementos del array es: " + promedio);
    }

}

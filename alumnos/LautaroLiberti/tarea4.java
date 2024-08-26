public class tarea4 {
    public static void main(String[] args) {
        
        int [] numeros = {1,2,3,5,3,5};
        int target = 3;
        int count= 0;
        for(int numero:numeros){
            if(numero==target){
                count++;
            }
        }
        System.out.println("El valor " + target + " aparece " + count + " veces en el array ");
    }

}

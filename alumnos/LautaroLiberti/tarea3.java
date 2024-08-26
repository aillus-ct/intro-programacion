public class tarea3 {
    public static void main(String[] args) {
        int[]numeros={1,2,3,4,5};
        int length = numeros.length;
        for(int i=0; i< length/2;i++){
            int temp=numeros[i];
            numeros[i]=numeros[length-1-i];
            numeros[length-1-i]=temp;
        }
        System.out.println("Array invertido");
        for(int numero:numeros){
            System.out.println(numero+ " ");
        }
    }

}

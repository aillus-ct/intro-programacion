public class tarea2 {
    public static void main(String[] args) {
        int [] numeros={34,67,87,54,32,139};
        int max = numeros[0];
        for(int i=1;i<numeros.length;i++){
            if(numeros[i]>max){
                max = numeros[i];
            }
        }
        System.out.println("El valor máximo del array es " + max);
    }

}

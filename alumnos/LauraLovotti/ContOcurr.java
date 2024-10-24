public class ContOcurr {
    public static void main(String[] args) {
        int [] numeros = {1, 2, 5, 3, 5, 6, 5};
        int numBusc = 5;
        int cantOcurr = 0;
        for (int numero : numeros) {
            if (numero == numBusc){
            cantOcurr++;
            }
        }
        System.out.println("El numero " + numBusc + " aparece " + cantOcurr + " veces");
    }

}
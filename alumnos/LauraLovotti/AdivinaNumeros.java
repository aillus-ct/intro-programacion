import java.util.Scanner;
    public class AdivinaNumeros {
        public static void main(String[] args) {
            Scanner numero = new Scanner(System.in);
               
           int numeroing = 0;
            int numeroadiv = 4524; 
            int contador = 0; 
            
            while (numeroing != numeroadiv && contador < 3) {
                    contador++;
                    System.out.println ("Ingrese un numero entero");           
                    numeroing = numero.nextInt();
               
                    if(numeroing > numeroadiv) {
                    System.out.println("El numero ingresado es mayor. Intente de nuevo");
                    
                    } else if (numeroing < numeroadiv) {
                    System.out.println("El numero ingresado es menor. Intente de nuevo");
                    
                    
                } 
            }
                if (numeroing == numeroadiv) {
                System.out.println ("Ganaste");
                } else {
                System.out.println("Perdiste. Superaste la cantidad de intentos");
                }
            numero.close();    
        }
    }   
             
    
    
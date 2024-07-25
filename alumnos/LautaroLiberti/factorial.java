import javax.swing.*;
public class factorial {
    public static void main(String[] args) {
        int resultado=1;
        int num=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        for(int i=num;i>0;i--){
            resultado=resultado*i;
        }
        System.out.println("El factorial de " + num + " es " + resultado);
    }

}

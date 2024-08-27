import javax.swing.*;
public class peso {
    public static void main(String[] args) {
        
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su peso en kg: "));
        System.out.println("Ingrese su altura en cm: ");
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su altura en cm: "));
        double imc = peso / (altura * altura);
        System.out.println("Su IMC es: " + imc);

    }

}

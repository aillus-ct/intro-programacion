import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calc {

    static double num1 = 0;
    static double num2 = 0;
    static boolean start = true;
    static double resultado = 0;
    static String operador = "";

    public static void main(String[] args) {

        JFrame frame = new JFrame("Calc");
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JTextField pantalla = new JTextField();
        pantalla.setEditable(false);
        frame.add(pantalla, BorderLayout.NORTH);

        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(4, 4, 10, 10));

        String[] botones = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        for (String texto : botones) {
            JButton boton = new JButton(texto);
            boton.setFont(new Font("Arial", 0, 20));
            boton.addActionListener(new ActionListener() {   
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Boton fue clicado!");
                    System.out.println(e.getActionCommand());
                    String comando = e.getActionCommand();
                    switch (comando) {
                        
                        case "C":
                            start = true;
                            resultado = 0;
                            num1 = 0;
                            num2 = 0;
                            comando = "";
                            pantalla.setText("");
                            break;
            
                        case "+": 
                        case "-": 
                        case "*": 
                        case "/":
                            operador = comando;
                            pantalla.setText(pantalla.getText() + comando);
                            break;
            
                        case "=": 
                            System.out.println(num1+","+num2+","+operador);
                            switch (operador) {
                                case "+": resultado = num1 + num2;
                                    break;
                                case "-": resultado = num1 - num2;
                                    break;
                                case "*": resultado = num1 * num2;
                                    break;
                                case "/": resultado = num1 / num2;
                            }
                            pantalla.setText(String.valueOf(resultado));
                            num1 = resultado;
                            break;
                
                        default:
                            if(start){
                                num1 = Double.valueOf(comando);
                                start = false;
                            } else {
                                num2 = Double.valueOf(comando);
                            }
                            pantalla.setText(pantalla.getText() + comando);
                    }
                }
            });
            panelBotones.add(boton);
        }

        frame.add(panelBotones, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
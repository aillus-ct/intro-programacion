import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraSimple extends JFrame implements ActionListener {
    private JTextField pantalla;
    private double num1, num2, resultado;
    private String operador;
    private Boolean start;

    public CalculadoraSimple() {

        setTitle("Calculadora");
        setSize(400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        start = true;

        pantalla = new JTextField();
        pantalla.setEditable(false);
        pantalla.setFont(new Font("Arial", Font.BOLD, 30));
        add(pantalla, BorderLayout.NORTH);

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
            boton.setFont(new Font("Arial", Font.BOLD, 20));
            boton.addActionListener(this);
            panelBotones.add(boton);
        }

        add(panelBotones, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
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

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CalculadoraSimple().setVisible(true));
    }
}

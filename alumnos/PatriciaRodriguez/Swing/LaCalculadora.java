package Swing;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;

public class LaCalculadora {

    public static void mostrarTecla(ActionEvent e, JFrame ventana){
        JOptionPane.showMessageDialog(ventana, e.getActionCommand(), "Presionaste la tecla: ",1 );
    }
    public static void mostrarResultado(ActionEvent e, JTextField visor){
        String resultado = visor.getText() + e.getActionCommand();
        visor.setText(resultado);
    }

    public static void main(String[] args) {
        
        JFrame ventana = new JFrame("Mi calculadora");
        ventana.setSize(400, 500); 
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.getContentPane().setBackground(Color.CYAN);

        JPanel panel = new JPanel();
        panel.setSize(350, 350);
        panel.setBackground(Color.pink);
        panel.setLayout(new GridLayout(0, 4, 10, 10));
        

        JTextField visor = new JTextField(20);
        visor.setText(null);
        visor.getText();
        

        JButton boton = new JButton("1");
        //boton.setPreferredSize(new Dimension(80, 40));
        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            mostrarTecla(e, ventana);
            mostrarResultado(e, visor);
            }
        });
        JButton boton2 = new JButton("2");
        boton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarTecla(e, ventana);
                mostrarResultado(e, visor);
            }
        });
        JButton boton3 = new JButton("3");
        boton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarTecla(e, ventana);
            }
        });
        JButton boton4 = new JButton("4");
        boton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarTecla(e, ventana);
            }
        });
        JButton boton5 = new JButton("5");
        boton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarTecla(e, ventana);
            }
        });
        JButton boton6 = new JButton("6");
        boton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarTecla(e, ventana);
            }
        });
        JButton boton7 = new JButton("7");
        boton7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarTecla(e, ventana);
            }
        });
        JButton boton8 = new JButton("8");
        boton8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarTecla(e, ventana);
            }
        });
        JButton boton9 = new JButton("9");
        boton9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarTecla(e, ventana);
            }
        });
        JButton boton0 = new JButton("0");
        boton0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarTecla(e, ventana);
            }
        });
        JButton botonMas = new JButton("+");
        botonMas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarTecla(e, ventana);
                mostrarResultado(e, visor);
            }
        });
        JButton botonMenos = new JButton("-");
        botonMenos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarTecla(e, ventana);
            }
        });
        JButton botonMultiplicacion = new JButton("*");
        botonMultiplicacion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarTecla(e, ventana);
            }
        });
        JButton botonDivision = new JButton("/");
        botonDivision.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarTecla(e, ventana);
            }
        });
        JButton botonIgual = new JButton("=");
        botonIgual.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarTecla(e, ventana);
                mostrarResultado(e, visor);
            }
        });
        
        ventana.setLayout(new FlowLayout(FlowLayout.LEFT, 80, 70));
        panel.add(visor, BorderLayout.NORTH);
        panel.add(boton);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        panel.add(boton6);
        panel.add(boton7);
        panel.add(boton8);
        panel.add(boton9);
        panel.add(boton0);
        panel.add(botonMas);
        panel.add(botonMenos);
        panel.add(botonMultiplicacion);
        panel.add(botonDivision);
        panel.add(botonIgual);

        // operadores
        int numero1 = 0;
        int numero2 = 0;
        int mostrarResultado = 0;
        String operador = "";
                switch (operador) {
                    case "+":
                    mostrarResultado = numero1 + numero2;
                    break;
                    case "-":
                    mostrarResultado = numero1 - numero2;
                    break;
                    case "*":
                    mostrarResultado = numero1 * numero2;
                    break;
                    case "/":
                    if (numero2 != 0) {
                        mostrarResultado = numero1 / numero2;
                    } else {
                        mostrarResultado = 0;
                    }
                    break;
                }
       

        

        


        
        ventana.add(panel);
        
    
       
        ventana.setVisible(true);
        
    };;
}
    
 
            
    

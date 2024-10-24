package Swing;

import javax.swing.*;
import javax.swing.text.MaskFormatter;

import java.awt.*;
import java.text.ParseException;
//import java.text.SimpleDateFormat;
import java.awt.event.*;;

public class FormularioPaneles {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Formulario de Reservación de Eventos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 600);
        frame.setLayout(new BorderLayout());
        

        JPanel panelNorte = new JPanel();
        panelNorte.setBackground(java.awt.Color.YELLOW);
        panelNorte.setPreferredSize(new Dimension(500, 200));
        //panelNorte.setSize(500, 200);
        //panelNorte.setLayout(new GridLayout(2,2,10,10));

        JLabel titulo = new JLabel("Información básica");
        titulo.setForeground(Color.BLACK);
        titulo.setFont(new Font("Arial", Font.BOLD, 25));
        panelNorte.add(titulo);

        JLabel lblNombre = new JLabel("Nombre");
        lblNombre.setBounds(20, 20, 100, 100);
        lblNombre.setFont(new Font("Arial", Font.BOLD, 15));
        JTextField txtNombre = new JTextField(15);
        txtNombre.setBounds(130, 20, 200, 30);

        JLabel lblApellido = new JLabel("Apellido");
        lblApellido.setBounds(50, 60, 100, 30);
        lblApellido.setFont(new Font("Arial", Font.BOLD, 15));
        JTextField txtApellido = new JTextField(15);
        txtApellido.setBounds(130, 60, 200, 90);
        
        JLabel lblCorreo = new JLabel("Correo");
        lblCorreo.setBounds(200, 100, 100, 160);
        lblCorreo.setFont(new Font("Arial", Font.BOLD, 15));
        JTextField txtCorreo = new JTextField(15);
        txtCorreo.setBounds(130, 100, 200, 300);

        JLabel lbltelefono = new JLabel("Telefono");
        lbltelefono.setBounds(200, 100, 100, 80);
        lbltelefono.setFont(new Font("Arial", Font.BOLD, 15));
        JTextField txtTelefono = new JTextField(20);
        txtTelefono.setBounds(200, 100, 100, 90);

        panelNorte.add(titulo);
        panelNorte.add(lblNombre);
        panelNorte.add(txtNombre);
        panelNorte.add(lblApellido);
        panelNorte.add(txtApellido);
        panelNorte.add(lblCorreo);
        panelNorte.add(txtCorreo);
        panelNorte.add(lbltelefono);
        panelNorte.add(txtTelefono);

        JPanel panelCentro = new JPanel();
        panelCentro.setBackground(java.awt.Color.GREEN);
        panelCentro.setPreferredSize(new Dimension(500, 200));
        //panelCentro.setSize(500, 200);
        //panelCentro.setLayout(new FlowLayout());

        JLabel pregunta = new JLabel("Seleccione el tipo de evento:");
        pregunta.setForeground(Color.BLUE);
        pregunta.setFont(new Font("Arial", Font.BOLD, 15));

        String[] tipoEventos = {"Casamiento", "Comunión", "Bautismo", "Egresados", "Cumpleaños"};
        JComboBox<String> comboBox = new JComboBox<>(tipoEventos);
        comboBox.setBackground(Color.WHITE);

        JLabel pregunta2 = new JLabel("Cantidad de invitados");
        pregunta2.setForeground(Color.BLUE);
        pregunta2.setFont(new Font("Arial", Font.BOLD, 15));
        //pregunta2.setBounds(400, 200, 30, 30);

        JTextField txtPregunta2 = new JTextField(10);
        txtPregunta2.setBounds(200, 100, 100, 30);
        txtPregunta2.setBackground(Color.WHITE);

        JLabel fecha = new JLabel("Fecha:");
        fecha.setForeground(Color.BLUE);
        fecha.setFont(new Font("Arial", Font.BOLD, 15));
        //SimpleDateFormat  formatoFecha = new SimpleDateFormat("dd/mm/aaaa");
        MaskFormatter formato = null;
        try {
            formato = new MaskFormatter("##/##/####");
        } catch (ParseException e){
            e.printStackTrace();
        }

        JFormattedTextField campoFecha = new JFormattedTextField(formato);
        campoFecha.setColumns(10);

        JLabel menu = new JLabel("Seleccione un menú:");
        menu.setForeground(Color.BLUE);
        menu.setFont(new Font("Arial", Font.BOLD, 15));

        JRadioButton botonMenu1 = new JRadioButton("Menú 1");
        JRadioButton botonMenu2 = new JRadioButton("Menú 2");

        ButtonGroup grupo1 = new ButtonGroup();
        grupo1.add(botonMenu1);
        grupo1.add(botonMenu2);

        JLabel pregunta3 = new JLabel("¿Cambiaría algo del menú elegido?");
        pregunta3.setForeground(Color.BLUE);
        pregunta3.setFont(new Font("Arial", Font.BOLD, 15));

        JRadioButton botonSi = new JRadioButton("Si");
        JRadioButton botonNo = new JRadioButton("No");
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(botonSi);
        grupo.add(botonNo);

        JLabel pregunta4 = new JLabel("Si eligió 'Si', indique qué cambiaría:");
        pregunta4.setForeground(Color.BLUE);
        pregunta4.setFont(new Font("Arial", Font.BOLD, 15));

        JTextField comentarioSi = new JTextField(30);
        comentarioSi.setBounds(200, 300, 300, 30);

        panelCentro.add(pregunta);
        panelCentro.add(comboBox);
        panelCentro.add(pregunta2);
        panelCentro.add(txtPregunta2);
        panelCentro.add(fecha);
        //panelCentro.add(formatoFecha);
        panelCentro.add(campoFecha);
        panelCentro.add(menu);
        panelCentro.add(botonMenu1);
        panelCentro.add(botonMenu2);
        panelCentro.add(pregunta3);
        panelCentro.add(botonSi);
        panelCentro.add(botonNo);
        panelCentro.add(pregunta4);
        panelCentro.add(comentarioSi);

        JPanel panelSur = new JPanel();
        panelSur.setBackground(java.awt.Color.PINK);
        panelSur.setPreferredSize(new Dimension(500, 200));
       // panelSur.setSize(500, 200);
        //panelSur.setLayout(new FlowLayout());

        JLabel pregunta5 = new JLabel("Escriba un comentario o sugerencia:");
        pregunta5.setForeground(Color.MAGENTA);
        pregunta5.setFont(new Font("Arial", Font.BOLD, 15));

        JTextArea comentarioArea = new JTextArea(5, 20);
        comentarioArea.setLineWrap(true);
        comentarioArea.setWrapStyleWord(true);
        comentarioArea.setFont(new Font("Arial", Font.BOLD, 15));
        comentarioArea.setPreferredSize(new Dimension(200, 100));
        comentarioArea.setPreferredSize(comentarioArea.getPreferredSize());
        
        JScrollPane scrollPane = new JScrollPane(comentarioArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        JButton boton = new JButton("Enviar datos");
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(boton, "Los datos se enviaron correctamente", "¡Inscripción finalizada!", 1);;
                System.out.println("");
                txtNombre.setText("");
                txtApellido.setText("");
                txtCorreo.setText("");
                txtTelefono.setText("");
                txtPregunta2.setText("");
                campoFecha.setText("");
                botonMenu1.setText("");
                botonMenu2.setText("");
                botonSi.setText("");
                botonNo.setText("");
                comentarioSi.setText("");
                comentarioArea.setText("");
            }});


        panelSur.add(pregunta5);
        panelSur.add(comentarioArea);
        panelSur.add(scrollPane);
        panelSur.add(boton);

        
        frame.add(panelNorte, BorderLayout.NORTH);
        frame.add(panelCentro, BorderLayout.CENTER);
        frame.add(panelSur, BorderLayout.SOUTH);
        frame.setVisible(true);

    }
} 
 


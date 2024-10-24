package Swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Formulario {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Inscripción al gimnasio");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel lblNombre = new JLabel("Nombre");
        lblNombre.setBounds(20, 20, 100, 30);
        JTextField txfNombre = new JTextField();
        txfNombre.setBounds(130, 20, 200, 30);
        

        JLabel lblApellido = new JLabel("Apellido");
        lblApellido.setBounds(20, 60, 100, 30);
        JTextField txfApellido = new JTextField();
        txfApellido.setBounds(130, 60, 200, 30);

        JLabel pregunta1 = new JLabel("Selecciona un turno: ");
        pregunta1.setBounds(20, 100, 200, 30);

        JRadioButton radio1 = new JRadioButton("Mañana");
        radio1.setBounds(20, 140, 100, 30);
        JRadioButton radio2 = new JRadioButton("Tarde");
        radio2.setBounds(130, 140, 100, 30);
        

        JLabel pregunta2 = new JLabel("¿Qué actividad te interesa?");
        pregunta2.setBounds(20, 180, 200, 30);

        String[] actividades = {"Musculación", "Funcional", "Running"};
        JComboBox<String> comboBox = new JComboBox<>(actividades);
        comboBox.setBounds(200, 180, 200, 30);

        JLabel pregunta3 = new JLabel("¿Cuántos días a la semana?");
        pregunta3.setBounds(20, 220, 200, 30);

        JCheckBox check = new JCheckBox("2");
        check.setBounds(10, 260, 100, 30);
        JCheckBox check2 = new JCheckBox("3");
        check2.setBounds(130, 260, 100, 30);
        JCheckBox check3 = new JCheckBox("5");
        check3.setBounds(240, 260, 100, 30);
        

        JButton boton = new JButton("Enviar datos");
        boton.setBounds(50, 300, 200, 50);
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(boton, "Los datos se enviaron correctamente", "¡Inscripción finalizada!", 1);;
                System.out.println("Fin");
                txfNombre.setText("");
                txfApellido.setText("");
                radio1.setSelected(false);
                radio2.setSelected(false);
                comboBox.setSelectedIndex(0);
                check.setSelected(false);
                check2.setSelected(false);
                check3.setSelected(false);
                
                
        }});

        

       
        frame.add(txfNombre);
        frame.add(lblNombre);
        frame.add(txfApellido);
        frame.add(lblApellido);
        frame.add(pregunta1);
        frame.add(radio1);
        frame.add(radio2);
        frame.add(pregunta2);
        frame.add(comboBox);
        frame.add(pregunta3);
        frame.add(check);
        frame.add(check2);
        frame.add(check3);
        frame.add(boton);
      
        
        frame.setVisible(true);
        


    }
}

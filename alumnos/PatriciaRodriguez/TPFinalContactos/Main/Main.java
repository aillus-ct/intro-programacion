package Main;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
//import javax.swing.Timer;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import Main.DB.ContactoQuerys;

public class Main {
    // lista para guardar contactos 
    private static List<Contacto> listaContactos = new ArrayList<>();
    private static CardLayout cardLayout;
    private static JPanel mainPanel;
    private static DefaultTableModel modeloTabla;
    private static ContactoQuerys dbContactos = new ContactoQuerys();
    

    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Gestión de Contactos");
        frame.setSize(800, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        // configurar el card layout
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        // crear los paneles
        JPanel panelFormulario = crearPanelFormulario(frame);
        JPanel panelTabla = crearPanelTabla();
        mainPanel.add(panelFormulario, "Formulario");
        mainPanel.add(panelTabla, "Tabla");

        frame.add(mainPanel);
        frame.setVisible(true);


    }
                    
              
private static JPanel crearPanelFormulario(JFrame frame) {
    JPanel panelFormulario = new JPanel(new BorderLayout());
    JLabel titulo = new JLabel("Complete sus datos personales", SwingConstants.CENTER);
    titulo.setFont(new java.awt.Font("Arial", 1, 24));
    panelFormulario.add(titulo, BorderLayout.NORTH);

    JPanel formulario = new JPanel(new GridLayout(8, 2, 10, 10));
    formulario.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
    //campos del formulario
    JLabel lblNombre = new JLabel("Nombre");
    JTextField txtNombre = new JTextField();
    JLabel lblApellido = new JLabel("Apellido");
    JTextField txtApellido = new JTextField();
    JLabel lblCelular = new JLabel("Celular");
    JTextField txtCelular = new JTextField();
    JLabel lblCorreo = new JLabel("Correo electrónico");
    JTextField txtCorreo = new JTextField();
    JLabel lblFechaNacimiento = new JLabel("Fecha de nacimiento");
   // crear un jpanel para los combo box
   JPanel panelFechaNacimiento = new JPanel(new FlowLayout());
   // combo para el dia
   Integer [] dias = new Integer[31];
   for (int i = 0; i < 31; i++) {
        dias[i] = i + 1;
    }
    JComboBox<Integer> comboDia = new JComboBox<>(dias);

    // combo para el mes
    String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    JComboBox<String> comboMes = new JComboBox<>(meses);

    // combo para el año
    Integer[] años = new Integer[125];
    for (int i = 0; i < 125; i++) {
        años[i] = 1900 + i;
    }
    JComboBox<Integer> comboAño = new JComboBox<>(años);

    // agregar los combos al panel de la fecha
    panelFechaNacimiento.add(comboDia);
    panelFechaNacimiento.add(comboMes);
    panelFechaNacimiento.add(comboAño);

    // boton para mostrar la fecha seleccionada
    JButton btnMostrarFecha = new JButton("Mostrar fecha");
    btnMostrarFecha.addActionListener(e -> {
        String dia = comboDia.getSelectedItem().toString();
        String mes = comboMes.getSelectedItem().toString();
        String año = comboAño.getSelectedItem().toString();
        JOptionPane.showMessageDialog(frame, "Fecha seleccionada: " + dia + " de " + mes + " de " + año);
    });
    panelFechaNacimiento.add(btnMostrarFecha);
    
    
    formulario.add(lblNombre);
    formulario.add(txtNombre);
    formulario.add(lblApellido);
    formulario.add(txtApellido);
    formulario.add(lblCelular);
    formulario.add(txtCelular);
    formulario.add(lblCorreo);
    formulario.add(txtCorreo);
    formulario.add(lblFechaNacimiento);
    formulario.add(panelFechaNacimiento);

    JLabel lblDomicilio = new JLabel("Domicilio");
    JTextField txtDomicilio = new JTextField();
    JLabel lblProvincia = new JLabel("Provincia");
    String[] provincias = {
        "Seleccione una provincia", "Buenos Aires", "Catamarca", "Chaco",
        "Chubut","Córdoba", "Corrientes", "Entre Ríos", "Formosa", "Jujuy", 
        "La Pampa", "La Rioja", "Mendoza", "Misiones", "Neuquén", 
        "Río Negro", "Salta", "San Juan", "San Luis", "Santa Cruz",
        "Santa Fe", "Santiago del Estero", "Tierra del Fuego", "Tucumán"
    };
    JComboBox<String> comboProvincia = new JComboBox<>(provincias);
    comboProvincia.setSelectedIndex(0); //por defecto esta en la 1era opcion
    

    formulario.add(lblDomicilio);
    formulario.add(txtDomicilio);
    formulario.add(lblProvincia);
    formulario.add(comboProvincia);

    panelFormulario.add(formulario, BorderLayout.CENTER);
    
    // panel botones del formulario
    JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        
    // JLabel de carga para mostrar cuando se realiza una accion
    JLabel lblCargando = new JLabel("Cargando...");
    lblCargando.setForeground(Color.RED);
    lblCargando.setFont(new Font("Arial", Font.BOLD, 14));
    lblCargando.setVisible(false); // oculto por defecto

    // Botón Guardar original (el que si guarda)
    JButton btnGuardar = new JButton("Guardar");
    //JLabel lblGuardar = new JLabel("");
    btnGuardar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // validaciones
             if (txtNombre.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(frame, "El campo 'Nombre' es obligatorio.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (txtApellido.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(frame, "El campo 'Apellido' es obligatorio.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (txtCelular.getText().trim().isEmpty() || !txtCelular.getText().matches("\\d+")) {
                JOptionPane.showMessageDialog(frame, "El campo 'Celular' debe ser un número.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (txtCorreo.getText().trim().isEmpty() || !txtCorreo.getText().matches("^[\\w-.]+@[\\w-]+\\.[a-zA-Z]{2,}$")) {
                JOptionPane.showMessageDialog(frame, "El campo 'Correo electrónico' no tiene un formato válido.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // validación de duplicados para celular y correo
            String celularNuevo = txtCelular.getText().trim();
            String correoNuevo = txtCorreo.getText().trim();

            boolean esDuplicado = listaContactos.stream()
            .anyMatch(contacto -> 
            contacto.getCelular().equals(celularNuevo.trim()) &&
            contacto.getCorreo().trim().equalsIgnoreCase(correoNuevo.trim())
            );
            
            if (esDuplicado) {
                JOptionPane.showMessageDialog(frame, "El celular o correo electrónico ya están registrados.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // validación para la fecha de nacimiento
            Integer dia = (Integer) comboDia.getSelectedItem();
            String mes = (String) comboMes.getSelectedItem();
            Integer año = (Integer) comboAño.getSelectedItem();
            if (dia == null || mes == null || año == null) {
                JOptionPane.showMessageDialog(frame, "El campo 'Fecha de nacimiento' es obligatorio.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            // construir la fecha en formato dd/mm/aaaa
            String fechaNacimiento = String.format("%02d/%02d/%d",
            (int) comboDia.getSelectedItem(),
            comboMes.getSelectedIndex() + 1, // los meses empiezan en 0
            (int) comboAño.getSelectedItem()
            );
            // validar que se elijan fechas válidas
            try {
                LocalDate.of(año, comboMes.getSelectedIndex() + 1, dia);
            } catch (DateTimeException exc) {
                JOptionPane.showMessageDialog(frame, "La fecha seleccionada no es válida.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }


            // validacion para provincia
            if (comboProvincia.getSelectedIndex() == 0) { // Validar que no sea "Seleccione una provincia"
            JOptionPane.showMessageDialog(frame, "Debe seleccionar una provincia.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
            }
            // obtener la provincia seleccionada cuando la necesite si pasa la validación
            String provinciaSeleccionada = comboProvincia.getSelectedItem().toString();
            System.out.println("Provincia seleccionada: " + provinciaSeleccionada);

            if (dbContactos.existeContacto(celularNuevo.trim(), correoNuevo.trim())){
                JOptionPane.showMessageDialog(frame, "El celular o correo electrónico ya están registrados.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }


            Contacto nuevoContacto = new Contacto(txtNombre.getText(),txtApellido.getText(), celularNuevo.trim(), correoNuevo.trim(), fechaNacimiento, txtDomicilio.getText(), provinciaSeleccionada);
            
            
            dbContactos.insertarContacto(nuevoContacto);
            listaContactos.add(nuevoContacto);
            JOptionPane.showMessageDialog(frame, "Contacto guardado exitosamente", "Información", JOptionPane.INFORMATION_MESSAGE);
            limpiarFormulario(formulario);
            inicializarContactos();
        }
    });     
    panelBotones.add(btnGuardar);
                    
    formulario.setVisible(true);
   

    // Boton Cancelar                     
    JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            limpiarFormulario(formulario);
            }
        }
        );
        panelBotones.add(btnCancelar);

    // Boton Ver contactos                                                
    JButton btnMostrarContactos = new JButton("Ver contactos");
        //JLabel lblVerContactos = new JLabel("");
        btnMostrarContactos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // mostrar el jlabel de aarga y deshabilitar botones
                lblCargando.setText("Cargando contactos...");
                lblCargando.setVisible(true);
                btnMostrarContactos.setEnabled(false);

                //SwingWorker para realizar la tarea en segundo plano
                SwingWorker<Void, Void> worker = new SwingWorker<>() {
                    @Override
                    protected Void doInBackground() throws Exception {
                        // realizar la tarea en segundo plano
                        Thread.sleep(2000);
                        listaContactos = dbContactos.cargarContactos();
                        return null;
                    }
                    @Override
                    protected void done(){
                        // ocualtar el jlabel de carga y habilitar botones
                        lblCargando.setVisible(false);
                        btnMostrarContactos.setEnabled(true);
                        // actualizar la tabla con los contactos cargados
                        modeloTabla.setRowCount(0); // para limpiar filas anteriores
                        for (Contacto contacto : listaContactos){
                            modeloTabla.addRow(new Object[]{
                            contacto.getIdContacto(),
                            contacto.getNombre(), contacto.getApellido(),
                            contacto.getCelular(), contacto.getCorreo(), 
                            contacto.getFechaNacimiento(), contacto.getDomicilio(), contacto.getProvincia()
                            });
                            actualizarTabla();
                        }
                        cardLayout.show(mainPanel, "Tabla");
                    }
                };
                worker.execute();
            }
        });
        panelBotones.add(btnMostrarContactos);
        panelBotones.add(lblCargando);
        panelFormulario.add(panelBotones, BorderLayout.SOUTH);
        return panelFormulario;              
                    
}
            
                                        
                                        
private static JPanel crearPanelTabla() {
    JPanel panelTabla = new JPanel(new BorderLayout());
    JLabel titulo = new JLabel("Lista de Contactos", SwingConstants.CENTER);
    titulo.setFont(new Font("Arial", Font.BOLD, 20));
    panelTabla.add(titulo, BorderLayout.NORTH);
                
    listaContactos = dbContactos.cargarContactos();
                    
    // crear la tabla y el modelo de las columnas - agrego idContacto
    String[] columnas = {"idContacto","Nombre", "Apellido", "Celular", "Correo electrónico", "Fecha de nacimiento", "Domicilio", "Provincia"};
    modeloTabla = new DefaultTableModel( columnas, 0);
                
    JTable tablaContactos = new JTable(modeloTabla);
    TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modeloTabla);
    tablaContactos.setRowSorter(sorter);
                
    // configuraciones adicionales
    tablaContactos.setRowSelectionAllowed(true); // permite la selecciona de filas
    tablaContactos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // una fila por vez
                
    // ocultar columna idContacto
    tablaContactos.getColumnModel().getColumn(0).setMinWidth(0);
    tablaContactos.getColumnModel().getColumn(0).setMaxWidth(0);
    tablaContactos.getColumnModel().getColumn(0).setPreferredWidth(0);
                
    JScrollPane scrollTabla = new JScrollPane(tablaContactos);
    panelTabla.add(scrollTabla, BorderLayout.CENTER);
        
            
    // panel de los botones del segundo panel
    JPanel panelBotones2 = new JPanel(new FlowLayout());

    // boton editar
    JButton btnEditar = new JButton("Editar");
    btnEditar.addActionListener(e -> {
        int filaSeleccionada = tablaContactos.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(panelTabla,"Selecciona un contacto para editar.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // para mostrar el cuadro de diálogo para editar el contacto seleccionado
        JTextField txtNombre = new JTextField((String)modeloTabla.getValueAt(filaSeleccionada, 1));
        JTextField txtApellido = new JTextField((String)modeloTabla.getValueAt(filaSeleccionada, 2));
        JTextField txtCelular = new JTextField((String)modeloTabla.getValueAt(filaSeleccionada, 3));
        JTextField txtCorreo = new JTextField((String)modeloTabla.getValueAt(filaSeleccionada, 4));
        JTextField txtFechaNac = new JTextField((String)modeloTabla.getValueAt(filaSeleccionada, 5));
        JTextField txtDomicilio = new JTextField((String)modeloTabla.getValueAt(filaSeleccionada, 6));
        JTextField txtProvincia = new JTextField((String)modeloTabla.getValueAt(filaSeleccionada, 7));

        Object[] campos = {
            "Nombre:", txtNombre,
            "Apellido:", txtApellido,
            "Celular:", txtCelular,
            "Correo:", txtCorreo,
            "Fecha Nac.:", txtFechaNac,
            "Domicilio:", txtDomicilio,
            "Provincia:", txtProvincia
        };

        int opcion = JOptionPane.showConfirmDialog(panelTabla, campos, "Editar contacto", JOptionPane.OK_CANCEL_OPTION);
        if (opcion == JOptionPane.OK_OPTION) {
            // validar los datos
            if (txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty() || txtCelular
            .getText().isEmpty() || txtCorreo.getText().isEmpty() || txtFechaNac.getText().
            isEmpty() || txtDomicilio.getText().isEmpty() || txtProvincia.getText().isEmpty())
            JOptionPane.showMessageDialog(panelTabla, "Complete los campos, por favor.", "Error", JOptionPane.ERROR_MESSAGE);
            
    
            SwingUtilities.invokeLater(()-> {
                modeloTabla.setValueAt(txtNombre.getText(), filaSeleccionada, 1);
                modeloTabla.setValueAt(txtNombre.getText(), filaSeleccionada, 1);
                modeloTabla.setValueAt(txtApellido.getText(), filaSeleccionada, 2);
                modeloTabla.setValueAt(txtCelular.getText(), filaSeleccionada, 3);
                modeloTabla.setValueAt(txtCorreo.getText(), filaSeleccionada, 4);
                modeloTabla.setValueAt(txtFechaNac.getText(), filaSeleccionada, 5);
                modeloTabla.setValueAt(txtDomicilio.getText(), filaSeleccionada, 6);
                modeloTabla.setValueAt(txtProvincia.getText(), filaSeleccionada, 7);
            });

            Contacto contactoActualizado = new Contacto((int)modeloTabla.getValueAt(filaSeleccionada, 0), txtNombre.getText(),txtApellido.getText(), txtCelular.getText(), txtCorreo.getText(), txtFechaNac.getText(), txtDomicilio.getText(), txtProvincia.getText());
            System.out.println((int)modeloTabla.getValueAt(filaSeleccionada, 0) + txtNombre.getText());
            
            System.out.println("info " + contactoActualizado.getNombre() + contactoActualizado.getIdContacto());
            dbContactos.actualizarContacto(contactoActualizado);
            
            actualizarTabla(); // para actualizar en la base
            JOptionPane.showMessageDialog(panelTabla, "Contacto actualizado correctamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
           
            
           
        }
    });
    panelBotones2.add(btnEditar);

    // Botón eliminar para borrar el contacto de la fila seleccionada)
    JButton btnEliminar = new JButton("Eliminar");
    JLabel lblCargandoEliminar = new JLabel("");
    lblCargandoEliminar.setForeground(Color.RED);
    lblCargandoEliminar.setFont(new Font("Arial", Font.BOLD, 14));
    lblCargandoEliminar.setVisible(false);

    btnEliminar.addActionListener(e -> {
        int filaSeleccionada = tablaContactos.getSelectedRow();
        System.out.println("Fila seleccionada :" + filaSeleccionada);
        
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(panelTabla, "Por favor, selecciona un contacto para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // obtener el id desde la listaContactos
        Contacto contactoSeleccionado = listaContactos.get(tablaContactos.getSelectedRow());
        int idContacto = contactoSeleccionado.getIdContacto();
        System.out.println("Id obtenido de la lista: " + idContacto);

        // confirmar la eliminacion
        int confirmacion = JOptionPane.showConfirmDialog(panelTabla, "¿Está seguro de eliminar este contacto?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) {
            System.out.println("Eliminando...");
            lblCargandoEliminar.setText("Eliminando...");
            lblCargandoEliminar.setVisible(true);
            btnEliminar.setEnabled(false);

            SwingWorker<Void, Void> worker = new SwingWorker<>() {
                @Override
                protected Void doInBackground() throws Exception {
                    Thread.sleep(2000);
                    Contacto contactoSeleccionado = listaContactos.get(filaSeleccionada);
                    dbContactos.eliminarContacto(contactoSeleccionado.getIdContacto());
                    listaContactos.remove(filaSeleccionada);
                    return null;
                }
                @Override
                protected void done(){
                    lblCargandoEliminar.setVisible(false);
                    btnEliminar.setEnabled(true);
                    actualizarTabla();
                    JOptionPane.showMessageDialog(panelTabla, "Contacto eliminado correctamente","Información", JOptionPane.INFORMATION_MESSAGE);

                }
            };
            worker.execute();
        }
    });
    panelBotones2.add(lblCargandoEliminar);                         
                                
                        
    // boton volver para volver al panel principal
    JButton btnVolver = new JButton("Volver");
    btnVolver.addActionListener(e -> cardLayout.show(mainPanel, "Formulario"));
                                                 
// crear el panel para buscar contactos
JPanel panelBusqueda = new JPanel(new FlowLayout());
JTextField txtBusqueda = new JTextField(20); // campo de texto del buscador
txtBusqueda.getDocument().addDocumentListener(new DocumentListener() {
    @Override
    public void insertUpdate(DocumentEvent e) {
        actualizarFiltro();
    }
    @Override
    public void removeUpdate(DocumentEvent e) {
    actualizarFiltro();
    }
    @Override
    public void changedUpdate(DocumentEvent e){ 
    actualizarFiltro();
    }
    private void actualizarFiltro() {
    String textoBusqueda = txtBusqueda.getText().trim();
    if (textoBusqueda.isEmpty()) {
        sorter.setRowFilter(null); // quita el filtro si el buscador esta vacio
    } else {
                                
        sorter.setRowFilter(RowFilter.regexFilter("(?i)" + textoBusqueda)); // aplica el filtro
    }
    }
});
                    
                    
                    
    JButton btnBuscar = new JButton("Buscar");
                    
        btnBuscar.addActionListener(e -> {
        String textoBusqueda = txtBusqueda.getText().trim();
            if (textoBusqueda.isEmpty()) {
                sorter.setRowFilter(null); // Quita el filtro si el campo está vacío
            } else {
                sorter.setRowFilter(RowFilter.regexFilter("(?i)" + textoBusqueda)); // Aplica filtro ignorando mayúsculas/minúsculas
            }
        });
                    
        panelBusqueda.add(new JLabel("Buscar: "));
        panelBusqueda.add(txtBusqueda);
        panelBusqueda.add(btnBuscar);
                    
                    
        panelBotones2.add(btnEditar);
        panelBotones2.add(btnEliminar);
        panelBotones2.add(btnVolver);
        panelTabla.add(panelBusqueda, BorderLayout.NORTH);
        panelTabla.add(scrollTabla, BorderLayout.CENTER);
        panelTabla.add(panelBotones2, BorderLayout.SOUTH);
                                        
            return panelTabla;
        }
                                                    
                
                                                    
                                                    
// función para actualizar la tabla
private static void actualizarTabla() {
modeloTabla.setRowCount(0); //para limpiar las filas

for (Contacto contacto : listaContactos){
    modeloTabla.addRow(new Object[]{
        contacto.getIdContacto(),
        contacto.getNombre(), contacto.getApellido(),
        contacto.getCelular(), contacto.getCorreo(),
        contacto.getFechaNacimiento(),
        contacto.getDomicilio(), contacto.getProvincia()
});}
}
            
// función para limpiar todos los campos del formulario
public static void limpiarFormulario(Container container){
    for (Component component : container.getComponents()) {
        if (component instanceof JTextField){
        ((JTextField) component).setText(""); // limpia campos de texto
        } else if (component instanceof JComboBox){
        ((JComboBox<?>) component).setSelectedIndex(0); // limpia campos de combos
        }
        limpiarFormulario((Container) component);
    }
        
}
            
// inicializar la listaContactos con cargarContactos
private static void inicializarContactos() {
// cargar contactos desde la base de datos
ContactoQuerys dbContactos = new ContactoQuerys();
listaContactos = dbContactos.cargarContactos();

// actualizar la tabla con los contactos cargados
modeloTabla.setRowCount(0); // limpia la tabla
for (Contacto contacto : listaContactos) {
    modeloTabla.addRow(new Object[] {contacto.getIdContacto(), 
        contacto.getNombre(), contacto.getApellido(), contacto.getCelular(), 
        contacto.getCorreo(), contacto.getFechaNacimiento(),
        contacto.getDomicilio(), contacto.getProvincia()});
}
System.out.println("Tabla actualizada con contactos cargados");
} 

}
        


    
    







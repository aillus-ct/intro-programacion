# Introducción a Java Swing

## ¿Qué es Swing?
- Es una biblioteca de Java para crear interfaces gráficas de usuario (GUI).
- Forma parte de Java Foundation Classes (JFC).
- Proporciona componentes como botones, etiquetas, cuadros de texto, paneles, menús, etc.

### Diferencias con AWT (Abstract Window Toolkit):
- Swing es más flexible y tiene más componentes que AWT.
- Swing es ligero (dibujado por software) mientras que AWT depende del sistema operativo.

## Ejemplos básicos

### 1. Mostrar un mensaje de información

```java
import javax.swing.JOptionPane;

public class EjemploMensaje {
    public static void main(String[] args) {
        // Mostrar un cuadro de mensaje de información
        JOptionPane.showMessageDialog(null, "¡Hola! Este es un mensaje de información.");
    }
}
```

**Explicación:** `showMessageDialog()` muestra una ventana emergente con un mensaje. El primer argumento (`null`) indica que la ventana no tiene un "padre", es decir, se mostrará en el centro de la pantalla.

### 2. Pedir al usuario que ingrese texto

```java
import javax.swing.JOptionPane;

public class EjemploEntradaTexto {
    public static void main(String[] args) {
        // Solicitar al usuario que ingrese su nombre
        String nombre = JOptionPane.showInputDialog("Por favor, ingresa tu nombre:");
        
        // Mostrar el nombre ingresado
        JOptionPane.showMessageDialog(null, "Hola, " + nombre + "!");
    }
}
```

**Explicación:** `showInputDialog()` muestra un cuadro de diálogo que permite al usuario ingresar un valor de texto. Lo que ingrese el usuario se guarda en la variable `nombre`.

### 3. Cuadro de confirmación (Sí/No)

```java
import javax.swing.JOptionPane;

public class EjemploConfirmacion {
    public static void main(String[] args) {
        // Mostrar un cuadro de confirmación con las opciones Sí y No
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Quieres continuar?", "Confirmación", JOptionPane.YES_NO_OPTION);
        
        // Verificar qué opción eligió el usuario
        if (respuesta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Has elegido continuar.");
        } else {
            JOptionPane.showMessageDialog(null, "Has elegido salir.");
        }
    }
}
```

**Explicación:** `showConfirmDialog()` muestra un cuadro de confirmación con opciones como Sí o No. La elección del usuario se almacena en la variable `respuesta`, y puedes tomar decisiones según la opción seleccionada.

## Opciones de Iconos y Tipos de Mensajes

JOptionPane permite personalizar el tipo de mensaje y el icono que se muestra. Algunos ejemplos:

- Información: `JOptionPane.INFORMATION_MESSAGE`
- Advertencia: `JOptionPane.WARNING_MESSAGE`
- Error: `JOptionPane.ERROR_MESSAGE`
- Pregunta: `JOptionPane.QUESTION_MESSAGE`

Ejemplo:
```java
JOptionPane.showMessageDialog(null, "Este es un mensaje de advertencia", "Advertencia", JOptionPane.WARNING_MESSAGE);
```

## Crear una Ventana Básica

La clase `JFrame` es la ventana principal. Ejemplo básico:

```java
import javax.swing.*;

public class MiVentana {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mi primera ventana");
        frame.setSize(400, 300);  // Tamaño de la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Termina el programa al cerrar
        frame.setVisible(true);  // Hace visible la ventana
    }
}
```

**Puntos a explicar:**
- Crear un objeto JFrame.
- Establecer el tamaño de la ventana.
- Manejar el cierre de la ventana con `setDefaultCloseOperation`.
- Mostrar la ventana con `setVisible(true)`.

## Añadir Componentes a la Ventana

Componentes básicos:
- `JButton`: Botones.
- `JLabel`: Etiquetas.
- `JTextField`: Campos de texto.

Ejemplo con un botón:

```java
import javax.swing.*;

public class MiVentanaConBoton {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana con botón");
        JButton button = new JButton("Haz clic aquí");  // Crear botón
        frame.add(button);  // Añadir botón al frame
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
```

**Puntos a explicar:**
- Cómo crear y agregar componentes a la ventana.
- El diseño por defecto de un JFrame es el BorderLayout, que permite añadir solo un componente sin necesidad de usar un gestor de diseño.

## Gestionar Eventos de Componentes

ActionListener para botones:
Los botones necesitan escuchar eventos (cuando el usuario hace clic).

Ejemplo de manejo de eventos:

```java
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonConEvento {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Evento de botón");
        JButton button = new JButton("Haz clic aquí");
        
        // Agregar un listener para manejar el clic
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Botón fue clicado!");
            }
        });

        frame.add(button);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
```

**Puntos a explicar:**
- ActionListener es una interfaz que escucha eventos de acción.
- Se utiliza el método `addActionListener` para registrar el botón con el manejador de eventos.

## Layout Managers en Java Swing

Los Layout Managers son fundamentales para organizar y distribuir los componentes dentro de una ventana. Cada uno proporciona un enfoque diferente para gestionar la disposición de los elementos, lo que permite crear interfaces gráficas de distintos niveles de complejidad y estética.

### FlowLayout

El FlowLayout es el layout más sencillo. Los componentes se colocan en una fila, de izquierda a derecha, y si la ventana no tiene suficiente espacio horizontal, los componentes "fluyen" a la siguiente fila.

**Características principales:**
- Los componentes se colocan en la dirección en que se lee (de izquierda a derecha y de arriba hacia abajo).
- Puedes especificar la alineación de los componentes: centrado, izquierda, derecha.
- También puedes establecer el espaciado horizontal y vertical entre los componentes.

**Constructor:**
```java
FlowLayout()
FlowLayout(int align)
FlowLayout(int align, int hgap, int vgap)
```
- `align`: Puede ser `FlowLayout.LEFT`, `FlowLayout.CENTER`, o `FlowLayout.RIGHT`.
- `hgap`: Espacio horizontal entre componentes.
- `vgap`: Espacio vertical entre componentes.

**Ejemplo de uso:**

```java
import javax.swing.*;
import java.awt.*;

public class EjemploFlowLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo de FlowLayout");
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 15));  // Centrado, 20px de espacio horizontal y 15px de espacio vertical

        frame.add(new JButton("Botón 1"));
        frame.add(new JButton("Botón 2"));
        frame.add(new JButton("Botón 3"));
        frame.add(new JButton("Botón 4"));
        frame.add(new JButton("Botón 5"));

        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
```

En este ejemplo, los botones se organizan en una fila. Si la ventana se redimensiona, los componentes se reorganizan automáticamente en varias filas.

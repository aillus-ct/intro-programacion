### Introducción a la Programacion Prientada a Objetos en Java

La POO es un paradigma de programación que se basa en el concepto de "objetos", que pueden contener datos y código. La idea es organizar el diseño del software en torno a objetos que interactúan entre sí.

### ¿Para qué se usa la Programación Orientada a Objetos?

La POO se utiliza para:

- Modularidad: Permite dividir el programa en módulos o clases, facilitando su mantenimiento y comprensión.

- Reutilización de Código: Gracias a la herencia, los desarrolladores pueden crear nuevas clases basadas en clases ya existentes, reutilizando así código previamente escrito.

- Facilidad de Mantenimiento: Al encapsular datos y funciones, los cambios en una parte del programa pueden realizarse sin afectar otras partes, lo que hace que el mantenimiento sea más sencillo.

- Escalabilidad: La POO facilita la creación de sistemas complejos y grandes mediante la división en objetos más pequeños y manejables.

- Mapeo a Problemas del Mundo Real: La POO permite modelar problemas del mundo real de manera más intuitiva, ya que los objetos pueden representar entidades reales con sus propiedades y comportamientos.

Elementos principales de la POO en Java:

## Clases:

Una clase es una plantilla o modelo para crear objetos. Define los atributos (datos) y métodos (funciones) que tendrán los objetos de esa clase.

### Ejemplo clase Persona:

En este ejemplo, Persona es una clase que tiene atributos nombre y edad, y métodos para acceder y modificar estos atributos. persona1 es un objeto de la clase Persona que se utiliza en el método main para mostrar la información de la persona.

```java

// Definición de la clase
public class Persona {
    
    // Atributos privados
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos públicos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}

## Objetos:

Un objeto es una instancia de una clase. Se crea a partir de una clase y tiene sus propios valores para los atributos definidos en la clase.

Ejemplo de creación de un objeto:

// Uso de la clase
public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 25);
        persona1.mostrarInformacion();
    }
}
```

### Ejemplo clase Coche

```java
public class Coche {

    static int ruedas = 4;

    static void service(int km){
        if (km < 1000){
            System.out.println("Proximo service a los 1000");
        } else if (km < 3000) {
            System.out.println("Proximo servicio a los 3000");
        } else if (km < 10000){
            System.out.println("Proximo servicio a los 10000");
        } else {
            System.out.println("Llama a su vendedor");
        }
    }

    // Atributos
    private String marca;
    private String modelo;
    private int anio;

    // Constructor
    public Coche(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    // Métodos
    public void arrancar() {
        System.out.println("El coche está arrancando");
    }

    public void frenar() {
        System.out.println("El coche está frenando");
    }
}
```

```java

public class Main {
    public static void main(String[] args) {

        Coche miToyota = new Coche("Toyota", "Corolla", 2022);
        Coche miFord = new Coche("Ford", "K", 2023);
        
        miToyota.arrancar();
        miToyota.frenar();

        miFord.arrancar();
        miFord.frenar();

        System.out.println("Ruedas: " + Coche.ruedas);

    }
}

```

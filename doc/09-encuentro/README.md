### Introducción a la Programacion Prientada a Objetos en Java

La POO es un paradigma de programación que se basa en el concepto de "objetos", que pueden contener datos y código. La idea es organizar el diseño del software en torno a objetos que interactúan entre sí.

Elementos principales de la POO en Java:

## Clases:

Una clase es una plantilla o modelo para crear objetos. Define los atributos (datos) y métodos (funciones) que tendrán los objetos de esa clase.

Ejemplo de una clase simple:

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

## Objetos:
Un objeto es una instancia de una clase. Se crea a partir de una clase y tiene sus propios valores para los atributos definidos en la clase.

Ejemplo de creación de un objeto:

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

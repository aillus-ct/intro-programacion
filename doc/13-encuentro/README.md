# Herencia y Polimorfimo

Herencia y polimorfismo son dos pilares fundamentales de la programación orientada a objetos (OOP) en Java.

## Herencia
La herencia es un mecanismo que permite a una clase (denominada clase hija o subclase) heredar los atributos y métodos de otra clase (denominada clase padre o superclase). Esto permite reutilizar código y crear una jerarquía de clases.

- Clase Padre (Superclase): Es la clase de la que se heredan los atributos y métodos.
- Clase Hija (Subclase): Es la clase que hereda los atributos y métodos de la superclase.

Por ejemplo:

```java
class Animal {
    void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}

class Perro extends Animal {
    void hacerSonido() {
        System.out.println("El perro ladra");
    }
}
```

En este ejemplo, Perro es una subclase de Animal. Perro hereda el método hacerSonido() de Animal, pero lo sobrescribe con su propia implementación.

## Polimorfismo

El polimorfismo permite que un objeto de una clase hija sea tratado como si fuera de la clase padre, pero aún puede comportarse como un objeto de la clase hija. 
Se refiere a la capacidad de una subclase para proporcionar una implementación específica de un método que ya está definido en su superclase.

Ejemplo:

```java
Animal miAnimal = new Perro();
miAnimal.hacerSonido();
```

```java
class Animal {
    void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}

class Gato extends Animal {
    void hacerSonido() {
        System.out.println("El gato maúlla");
    }
}

class Perro extends Animal {
    void hacerSonido() {
        System.out.println("El perro ladra");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal miAnimal1 = new Gato();
        Animal miAnimal2 = new Perro();
        
        miAnimal1.hacerSonido();  // Salida: El gato maúlla
        miAnimal2.hacerSonido();  // Salida: El perro ladra
    }
}
```
En este ejemplo, gracias al polimorfismo, miAnimal1 y miAnimal2 pueden ser tratados como objetos de la clase Animal, pero aún así invocan los métodos sobrescritos en Gato y Perro, respectivamente.

## Resumen:

- Herencia: Reutilización de código y creación de jerarquías de clases.
- Polimorfismo: Capacidad de un objeto de tomar múltiples formas, permitiendo que una interfaz común funcione con objetos de diferentes tipos.
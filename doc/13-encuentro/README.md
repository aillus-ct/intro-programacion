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


### Ejercicio 1: Extensión de la Clase Persona
#### Objetivo: Extender la clase Persona para crear subclases Empleado y Estudiante, cada una con atributos y métodos adicionales específicos.
#### Instrucciones:
- Clase Persona:
Ya tienes la clase Persona con los atributos nombre y edad, junto con los métodos correspondientes.
    - Subclase Empleado:
Crea una subclase de Persona llamada Empleado.
Añade los siguientes atributos:
salario (tipo double)
puesto (tipo String)
Implementa un constructor que inicialice nombre, edad, salario y puesto.
Implementa un método mostrarInformacion() que imprima la información del empleado, incluyendo su salario y puesto, junto con su nombre y edad.
    - Subclase Estudiante:
Crea una subclase de Persona llamada Estudiante.
Añade los siguientes atributos:
grado (tipo String)
promedio (tipo double)
Implementa un constructor que inicialice nombre, edad, grado y promedio.
Implementa un método mostrarInformacion() que imprima la información del estudiante, incluyendo su grado y promedio, junto con su nombre y edad.
- Clase Principal:
En la clase principal, crea una lista de Persona que incluya objetos tanto de Empleado como de Estudiante.
Recorre la lista y utiliza el método mostrarInformacion() para imprimir la información de cada persona, estudiante y empleado.

### Ejercicio 2: Extensión de la Clase Círculo
#### Objetivo: Crear una subclase que extienda la funcionalidad de la clase Círculo añadiendo características adicionales.
#### Instrucciones:
- Clase Círculo:
Supón que ya tienes una clase Círculo con los siguientes atributos:
radio (tipo double)
Métodos básicos:
calcularArea(): Calcula y devuelve el área del círculo.
calcularCircunferencia(): Calcula y devuelve la circunferencia del círculo.
    - Subclase Cilindro:
Crea una subclase de Círculo llamada Cilindro.
Añade un nuevo atributo altura (tipo double).
Implementa un constructor que inicialice el radio del círculo y la altura del cilindro.
Añade un método calcularVolumen() que calcule y devuelva el volumen del cilindro utilizando el área de la base (Círculo) y la altura.
Añade un método calcularAreaSuperficie() que calcule y devuelva el área de la superficie del cilindro.
    - Clase Principal:
En la clase principal, crea un objeto de la clase Cilindro.
Calcula y muestra el área del círculo (base del cilindro), el volumen del cilindro y el área de la superficie del cilindro.

### Ejercicio 3: Polimorfismo con Vehículos
#### Objetivo: Crear una clase base Vehiculo y varias subclases que representen diferentes tipos de vehículos. Usar polimorfismo para que cada tipo de vehículo tenga un comportamiento diferente.
#### Instrucciones:
- Clase Vehiculo:
Crea una clase base Vehiculo con un método mover().
Este método debería ser implementado por las subclases para definir cómo se mueve cada vehículo.
    - Subclases Auto, Bicicleta y Barco:
Crea las siguientes subclases de Vehiculo:
        - Auto: Implementa el método mover() para mostrar que el auto se mueve en carretera.
        - Bicicleta: Implementa el método mover() para mostrar que la bicicleta se mueve en la vía.
        - Barco: Implementa el método mover() para mostrar que el barco se mueve en el agua.
- Clase Principal:
En la clase principal, crea un array o lista de objetos Vehiculo que contenga instancias de Auto, Bicicleta, y Barco.
Usa un bucle para recorrer la lista y llamar al método mover() de cada vehículo, demostrando el polimorfismo en acción.

### Ejercicio 4: Polimorfismo con Electrodomésticos
#### Objetivo: Crear una clase base Electrodomestico y subclases que representen diferentes tipos de electrodomésticos, cada uno con una funcionalidad específica.
#### Instrucciones:
- Clase Electrodomestico:
Crea una clase base Electrodomestico con un método funcionar().
Este método debe ser implementado por cada subclase para definir cómo funciona cada electrodoméstico.
    - Subclases Lavadora, Refrigerador y Microondas:
Crea las siguientes subclases de Electrodomestico:
        - Lavadora: Implementa el método funcionar() para mostrar que la lavadora está lavando ropa.
        - Refrigerador: Implementa el método funcionar() para mostrar que el refrigerador está enfriando alimentos.
        - Microondas: Implementa el método funcionar() para mostrar que el microondas está calentando comida.
- Clase Principal:
En la clase principal, crea una lista de objetos Electrodomestico que contenga instancias de Lavadora, Refrigerador, y Microondas.
Usa un bucle para recorrer la lista y llamar al método funcionar() de cada electrodoméstico, demostrando el uso del polimorfismo.

### Ejercicio 5: Polimorfismo con Empleados
#### Objetivo: Crear una clase base Empleado y varias subclases que representen diferentes tipos de empleados en una empresa. Usar polimorfismo para que cada tipo de empleado tenga una forma diferente de calcular su salario.
#### Instrucciones:
- Clase Empleado:
Crea una clase base Empleado con un método abstracto calcularSalario().
Este método debe ser implementado por cada subclase para definir cómo se calcula el salario de cada tipo de empleado.
    - Subclases EmpleadoFijo, EmpleadoPorHoras y EmpleadoComision:
Crea las siguientes subclases de Empleado:
        - EmpleadoFijo: Implementa el método calcularSalario() para un salario fijo mensual.
        - EmpleadoPorHoras: Implementa el método calcularSalario() para calcular el salario basado en horas trabajadas.
        - EmpleadoComision: Implementa el método calcularSalario() para calcular el salario basado en comisiones.
- Clase Principal:
En la clase principal, crea una lista de objetos Empleado que contenga instancias de EmpleadoFijo, EmpleadoPorHoras, y EmpleadoComision.
Usa un bucle para recorrer la lista y llamar al método calcularSalario() de cada empleado, mostrando el polimorfismo.
# Introducción a las variables

Las variables en Java son fundamentales para la programación en este lenguaje. Son utilizadas para almacenar datos que pueden ser usados y manipulados a lo largo del programa. 

## ¿Qué es una Variable?

Una variable es un contenedor que permite almacenar datos en la memoria del ordenador. Cada variable en Java tiene un tipo de datos asociado, un nombre y un valor. El tipo de datos determina qué tipo de valores puede almacenar la variable y qué operaciones se pueden realizar sobre esos valores.

## Tipos de Datos en Java

Java es un lenguaje de programación fuertemente tipado, lo que significa que cada variable debe ser declarada con un tipo específico antes de ser usada. Los tipos de datos en Java se dividen en dos categorías principales: tipos primitivos y tipos de referencia.

### Tipos Primitivos
Java tiene ocho tipos de datos primitivos:

- byte: 8-bit entero
- short: 16-bit entero
- int: 32-bit entero
- long: 64-bit entero
- float: 32-bit punto flotante
- double: 64-bit punto flotante
- char: carácter Unicode de 16 bits
- boolean: verdadero o falso

### Tipos de Referencia

Los tipos de referencia son más complejos y se utilizan para referirse a objetos y arrays. Incluyen:

- Clases: Definen nuevos tipos de datos y pueden incluir variables y métodos.
- Interfaces: Definen métodos que una clase puede implementar.
- Arrays: Colecciones de elementos del mismo tipo.


## Declaración y Inicialización de Variables

Para declarar una variable en Java, especificamos el tipo de dato seguido por el nombre de la variable. Opcionalmente, podemos asignarle un valor inicial.

```java
int edad;               // Declaración de una variable de tipo int
edad = 25;              // Inicialización de la variable
int numero = 10;        // Declaración e inicialización en una sola línea
char inicial = 'A';     // Declaración e inicialización de una variable de tipo char
boolean esMayor = true; // Declaración e inicialización de una variable de tipo boolean
```

## Reglas para Nombrar Variables

Las variables en Java deben seguir ciertas reglas y convenciones de nomenclatura:

- Deben comenzar con una letra, un signo de dólar $ o un guion bajo _.
- Pueden contener letras, dígitos, signos de dólar y guiones bajos.
- No pueden ser palabras reservadas de Java (como class, public, void, etc.).
- Por convención, se utilizan nombres descriptivos y en minúsculas, utilizando la notación de camello (camelCase).


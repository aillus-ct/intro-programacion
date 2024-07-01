# OPERADORES

En Java, los operadores son herramientas fundamentales que permiten realizar diversas operaciones sobre variables y valores. Estos operadores se clasifican en varios tipos según su función y comportamiento. Desde los operadores aritméticos que se utilizan para realizar cálculos básicos como suma, resta, multiplicación y división, hasta los operadores de comparación que evalúan condiciones y devuelven un resultado booleano.

Además de estos, Java también cuenta con operadores de asignación, que permiten asignar valores a variables de manera compacta, y operadores lógicos que combinan valores booleanos para formar expresiones más complejas.

Es crucial entender cómo funcionan estos operadores para poder escribir código efectivo y claro en Java. En esta introducción exploraremos cada tipo de operador, sus usos comunes y algunas consideraciones importantes sobre su aplicación en la programación Java.

Otro grupo importante son los operadores de incremento y decremento (++ y --), que permiten aumentar o disminuir el valor de una variable en una unidad de forma rápida y conveniente.

Java también proporciona operadores especiales para trabajar con tipos de datos especiales, como los operadores para comparar referencias de objetos (== y !=) y el operador instanceof para verificar la relación de herencia entre objetos.

En resumen, los operadores en Java son herramientas esenciales que permiten realizar desde simples cálculos aritméticos hasta complejas evaluaciones lógicas y manipulación de datos binarios. Comprender y dominar el uso de estos operadores es fundamental para escribir programas eficientes y funcionales en Java.

Los operadores se clasifican en varios tipos según su función y comportamiento. Aquí tienes una introducción a los principales tipos de operadores:

## Operadores Aritméticos:

Estos operadores se utilizan para realizar operaciones matemáticas básicas entre variables numéricas. Los operadores aritméticos en Java son:

- **\+** para la suma
- **\-** para la resta
- **\*** para la multiplicación
- **/** para la división
- **%** para el módulo (resto de la división)

## Operadores de Asignación:
Los operadores de asignación se utilizan para asignar valores a variables. El operador básico es **=**, pero también existen operadores compuestos como **+=**, **-=**, ***=**, **/**=, **%**= que realizan la operación aritmética correspondiente y luego asignan el resultado a la variable.

## Operadores de Comparación:
Estos operadores se utilizan para comparar dos valores y devolver un resultado booleano (true o false). Los operadores de comparación en Java son:

- **==** para igualdad
- **!=** para desigualdad
- **<** para menor que
- **>** para mayor que
- **<=** para menor o igual que
- **>=** para mayor o igual que

## Operadores Lógicos:

Los operadores lógicos se utilizan para combinar expresiones booleanas y devolver un resultado booleano. Los operadores lógicos en Java son:

- **&&** (AND lógico): devuelve true si ambas expresiones son true
- **||** (OR lógico): devuelve true si al menos una de las expresiones es true
- **!** (NOT lógico): invierte el valor de una expresión booleana

## Operadores de Incremento y Decremento:
Estos operadores se utilizan para aumentar (**++**) o disminuir (**--**) el valor de una variable numérica en una unidad.

Operadores de Bit a Bit:

Estos operadores realizan operaciones a nivel de bits sobre números enteros. Los operadores de bit a bit en Java son:

- **&** (AND bit a bit)
- **|** (OR bit a bit)
- **^** (XOR bit a bit)
- **~** (complemento a uno)
- **<<** (desplazamiento a la izquierda)
- **>>** (desplazamiento aritmético a la derecha)

## Operadores Condicionales (ternario):

Java tiene un operador condicional ternario (**condición ? expr1 : expr2**) que evalúa una expresión booleana y devuelve uno de dos valores posibles dependiendo del resultado de la evaluación.

Comprender estos tipos de operadores es esencial para poder escribir código efectivo y manejar adecuadamente las diversas operaciones que se pueden realizar en Java. Cada tipo de operador tiene su uso específico y reglas de comportamiento que deben tenerse en cuenta al programar.

Ejemplos de cada tipo de operador en Java:


### Operadores Aritméticos:
```java
int a = 10;
int b = 3;
int suma = a + b;       // suma = 13
int resta = a - b;      // resta = 7
int multiplicacion = a * b;  // multiplicacion = 30
int division = a / b;   // division = 3
int modulo = a % b;     // modulo = 1
```

### Operadores de Asignación:
```java
int x = 5;
x += 3;   // equivalente a x = x + 3;   ahora x es 8
x -= 2;   // equivalente a x = x - 2;   ahora x es 6
x *= 4;   // equivalente a x = x * 4;   ahora x es 24
x /= 3;   // equivalente a x = x / 3;   ahora x es 8
x %= 5;   // equivalente a x = x % 5;   ahora x es 3
```

### Operadores de Comparación:
```java
int num1 = 10;
int num2 = 5;

boolean igual = (num1 == num2);   // igual es false
boolean distinto = (num1 != num2);   // distinto es true
boolean mayorQue = (num1 > num2);   // mayorQue es true
boolean menorQue = (num1 < num2);   // menorQue es false
boolean mayorIgual = (num1 >= num2);   // mayorIgual es true
boolean menorIgual = (num1 <= num2);   // menorIgual es false
```

### Operadores Lógicos:

```java
boolean condicion1 = true;
boolean condicion2 = false;

boolean resultadoAnd = condicion1 && condicion2;   // resultadoAnd es false
boolean resultadoOr = condicion1 || condicion2;   // resultadoOr es true
boolean resultadoNot = !condicion1;   // resultadoNot es false
```

### Operadores de Incremento y Decremento:
```java
int contador = 5;

contador++;   // incrementa contador en 1, ahora contador es 6
contador--;   // decrementa contador en 1, ahora contador es 5 nuevamente
```

### Operadores de Bit a Bit:
```java

int num1 = 5;    // representación binaria: 101
int num2 = 3;    // representación binaria: 011

int andBit = num1 & num2;   // andBit es 1 (binario: 001)
int orBit = num1 | num2;    // orBit es 7 (binario: 111)
int xorBit = num1 ^ num2;   // xorBit es 6 (binario: 110)
int complemento = ~num1;    // complemento es -6 (binario: 111...1111010)
int desplazamientoIzq = num1 << 1;   // desplazamientoIzq es 10 (binario: 1010)
int desplazamientoDer = num1 >> 1;   // desplazamientoDer es 2 (binario: 10)
```
### Operador Condicional (Ternario):
```java
int edad = 18;
String status = (edad >= 18) ? "Adulto" : "Menor de edad";
// status es "Adulto" porque la condición (edad >= 18) es true
```

###  + en strings ??

El operador **+** y **+=** tiene un comportamiento especial cuando se usa con cadenas de texto (objetos de tipo String). En lugar de realizar una suma aritmética, el operador **+** se utiliza para concatenar cadenas, es decir, para unir dos o más cadenas en una sola.

```java
String texto1 = "Hola";
String texto2 = "Mundo";
String concatenacion = texto1 + " " + texto2; // concatenacion = "Hola Mundo"
```

```java
String mensaje = "Hola";
mensaje += " Mundo";
```

### Ejercicios:

1. Escribe un programa que solicite al usuario dos números enteros y luego calcule y muestre la suma, resta, multiplicación, división y módulo de estos números.

2. Escribe un programa que solicite al usuario dos números y luego muestre los resultados de las comparaciones entre ellos.

3. Escribe un programa que determine si un número ingresado por el usuario es par o impar usando el operador ternario.

4. Escribe un programa que pida la edad de una persona y calcule su edad equivalente en años de perro (un año humano equivale a aproximadamente siete años de perro).

5. Escribe un programa que convierta temperaturas de Celsius a Fahrenheit y viceversa. El programa debe pedir al usuario que ingrese una temperatura y luego realizar la conversión.


# SENTENCIAS

## Sentencias de Control de Flujo:

Las sentencias de control de fluj son herramientas fundamentales que permiten dirigir la ejecución del programa según ciertas condiciones y repeticiones. Estas sentencias permiten que el programa tome decisiones, repita bloques de código y maneje el flujo de ejecución de manera dinámica.

## Tipos de Sentencias de Control de Flujo

### Sentencias Condicionales:

- **if**: Ejecuta un bloque de código solo si una condición especificada es verdadera.
- **else if**: Proporciona una condición adicional si la condición anterior es falsa.
- **else**: Ejecuta un bloque de código si todas las condiciones anteriores son falsas.
- **switch**: Selecciona y ejecuta un bloque de código entre múltiples opciones basadas en el valor de una expresión.

```java
if (x > 0) {
    System.out.println("x es positivo");
} else {
    System.out.println("x no es positivo");
}
```

```java
int x = 10;

if (x > 0) {
    System.out.println("x es positivo");
} else if (x < 0) {
    System.out.println("x es negativo");
} else {
    System.out.println("x es cero");
}
```
```java
int day = 3;
switch (day) {
    case 1:
        System.out.println("Lunes");
        break;
    case 2:
        System.out.println("Martes");
        break;
    case 3:
        System.out.println("Miércoles");
        break;
    default:
        System.out.println("Otro día");
        break;
}
```


### Sentencias de Bucle:

- **for**: Repite un bloque de código un número específico de veces.
- **while**: Repite un bloque de código mientras una condición sea verdadera.
- **do-while**: Similar al while, pero garantiza que el bloque de código se ejecute al menos una vez.
- **for-each**: Simplifica la iteración sobre arrays y colecciones.

Sentencias de Interrupción de Bucle:

- **break**: Termina el bucle más cercano en el que se encuentra.
- **continue**: Salta la iteración actual del bucle y continúa con la siguiente.

```java
for (int i = 0; i < 10; i++) {
    System.out.println(i);
}
```
```java
int x = 0;
while (x < 10) {
    x++;
}

```
```java
int x = 0;
do {
    System.out.println(x);
    x++;
} while (x < 5);
```

### Ejercicios

1. Escribe un programa que lea un número entero y determine si es par o impar.
2. Escribe un programa que lea un número entero y determine si es positivo, negativo o cero.
3. Escribe un programa que lea dos números enteros y determine cuál es mayor.
4. Escribe un programa que imprima los números del 1 al 10 usando un bucle for.
5. Escribe un programa que calcule la suma de los números del 1 al 100 usando un bucle while.
6. Escribe un programa que determine si un número es primo o no.
7. Escribe un programa que imprima todos los números primos entre 1 y 50.
8. Juego de adivinar el número:
- a. Crear una función main que contenga un número en una variable.
- b. El usuario debe adivinar el número elegido. Preguntar al usuario un número mientras no lo acierte.
- c. Si el número es menor informar al usuario: "El número es menor, intenta de nuevo".
- d. Si el número es mayor informar al usuario: "El número es mayor, intenta de nuevo".
- e. Si el usuario acierta el número elegido en a. informar "Ganaste" y finalizar la aplicación.

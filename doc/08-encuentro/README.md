### Introducción a Arrays en Java

Un array es una estructura de datos que almacena una colección de elementos del mismo tipo. Los arrays en Java son objetos que pueden almacenar un número fijo de elementos de un tipo específico. Aquí hay algunos conceptos clave sobre arrays en Java:

Declaración de Arrays:
Un array se declara especificando el tipo de datos de sus elementos seguido por corchetes [] y el nombre del array. Por ejemplo:

```java
int[] numbers;
String[] names;
```

### Creación de Arrays:

Después de declarar un array, debes crear la instancia del array con la palabra clave new y especificar el tamaño del array (el número de elementos que puede contener). Por ejemplo:

```java
numbers = new int[5]; // Crea un array de enteros con 5 elementos
names = new String[10]; // Crea un array de cadenas con 10 
```

## Inicialización de Arrays:

Puedes inicializar un array al momento de la declaración usando una lista de inicialización entre llaves {}:

```java
int[] numbers = {1, 2, 3, 4, 5};
String[] names = {"Alice", "Bob", "Charlie"};
Acceso a Elementos del Array:
```

Los elementos del array se pueden acceder usando su índice. Los índices de los arrays en Java comienzan en 0. Por ejemplo:

```java
int firstNumber = numbers[0]; // Accede al primer elemento del array
String firstName = names[0]; // Accede al primer nombre del array

numbers[2] = 10; // Cambia el tercer elemento del array a 10
names[1] = "David"; // Cambia el segundo nombre del array a "David"
```

## Longitud del Array:

Puedes obtener la longitud del array usando el atributo length:

```java

int length = numbers.length; // Obtiene la longitud del array numbers
Iteración sobre Arrays:
```

Puedes iterar sobre los elementos de un array usando un bucle for:

```java
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}

// También puedes usar un bucle for-each
for (int number : numbers) {
    System.out.println(number);
}
```

## Ejemplo Completo
Aquí tienes un ejemplo completo que demuestra cómo declarar, crear, inicializar y acceder a un array en Java:

```java
public class ArrayExample {
    public static void main(String[] args) {
        // Declarar y crear un array de enteros
        int[] numbers = new int[5];
        
        // Inicializar el array
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        
        // Acceder a elementos del array
        System.out.println("El primer número es: " + numbers[0]);
        System.out.println("El último número es: " + numbers[numbers.length - 1]);
        
        // Iterar sobre el array
        System.out.println("Todos los números en el array:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
```

### Notas Adicionales

Los arrays en Java tienen un tamaño fijo, una vez que se crea un array, su tamaño no puede cambiar.
Si intentas acceder a un índice fuera del rango del array (menor que 0 o mayor o igual que length), Java lanzará una excepción ArrayIndexOutOfBoundsException.
Los arrays pueden ser multidimensionales, es decir, puedes tener arrays de arrays (por ejemplo, una matriz bidimensional).
Espero que esta introducción te sea útil. Si tienes alguna pregunta adicional o necesitas más detalles, ¡no dudes en preguntar!



### Ejercicio 1: Suma de Elementos de un Array

Escribe un programa que cree un array de enteros con los valores {1, 2, 3, 4, 5}, y luego calcule y muestre la suma de todos los elementos del array.

```java
public class SumArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        System.out.println("La suma de los elementos del array es: " + sum);
    }
}
```

### Ejercicio 2: Encontrar el Valor Máximo en un Array

Escribe un programa que cree un array de enteros y encuentre el valor máximo dentro del array.

```java

public class MaxValueArray {
    public static void main(String[] args) {
        int[] numbers = {23, 45, 67, 89, 12, 34};
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("El valor máximo en el array es: " + max);
    }
}
```

## Ejercicio 3: Invertir un Array
Escribe un programa que cree un array de enteros y luego invierta los elementos del array.

```java
public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int length = numbers.length;

        for (int i = 0; i < length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[length - 1 - i];
            numbers[length - 1 - i] = temp;
        }

        System.out.println("Array invertido:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
```

### Ejercicio 4: Contar Ocurrencias de un Valor en un Array

Escribe un programa que cuente cuántas veces aparece un valor específico en un array de enteros.

```java
public class CountOccurrences {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 3, 5, 3};
        int target = 3;
        int count = 0;

        for (int number : numbers) {
            if (number == target) {
                count++;
            }
        }

        System.out.println("El valor " + target + " aparece " + count + " veces en el array.");
    }
}
```

### Ejercicio 5: Promedio de Elementos de un Array

Escribe un programa que calcule y muestre el promedio de los elementos de un array de enteros.

```java
public class AverageArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        double average = (double) sum / numbers.length;

        System.out.println("El promedio de los elementos del array es: " + average);
    }
}
```
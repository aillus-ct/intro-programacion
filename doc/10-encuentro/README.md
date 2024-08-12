## Ejercicio 1: 

### Suma de dos números

Escribe una función llamada suma que reciba dos números enteros como parámetros y retorne la suma de ambos. Luego, crea un método main para probar tu función.

```java
public class Main {
    public static void main(String[] args) {
        int resultado = suma(5, 7);
        System.out.println("La suma es: " + resultado);
    }

    public static int suma(int a, int b) {
        return a + b;
    }
}
```

## Ejercicio 2: 

### Verificar si un número es par

Crea una función llamada esPar que reciba un número entero y devuelva true si el número es par y false si es impar.

```java
public class Main {
    public static void main(String[] args) {
        boolean resultado = esPar(4);
        System.out.println("El número es par: " + resultado);
    }

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}
```
## Ejercicio 3: 
### Calcular factorial

Crea una función llamada factorial que reciba un número entero y devuelva su factorial.

```java
public class Main {
    public static void main(String[] args) {
        int resultado = factorial(5);
        System.out.println("El factorial es: " + resultado);
    }

    public static int factorial(int numero) {
        int resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
```



## Ejercicio 4:
### Maximo de tres números
Escribe un método que tome 3 números enteros como parámetros y devuleva el mayor de los tres

```java
public class MaximoTresNumeros {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 15;

        int max = calcularMaximo(num1, num2, num3);
        System.out.println("El máximo de los tres números es: " + max);
    }

    public static int calcularMaximo(int a, int b, int c) {
        int max = a;  // Asumimos que 'a' es el mayor

        if (b > max) {
            max = b;  // Si 'b' es mayor que 'max', actualizamos 'max'
        }

        if (c > max) {
            max = c;  // Si 'c' es mayor que 'max', actualizamos 'max'
        }

        return max;  // Devolvemos el valor máximo
    }
```


## Ejercicio 5
### Escribe un método en Java que imprime un array de enteros en la consola

```java
public class ImprimirArray {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        imprimirArray(numeros);
    }

    public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
```

## Ejercicio 6

## Escribe un método en Java que calcula y muestra el promedio de los elementos de un array de enteros:

```java
public class PromedioArray {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        mostrarPromedio(numeros);
    }

    public static void mostrarPromedio(int[] array) {
        int suma = 0;

        for (int i = 0; i < array.length; i++) {
            suma += array[i];  // Suma todos los elementos del array
        }

        double promedio = (double) suma / array.length;  // Calcula el promedio

        System.out.println("El promedio de los elementos del array es: " + promedio);
    }
}
```

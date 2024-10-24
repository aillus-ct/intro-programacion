## Tipos de Variables

### Ejemplos vistos en clase

```java
public class PrimitivosEnteros {
    public static void main(String[] args) {

        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo byte corresponde en bytes a " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bits a " + Byte.SIZE);
        System.out.println("valor máximo de un byte: " + Byte.MAX_VALUE);
        System.out.println("valor mínimo de un byte: " + Byte.MIN_VALUE);

        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("tipo short corresponde en bytes a " + Short.BYTES);
        System.out.println("tipo short corresponde en bits a " + Short.SIZE);
        System.out.println("valor máximo de un short: " + Short.MAX_VALUE);
        System.out.println("valor mínimo de un short: " + Short.MIN_VALUE);

        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);

        System.out.println("tipo int corresponde en bytes a " + Integer.BYTES);
        System.out.println("tipo int corresponde en bits a " + Integer.SIZE);
        System.out.println("valor máximo de un int: " + Integer.MAX_VALUE);
        System.out.println("valor mínimo de un int: " + Integer.MIN_VALUE);

        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);

        System.out.println("tipo long corresponde en bytes a " + Long.BYTES);
        System.out.println("tipo long corresponde en bits a " + Long.SIZE);
        System.out.println("valor máximo de un long: " + Long.MAX_VALUE);
        System.out.println("valor mínimo de un long: " + Long.MIN_VALUE);

        var numeroVar = 9223372036854775808f;

    }
}
```

```java
public class PrimitivosFloat {
    public static void main(String[] args) {

        float realFloat = 0.00000000015f; //1.5e-10f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("float corresponde en bytes a = " + Float.BYTES);
        System.out.println("float corresponde en bits a = " + Float.SIZE);
        System.out.println("máximo valor para float = " + Float.MAX_VALUE);
        System.out.println("mínimo valor para float = " + Float.MIN_VALUE);

        double realDouble = 3.4028235E39;
        System.out.println("realDouble = " + realDouble);
        System.out.println("double corresponde en bytes a = " + Double.BYTES);
        System.out.println("double corresponde en bits a = " + Double.SIZE);
        System.out.println("máximo valor para double = " + Double.MAX_VALUE);
        System.out.println("mínimo valor para double = " + Double.MIN_VALUE);

        float varFlotante = 3.1416f;
        System.out.println("varFlotante = " + varFlotante);
    }
}
```

```java

public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = '\u0040';
        char decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter: " + (decimal == caracter));

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter: " + (simbolo == caracter));

        char espacio = '\u0020';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';

        System.out.println("char corresponde en bytes:" + System.lineSeparator() +
        Character.BYTES);
        System.out.println("Char corresponde en bits = " + Character.SIZE);
        System.out.println("Character.MIN_VALUE = " + Character.MIN_VALUE);
        System.out.println("Character.MAX_VALUE = " + Character.MAX_VALUE);
    }
}

```

```java

public class PrimitivosBoolean {
    public static void main(String[] args) {

        boolean datoLogico = true;
        System.out.println("datoLogico = " + datoLogico);

        double d = 98765.43e-3; // 98.76543
        System.out.println("d = " + d);

        float f = 1.2345e2f; // 123.45
        System.out.println("f = " + f);

        datoLogico = d < f;
        System.out.println("datoLogico = " + datoLogico);

        boolean esIgual = (3-2 == 1);
        System.out.println("esIgual = " + esIgual);
    }
}
```

## Strings

La clase String en Java es una de las más utilizadas y esenciales en el desarrollo de software. Se emplea para trabajar con cadenas de caracteres, que son secuencias de texto. Aquí tienes una introducción a la clase String:

### ¿Qué es un String?
En Java, un String es un objeto que representa una secuencia de caracteres. A diferencia de algunos otros lenguajes de programación, en Java las cadenas son objetos, no tipos primitivos.

### Creación de Strings
Las cadenas en Java pueden ser creadas de varias formas:

- Literals de cadena: La forma más común de crear una cadena es utilizando literales de cadena, que son secuencias de caracteres encerradas entre comillas dobles.


```java
String saludo = "Hola, mundo!";
```

- Constructor de la clase String: También se pueden crear utilizando el constructor de la clase String.

```java
String saludo = new String("Hola, mundo!");
```

```java
public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String curso2 = new String("Programación Java");

        boolean esIgual = curso == curso2;
        System.out.println("curso == curso2 = " + esIgual);

        esIgual = curso.equals(curso2);
        System.out.println("curso.equals(curso2) = " + esIgual);

        String curso3 = "Programación Java";
        esIgual = curso == curso3;
        System.out.println("curso == curso3 = " + esIgual);

    }
}
```


```java
public class EjemploStringMetodos {
    public static void main(String[] args) {

        String nombre = "Andres";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Andres\") = " + nombre.equals("Andres"));
        System.out.println("nombre.equals(\"andres\") = " + nombre.equals("andres"));
        System.out.println("nombre.equalsIgnoreCase(\"andres\") = " +
        nombre.equalsIgnoreCase("andres"));
        System.out.println("nombre.compareTo(\"Andres\") = " + nombre.compareTo("Andres"));
        System.out.println("nombre.compareTo(\"Aaron\") = " + nombre.compareTo("Aaron"));

        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(nombre.length()-1) = " +
        nombre.charAt(nombre.length()-1));

        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1, 4) = " + nombre.substring(1, 4));
        System.out.println("nombre.substring(nombre.length()-2) = " +
        nombre.substring(nombre.length()-2));

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas = " + trabalenguas.replace("a", "."));
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));
        System.out.println("trabalenguas.indexOf('t') = " + trabalenguas.indexOf("lenguas"));
        System.out.println("trabalenguas.contains('t') = " + trabalenguas.contains("lenguas"));
        System.out.println("trabalenguas.startsWith(\"tr\") = " + trabalenguas.startsWith("tr"));
        System.out.println("trabalenguas.endsWith(\"s\") = " + trabalenguas.endsWith("s"));
        System.out.println(" trabalenguas ");
        System.out.println(" trabalenguas ".trim());

    }
}

```

## Entrada por consola

```java
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero:");
        int numeroDecimal = 0;
        numeroDecimal = scanner.nextInt();
        
        System.out.println("numeroDecimal = " + numeroDecimal);

    }
}
```

## Librerías en Java

Una librería en Java es una colección de clases, interfaces y métodos predefinidos que los desarrolladores pueden utilizar para simplificar el desarrollo de aplicaciones. Las librerías proporcionan funcionalidades reutilizables que resuelven problemas comunes, lo que permite a los desarrolladores enfocarse en la lógica específica de sus aplicaciones sin tener que reinventar la rueda.

Tipos de Librerías

1. Librerías Estándar de Java: Estas vienen incluidas con el JDK (Java Development Kit) y cubren una amplia gama de funcionalidades, como colecciones, manipulación de cadenas, entrada/salida (I/O), concurrencia, y más. Por ejemplo:

- java.util: Contiene clases de utilidades como ArrayList, HashMap, Date, etc.
- java.io: Proporciona clases para la entrada/salida, como File, InputStream, OutputStream, etc.
- java.math: Contiene clases para realizar operaciones matemáticas de alta precisión, como BigInteger y BigDecimal.

2. Librerías de Terceros: Estas son creadas por la comunidad de desarrolladores o empresas y pueden ser añadidas a un proyecto para extender las capacidades del lenguaje. Ejemplos incluyen Apache Commons, Google Guava, y muchas más.

## Métodos nextInt, nextFloat, etc.

Estos métodos son parte de la clase Scanner en el paquete java.util. La clase Scanner se utiliza para leer entrada de diferentes fuentes, como la consola (teclado), archivos, etc. 

Métodos más comunes:

- nextInt(): Lee el siguiente valor entero (int) de la entrada.
- nextFloat(): Lee el siguiente valor de punto flotante (float) de la entrada.
- nextDouble(): Lee el siguiente valor de punto flotante (double) de la entrada.
- nextLine(): Lee la siguiente línea completa de la entrada como una cadena (String).
- nextBoolean(): Lee el siguiente valor booleano de la entrada.

```java
import java.util.Scanner;

public class EjemploScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer un entero
        System.out.print("Introduce un entero: ");
        int entero = scanner.nextInt();
        System.out.println("Entero introducido: " + entero);

        // Leer un flotante
        System.out.print("Introduce un número de punto flotante: ");
        float flotante = scanner.nextFloat();
        System.out.println("Flotante introducido: " + flotante);

        // Leer un doble
        System.out.print("Introduce un número doble: ");
        double doble = scanner.nextDouble();
        System.out.println("Doble introducido: " + doble);

        // Limpiar el buffer de entrada
        scanner.nextLine();

        // Leer una línea de texto
        System.out.print("Introduce una línea de texto: ");
        String linea = scanner.nextLine();
        System.out.println("Línea introducida: " + linea);

        // Leer un booleano
        System.out.print("Introduce verdadero o falso: ");
        boolean booleano = scanner.nextBoolean();
        System.out.println("Booleano introducido: " + booleano);

        scanner.close();
    }
}

```
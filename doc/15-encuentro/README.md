### Excepciones en JAVA

En Java, una excepción es un evento que ocurre durante la ejecución de un programa y que interrumpe el flujo normal de instrucciones. Las excepciones son usadas para manejar situaciones excepcionales, como errores o condiciones inesperadas.

### Manejo de Excepciones en Java
Para manejar excepciones en Java, utilizamos los bloques try, catch y finally:

try: Contiene el código que puede generar una excepción.
catch: Captura y maneja la excepción que ha sido lanzada.
finally: (opcional) Contiene código que se ejecuta siempre, ya sea que se haya lanzado una excepción o no.

### Ejemplo básico de manejo de excepciones

```java
public class EjemploExcepcion {
    public static void main(String[] args) {
        try {
            // Código que puede lanzar una excepción
            int resultado = 10 / 0; // Esto causará una ArithmeticException
        } catch (ArithmeticException e) {
            // Código para manejar la excepción
            System.out.println("Se ha producido un error: " + e.getMessage());
        } finally {
            // Código que se ejecuta siempre
            System.out.println("Este bloque siempre se ejecuta.");
        }
    }
}
```

### En el ejemplo anterior:

- El bloque try intenta dividir un número por cero, lo cual causa una ArithmeticException.
- El bloque catch captura esa excepción y ejecuta el código para manejarla (imprimir un mensaje en la consola).
- El bloque finally se ejecuta siempre, sin importar si hubo una excepción o no.

### Beneficios de usar excepciones
- Manejo centralizado de errores: Permite manejar errores en un solo lugar.
- Claridad del código: Mejora la legibilidad del código al separar la lógica normal de la de manejo de errores.
- Propagación de errores: Las excepciones pueden propagarse en la jerarquía de llamadas, lo que permite que un método en la parte superior maneje todos los errores.

### Ejemplo de mextInt con manejo de excepciones

Supongamos que el usuario ingresa un valor que no es un número entero (por ejemplo, una letra o un carácter especial). En este caso, el método nextInt() lanzará una excepción InputMismatchException. Veamos cómo podemos manejar este caso:

```java
import java.util.Scanner;
import java.util.InputMismatchException;

public class EjemploNextIntConExcepcion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;

        while (true) {
            try {
                System.out.print("Por favor, ingrese un número entero: ");
                numero = scanner.nextInt(); // Intentar leer un número entero
                break; // Si no hay excepción, salir del bucle
            } catch (InputMismatchException e) {
                System.out.println("Error: ¡Debe ingresar un número entero!");
                scanner.next(); // Limpiar la entrada no válida del escáner
            }
        }

        System.out.println("El número ingresado es: " + numero);
        scanner.close();
    }
}

```
En este ejemplo:

- Usamos un bucle while para seguir pidiendo la entrada hasta que el usuario ingrese un número entero válido.
- Si se produce una InputMismatchException, se muestra un mensaje de error y se limpia la entrada no válida con scanner.next().

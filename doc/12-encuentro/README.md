### Ejercicio 1: Clase "Persona"

#### Objetivo: Crear una clase simple que represente a una persona y trabajar con sus atributos y métodos.

#### Instrucciones:
1. Crea una clase llamada Persona con los siguientes atributos:
- nombre (tipo String)
- edad (tipo int)
- genero (tipo String)

2. Implementa los siguientes métodos en la clase Persona:
- Un constructor que inicialice los atributos.
- Métodos get y set para cada atributo.
- Un método esMayorDeEdad() que devuelva true si la persona tiene 18 años o más, y false en caso contrario.
- Un método mostrarInformacion() que imprima en consola el nombre, la edad y el género de la persona.
- En la clase principal, crea un objeto de la clase Persona, asigna valores a sus atributos y muestra su información utilizando el método mostrarInformacion().

### Ejercicio 2: Clase "Círculo"

#### Objetivo: Trabajar con la representación de un círculo en geometría y calcular su área y circunferencia.

#### Instrucciones:
1. Crea una clase llamada Circulo con los siguientes atributos:
- radio (tipo double)

2. Implementa los siguientes métodos en la clase Circulo:
- Un constructor que inicialice el radio.
- Métodos get y set para el atributo radio.
- Un método calcularArea() que devuelva el área del círculo.
- Un método calcularCircunferencia() que devuelva la circunferencia del círculo.
- Un método mostrarInformacion() que imprima en consola el radio, el área y la circunferencia del círculo.
- En la clase principal, crea dos objetos de la clase Circulo con diferentes radios, y muestra la información de cada uno utilizando el - método mostrarInformacion().

#### Nota: Usa las fórmulas:
- Área = π * radio * radio
- Circunferencia = 2 * π * radio
- Puedes usar Math.PI para obtener el valor de π.

### Ejercicio 3: Clase "CuentaBancaria"

#### Objetivo: Simular operaciones básicas en una cuenta bancaria utilizando encapsulamiento y métodos específicos.

#### Instrucciones:
1. Crea una clase llamada CuentaBancaria con los siguientes atributos:
- numeroCuenta (tipo String)
- saldo (tipo double)
- titular (tipo String)

2. Implementa los siguientes métodos en la clase CuentaBancaria:
- Un constructor que inicialice el número de cuenta, el saldo y el titular.
- Métodos get para los atributos.
- Un método depositar(double monto) que aumente el saldo de la cuenta en el monto especificado.
- Un método retirar(double monto) que disminuya el saldo de la cuenta en el monto especificado, solo si hay suficiente saldo; en caso contrario, debe mostrar un mensaje de error.
- Un método mostrarInformacion() que imprima en consola el número de cuenta, el titular y el saldo actual de la cuenta.
- En la clase principal, crea un objeto de la clase CuentaBancaria, realiza varias operaciones de depósito y retiro, y muestra la información de la cuenta después de cada operación.

### Ejercicio 4: Gestión de Personas

#### Objetivo: Crear un programa que permita al usuario ingresar una lista de personas y luego calcule el promedio de edad, identifique a la persona de mayor edad y a la persona de menor edad.

#### Instrucciones:

1. Crea una clase llamada Persona con los siguientes atributos:
- nombre (tipo String)
- edad (tipo int)

2. Métodos de la Clase Persona:
- Un constructor que inicialice los atributos nombre y edad.
- Métodos get y set para cada atributo.
- Un método imprimeNombreEdad() que devuelva una representación en cadena del objeto Persona, mostrando el nombre y la edad.

3. Clase Principal:
- En la clase principal, crea un bucle que permita al usuario ingresar varias personas.
- Almacena las personas en un Array[]
- El bucle debe continuar hasta que el usuario decida que no quiere ingresar más personas.
- Una vez finalizada la entrada de datos, el programa debe:
    - Calcular y mostrar el promedio de las edades.
    - Identificar y mostrar el nombre de la persona de mayor edad.
    - Identificar y mostrar el nombre de la persona de menor edad.

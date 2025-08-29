package Clases;

/*
¿Qué es un ArrayList?
Un ArrayList es una lista dinámica que puede crecer o reducir su tamaño automáticamente. 
A diferencia de los arrays tradicionales (int[]), no tenés que especificar su tamaño al inicio.

Sintaxis básica:

import java.util.ArrayList;

int nombre[5] = {1,2,3,4,5};
nombre[0] = "Guillermo";

ArrayList<String> nombres = new ArrayList<>();
También puede usarse con otros tipos:

ArrayList<Integer>

ArrayList<Double>

ArrayList<CuentaContable> (clases personalizadas)

Métodos más importantes de ArrayList

Método	                        Qué hace	                                        Ejemplo

add(elemento)	                Agrega un elemento al final	                        lista.add("Juan")
get(indice)	                    Devuelve el elemento en esa posición	            lista.get(0)
set(indice, nuevoElemento)	    Reemplaza un elemento en una posición	            lista.set(1, "Ana")
remove(indice)	                Elimina el elemento en esa posición	                lista.remove(0)
remove(Object)	                Elimina la primera ocurrencia del objeto	        lista.remove("Juan")
size()	                        Devuelve la cantidad de elementos	                lista.size()
clear()	                        Elimina todos los elementos	                        lista.clear()
contains(elemento)	            Devuelve true si el elemento está en la lista	    lista.contains("Pedro")
isEmpty()	                    Devuelve true si la lista está vacía	            lista.isEmpty()
indexOf(elemento)	            Devuelve el índice del primer elemento encontrado	lista.indexOf("Juan")

*/

import java.util.ArrayList;

public class EjemploArrayList {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();

        // Agregar elementos
        nombres.add("Juan");
        nombres.add("Ana");
        nombres.add("Luis");

        
        // Mostrar todos
        System.out.println("Nombres:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        
        // Obtener uno
        System.out.println("\nEl primer nombre es: " + nombres.get(0));

        // Modificar uno
        nombres.set(1, "Carla");

        // Eliminar uno
        nombres.remove("Luis");

        // Verificar existencia
        if (nombres.contains("Juan")) {
            System.out.println("\nJuan está en la lista.");
        }

        // Tamaño de la lista
        System.out.println("Cantidad de nombres: " + nombres.size());
        
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(5);
        numeros.add(4);
        numeros.add(3);

        for(Integer numero : numeros) { 
            System.out.println(numero);
        }

        System.out.println(numeros.get(0));

        for(int i = 0; i < numeros.size(); i++){
            System.out.println(numeros.get(i));
        }
    }
}
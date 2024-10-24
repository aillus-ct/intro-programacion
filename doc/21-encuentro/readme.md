
# Trabajo Final - Taller de Java

Este repositorio contiene tres ejercicios propuestos para el trabajo final del taller de Java. Los estudiantes podrán elegir uno de estos proyectos para desarrollar y aplicar los conocimientos adquiridos a lo largo del curso.

## 1. Sistema de Gestión de Tareas (To-Do List)
Este ejercicio consiste en crear una aplicación sencilla que permita gestionar una lista de tareas. Se podrán agregar, editar, marcar como completadas o eliminar tareas.

### Requisitos:
- Una clase `Tarea` con los siguientes atributos:
  - `id`
  - `nombre`
  - `descripcion`
  - `estado` (completada o pendiente)
- Crear métodos para:
  - Agregar una nueva tarea.
  - Editar una tarea existente (nombre y descripción).
  - Marcar una tarea como completada.
  - Eliminar una tarea.
- Mostrar las tareas pendientes y completadas por separado.
- Agregar persistencia de datos usando archivos o una base de datos (con JDBC).
- Crear una interfaz gráfica usando **Java Swing** para la interacción del usuario.

---

## 2. Gestión de Inventario (ABM - Altas, Bajas, Modificaciones)
Este ejercicio es un sistema básico de gestión de inventario de productos. Permite gestionar productos con operaciones de alta, baja y modificación.

### Requisitos:
- Una clase `Producto` con los siguientes atributos:
  - `id`
  - `nombre`
  - `precio`
  - `cantidad`
- Crear métodos para:
  - Agregar un nuevo producto al inventario.
  - Modificar un producto existente (nombre, precio, cantidad).
  - Eliminar un producto del inventario.
  - Mostrar todos los productos.
- Integrar JDBC para conectar el sistema con una base de datos (MySQL).
- Usar **Java Swing** para permitir a los usuarios gestionar los productos desde una interfaz gráfica.

---

## 3. Agenda de Contactos
Este proyecto consiste en desarrollar una agenda de contactos donde se pueda agregar, editar, eliminar y buscar contactos.

### Requisitos:
- Una clase `Contacto` con los siguientes atributos:
  - `id`
  - `nombre`
  - `telefono`
  - `email`
- Métodos para:
  - Agregar un nuevo contacto.
  - Editar un contacto (nombre, teléfono, email).
  - Eliminar un contacto.
  - Buscar un contacto por nombre o teléfono.
- Almacenar los contactos en una base de datos utilizando **JDBC**.
- Añadir una interfaz gráfica con **Java Swing** para buscar y gestionar los contactos.

---

## Detalles Comunes:
- Se recomienda usar una arquitectura **orientada a objetos** y dividir las clases en módulos coherentes (por ejemplo, separar la lógica de la interfaz gráfica y de la base de datos).
- **Opcional**: Incluir un sistema básico de validaciones (por ejemplo, no permitir duplicados en la lista de contactos o en el inventario de productos).

## Breve historia del almacenamiento de datos

Antes de la era de las computadoras, la información se almacenaba en archivos físicos, como registros en papel. A medida que las computadoras se volvieron más populares, surgió la necesidad de almacenar datos digitales de manera más organizada y eficiente. Esto dio lugar al desarrollo de los primeros sistemas de gestión de bases de datos (DBMS, por sus siglas en inglés).

Las bases de datos relacionales, basadas en el modelo relacional propuesto por Edgar Codd en la década de 1970, se convirtieron en la solución predominante para el almacenamiento y la manipulación de datos estructurados. SQL, el lenguaje estándar para trabajar con bases de datos relacionales, se desarrolló a partir de este modelo.

## Motores de bases de datos

Un motor de base de datos, también conocido como sistema de gestión de bases de datos (DBMS), es un software que proporciona funcionalidades para crear, mantener y acceder a bases de datos. Algunos de los motores de bases de datos más populares son:

- **MySQL**: Motor de base de datos de código abierto, comúnmente utilizado en aplicaciones web.
- **PostgreSQL**: Motor de base de datos de código abierto, conocido por su fuerte cumplimiento de las características SQL.
- **Microsoft SQL Server**: Motor de base de datos comercial de Microsoft, ampliamente adoptado en entornos empresariales.
- **Oracle Database**: Motor de base de datos comercial de Oracle, uno de los más utilizados en grandes organizaciones.
- **SQLite**: Motor de base de datos de código abierto, pequeño y portable, utilizado en aplicaciones móviles y de escritorio.

## Tipos de bases de datos

Además de las bases de datos relacionales, existen otros tipos de sistemas de gestión de bases de datos, cada uno con sus propias características y casos de uso:

- **Bases de datos relacionales**: Modelan los datos en tablas con filas y columnas, donde las relaciones entre los datos se definen mediante claves. Ejemplos: MySQL, PostgreSQL, SQLite.
- **Bases de datos NoSQL**: Ofrecen un modelo de datos no relacional, como documentos, grafos o pares clave-valor. Ejemplos: MongoDB, Cassandra, Neo4j.
- **Bases de datos en memoria**: Almacenan los datos en la memoria RAM, lo que las hace muy rápidas, pero menos persistentes. Ejemplos: Redis, Memcached.
- **Bases de datos de series temporales**: Optimizadas para almacenar y consultar datos con marca de tiempo. Ejemplos: InfluxDB, TimescaleDB.
- **Bases de datos de objetos**: Modelan los datos como objetos, en lugar de tablas. Ejemplos: db4o, Versant.

## SQL y las bases de datos relacionales

SQL (Structured Query Language) es el lenguaje de programación estándar utilizado para administrar y manipular bases de datos relacionales. SQL consta de varios componentes clave:

- **DDL (Data Definition Language)**: Comandos para crear, modificar y eliminar objetos de la base de datos.
- **DML (Data Manipulation Language)**: Comandos para insertar, actualizar, eliminar y consultar datos almacenados en las tablas.
- **DCL (Data Control Language)**: Comandos para controlar el acceso y los permisos de los usuarios en la base de datos.

## Operaciones DDL

Para crear, modificar y eliminar objetos de la base de datos, utilizamos los comandos DDL:

### Creación de tablas
```sql
CREATE TABLE usuarios (
    id INT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    email VARCHAR(50) UNIQUE,
    edad INT CHECK (edad >= 18)
);
```

### Modificación de tablas
```sql
ALTER TABLE usuarios
ADD telefono VARCHAR(20);

ALTER TABLE usuarios
DROP COLUMN edad;

ALTER TABLE usuarios
MODIFY COLUMN email VARCHAR(100);
```

### Eliminación de tablas
```sql
DROP TABLE usuarios;
```

## Operaciones DML

Para insertar, actualizar, eliminar y consultar datos, utilizamos los comandos DML:

### Inserción de datos
```sql
INSERT INTO usuarios (nombre, email, edad)
VALUES ('Juan Pérez', 'juan.perez@example.com', 28);
```

### Actualización de datos
```sql
UPDATE usuarios
SET email = 'nuevo.email@example.com'
WHERE id = 1;
```

### Eliminación de datos
```sql
DELETE FROM usuarios
WHERE id = 2;
```

### Consulta de datos
```sql
SELECT nombre, email
FROM usuarios
WHERE edad > 30;
```

## Operaciones DCL

Para controlar el acceso y los permisos de los usuarios, utilizamos los comandos DCL:

### Creación de usuarios
```sql
CREATE USER 'nuevo_usuario'@'localhost' IDENTIFIED BY 'contraseña123';
```

### Otorgamiento de permisos
```sql
GRANT SELECT, INSERT, UPDATE
ON usuarios
TO 'nuevo_usuario'@'localhost';
```

### Revocación de permisos
```sql
REVOKE INSERT, UPDATE
ON usuarios
FROM 'nuevo_usuario'@'localhost';
```

## ORMs y Clientes SQL

Los **ORMs (Object-Relational Mapping)** son herramientas que permiten interactuar con la base de datos de manera más orientada a objetos, en lugar de escribir consultas SQL directamente. Algunos ejemplos populares de ORMs son:

- **Django ORM** (Python)
- **Entity Framework** (C#)
- **Hibernate** (Java)

Los **clientes SQL** son aplicaciones que permiten conectarse y ejecutar consultas SQL de forma interactiva. Algunos ejemplos son:

- **DBeaver**
- **pgAdmin**
- **Azure Data Studio**

Estos clientes pueden ser útiles para explorar y depurar tu base de datos durante el desarrollo.

## Ejercicios de DML

1. Inserta tres nuevos usuarios con diferentes nombres, edades y correos electrónicos.
2. Actualiza la edad de un usuario existente.
3. Elimina un usuario de la tabla.
4. Consulta todos los usuarios cuya edad sea mayor a 25 años.
5. Consulta los nombres y correos de los usuarios cuya edad esté entre 20 y 40 años.

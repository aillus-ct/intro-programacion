# Ejemplos básicos de SQL

## SELECT

### 1. SELECT con *
Selecciona todas las columnas de una tabla.

```sql
SELECT * FROM empleados;
```

### 2. SELECT con columnas específicas
Selecciona columnas específicas de una tabla.

```sql
SELECT nombre, apellido, salario FROM empleados;
```

## WHERE
Filtra los resultados basados en una condición.

```sql
SELECT nombre, apellido FROM empleados WHERE departamento = 'Ventas';
```

## LIKE
Busca un patrón específico en una columna.

```sql
SELECT nombre, apellido FROM empleados WHERE apellido LIKE 'G%';
```

## >=
Compara valores numéricos o fechas.

```sql
SELECT nombre, salario FROM empleados WHERE salario >= 50000;
```

## BETWEEN
Selecciona valores dentro de un rango.

```sql
SELECT nombre, fecha_contratacion FROM empleados WHERE fecha_contratacion BETWEEN '2020-01-01' AND '2020-12-31';
```

## ORDER BY
Ordena los resultados por una o más columnas.

```sql
SELECT nombre, apellido, salario FROM empleados ORDER BY salario DESC;
```

## GROUP BY
Agrupa filas que tienen los mismos valores en columnas especificadas.

```sql
SELECT departamento, COUNT(*) as numero_empleados
FROM empleados
GROUP BY departamento;
```

## Funciones de Agregación

### COUNT
Cuenta el número de filas o valores no nulos en un grupo.

```sql
SELECT departamento, COUNT(*) as total_empleados
FROM empleados
GROUP BY departamento;
```

### MAX
Devuelve el valor máximo de un conjunto de valores.

```sql
SELECT departamento, MAX(salario) as salario_maximo
FROM empleados
GROUP BY departamento;
```

### SUM
Calcula la suma de un conjunto de valores.

```sql
SELECT departamento, SUM(salario) as suma_salarios
FROM empleados
GROUP BY departamento;
```

### Ejemplo combinado
Este ejemplo muestra cómo se pueden combinar varias funciones de agregación en una sola consulta:

```sql
SELECT 
    departamento,
    COUNT(*) as total_empleados,
    MAX(salario) as salario_maximo,
    MIN(salario) as salario_minimo,
    AVG(salario) as salario_promedio,
    SUM(salario) as suma_salarios
FROM empleados
GROUP BY departamento
HAVING COUNT(*) > 5
ORDER BY suma_salarios DESC;
```

En este ejemplo:
- Agrupamos por departamento
- Contamos el número de empleados
- Encontramos el salario máximo y mínimo
- Calculamos el salario promedio
- Sumamos todos los salarios
- Usamos HAVING para filtrar solo departamentos con más de 5 empleados
- Ordenamos los resultados por la suma total de salarios en orden descendente

## Estructura y Datos de Ejemplo

Para los ejemplos utilizados en este documento, vamos a crear las siguientes tablas: `empleados`, `departamentos`, y `proyectos`. A continuación, se presentan los comandos CREATE TABLE e INSERT para cada una de ellas.

### Tabla Empleados

```sql
CREATE TABLE empleados (
    id INT PRIMARY KEY,
    nombre VARCHAR(50),
    apellido VARCHAR(50),
    salario DECIMAL(10, 2),
    fecha_contratacion DATE,
    id_departamento INT
);

INSERT INTO empleados (id, nombre, apellido, salario, fecha_contratacion, id_departamento) VALUES
(1, 'Juan', 'Pérez', 50000.00, '2019-05-15', 1),
(2, 'María', 'García', 55000.00, '2020-02-20', 2),
(3, 'Carlos', 'López', 48000.00, '2018-11-01', 1),
(4, 'Ana', 'Martínez', 52000.00, '2021-03-10', 3),
(5, 'Pedro', 'Sánchez', 51000.00, '2020-07-22', 2),
(6, 'Laura', 'Rodríguez', 53000.00, '2019-09-05', 3),
(7, 'Miguel', 'Fernández', 49000.00, '2021-01-15', 1),
(8, 'Isabel', 'Gómez', 54000.00, '2020-11-30', 2);
```

### Tabla Departamentos

```sql
CREATE TABLE departamentos (
    id INT PRIMARY KEY,
    nombre_departamento VARCHAR(50)
);

INSERT INTO departamentos (id, nombre_departamento) VALUES
(1, 'Ventas'),
(2, 'Marketing'),
(3, 'Recursos Humanos'),
(4, 'Tecnología');
```

### Tabla Proyectos

```sql
CREATE TABLE proyectos (
    id INT PRIMARY KEY,
    nombre_proyecto VARCHAR(100),
    id_empleado INT
);

INSERT INTO proyectos (id, nombre_proyecto, id_empleado) VALUES
(1, 'Campaña Primavera', 2),
(2, 'Optimización de Ventas', 1),
(3, 'Reclutamiento IT', 4),
(4, 'Análisis de Mercado', 5),
(5, 'Desarrollo App Móvil', NULL);
```

## JOINs

### INNER JOIN
Devuelve registros cuando hay coincidencias en ambas tablas.

```sql
SELECT e.nombre, d.nombre_departamento
FROM empleados e
INNER JOIN departamentos d ON e.id_departamento = d.id;
```

### LEFT JOIN
Devuelve todos los registros de la tabla izquierda y los registros coincidentes de la tabla derecha.

```sql
SELECT e.nombre, p.nombre_proyecto
FROM empleados e
LEFT JOIN proyectos p ON e.id = p.id_empleado;
```

### RIGHT JOIN
Devuelve todos los registros de la tabla derecha y los registros coincidentes de la tabla izquierda.

```sql
SELECT d.nombre_departamento, e.nombre
FROM empleados e
RIGHT JOIN departamentos d ON e.id_departamento = d.id;
```

### FULL JOIN
Devuelve resultados cuando hay una coincidencia en una de las tablas.

```sql
SELECT e.nombre, d.nombre_departamento
FROM empleados e
FULL JOIN departamentos d ON e.id_departamento = d.id;
```

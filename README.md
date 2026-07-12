Francisca Villarroel
Duoc UC Modalidad online
Analista Programador Computacional
Desarrollo orientado a objetos

# LlanquihueTourApp

## Descripción

**LlanquihueTourApp** es una aplicación desarrollada en **Java** para gestionar información relacionada con servicios turísticos de la Región de Los Lagos. El sistema permite administrar personas, guías turísticos, operadores, proveedores y distintos tipos de tours mediante programación orientada a objetos, utilizando herencia, polimorfismo, interfaces y manejo de archivos.

Este proyecto fue desarrollado como parte de la asignatura **Fundamentos de Programación 2**, aplicando los principales conceptos de Programación Orientada a Objetos (POO).

---

## Objetivos

* Aplicar los principios de Programación Orientada a Objetos.
* Utilizar herencia, encapsulamiento y polimorfismo.
* Implementar interfaces en Java.
* Gestionar información mediante archivos CSV.
* Organizar el código utilizando paquetes y clases especializadas.

---

# Tecnologías utilizadas

* Java
* IntelliJ IDEA Community Edition
* Maven
* Programación Orientada a Objetos (POO)

---

# Estructura del proyecto

```
src
└── main
    ├── java
    │   ├── data
    │   │   ├── GestorDatos.java
    │   │   ├── GestorEntidades.java
    │   │   └── GestorServicios.java
    │   │
    │   ├── model
    │   │   ├── Persona.java
    │   │   ├── Direccion.java
    │   │   ├── GuiaTuristico.java
    │   │   ├── OperadorTuristico.java
    │   │   ├── Proveedor.java
    │   │   ├── ServicioTuristico.java
    │   │   ├── Tour.java
    │   │   ├── ExcursionCultural.java
    │   │   ├── PaseoLacustre.java
    │   │   ├── RutaGastronomica.java
    │   │   └── Registrable.java
    │   │
    │   ├── service
    │   │   └── GestionPersonas.java
    │   │
    │   └── ui
    │       ├── Main.java
    │       └── Menu.java
    │
    └── resources
        ├── guias.csv
        └── personas.csv
```

---

# Descripción de las clases

## data

### GestorDatos

Administra la lectura de archivos CSV para cargar la información del sistema.

### GestorEntidades

Interface que define las operaciones básicas para registrar y administrar entidades del sistema.

### GestorServicios

Gestiona los distintos servicios turísticos disponibles.

---

## model

### Persona

Clase base que representa una persona.

Atributos principales:

* Rut
* Nombre
* Teléfono
* Correo
* Dirección

---

### Direccion

Representa la dirección de una persona.

Incluye:

* Calle
* Número
* Comuna
* Región

---

### GuiaTuristico

Hereda de Persona.

Agrega información como:

* Especialidad
* Años de experiencia

---

### OperadorTuristico

Representa a un operador encargado de administrar tours y servicios.

---

### Proveedor

Representa a los proveedores asociados a la actividad turística.

---

### ServicioTuristico

Clase base para los distintos servicios que ofrece la aplicación.

---

### Tour

Representa un tour turístico.

Contiene información sobre:

* Nombre
* Precio
* Duración
* Servicios asociados

---

### ExcursionCultural

Especialización de Tour enfocada en actividades culturales.

---

### PaseoLacustre

Especialización de Tour orientada a recorridos por el lago.

---

### RutaGastronomica

Especialización de Tour enfocada en experiencias gastronómicas.

---

### Registrable

Interface que establece el comportamiento que deben implementar las clases que pueden registrarse dentro del sistema.

---

## service

### GestionPersonas

Administra las operaciones relacionadas con personas y guías turísticos.

Entre ellas:

* Registrar personas
* Buscar registros
* Almacenar información

---

## ui

### Main

Punto de entrada del programa.

Se encarga de:

* Crear el gestor principal.
* Cargar los datos desde archivos CSV.
* Iniciar el menú de la aplicación.

---

### Menu

Implementa el menú interactivo desde consola para acceder a las funcionalidades del sistema.

---

# Recursos utilizados

El proyecto utiliza archivos almacenados en:

```
src/main/resources
```

Archivos:

* guias.csv
* personas.csv

Estos archivos contienen la información inicial cargada por la aplicación.

---

# Principales conceptos aplicados

* Programación Orientada a Objetos
* Herencia
* Encapsulamiento
* Polimorfismo
* Interfaces
* Manejo de archivos CSV
* Organización en paquetes
* Colecciones de Java

---

# Ejecución

1. Clonar el repositorio.
2. Abrir el proyecto en IntelliJ IDEA.
3. Esperar la carga de Maven.
4. Ejecutar la clase:

```
ui.Main
```

---


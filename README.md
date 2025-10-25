# Curso de Desarrollo de Software con Java

Las clases se dictarán todos todos los sábados y domingos de 16:00 a 20:00 horas.

---

## Introducción

### Formato de las clases

- **16:00 a 18:00 :** Primer bloque
- **18:00 a 18:15 :** Descanso
- **18:15 a 20:00 :** Segundo bloque

---

### Al final de cada clase

- Escribir un breve resumen con sus propias palabras de los conceptos aprendidos.
- Subir el código al repositorio del curso (si aplica).

---

### Proyectos de cada mes

1. [Máquina expendedora](https://github.com/Johao-dev/java-development-course/tree/main/java_core/proyecto_final/proyecto.md)
2. [API REST de gestión de usuarios y productos](https://github.com/Johao-dev/java-development-course/tree/main/spring_framework/proyecto_final/proyecto.md)
3. [Sistema de reserva de citas médicas](https://github.com/Johao-dev/java-development-course/tree/main/arquitectura_limpia/proyecto_final/proyecto.md)

---

### Filosofia de enseñanza

> *Enseñar no es transmitir, es provocar la curiosidad. No se trata de que te escuchen, sino de que descubran contigo.*

---

## Temario

## Módulo 1: Java core

#### **Objetivo:**
Aprender conceptos de programación orientada a objetos.
Con una pequeña introducción a los conceptos necesarios para introducirse a los frameworks de Java.

| Tema | Detalles |
| ---- | -------- |
| Programación estructurada | - Que es la programación estructurada<br>- Problemas de la programación estructurada<br>- Como resolver la programación estructurada: POO |
| Programación Orientada a Objetos | - 4 pilares de la POO<br>- Clases y objetos; diferencia. <br>- Modificadores de acceso<br>- uso de static y final<br>- Jearquía de clases<br>- Comportamientos similares |
| Mini proyecto y patrones de diseño Abstract Factory y Strategy | - Patrón de diseño Abstract Factory<br>- Patrón de diseño Strategy<br>- [Mini proyecto fabrica de muebles](https://github.com/Johao-dev/java-development-course/tree/main/java_core/semana_01_POO/06-06-2025-Mini_Proyecto/miniproyecto1.md) |
| Estructuras de datos | - Qué es una estructura de datos<br>- Arrays: Ventajas y limitaciones<br>- Listas, Pilas, Colas, Conjuntos, Diccionarios<br>- Diferencias entre estructuras de datos lineales vs. no lieneales |
| Framework de Colecciones en Java | - Arquitectura de Java Collection Framework<br>- Interfaces principales de la API de Java Collections<br>- Implementaciones de la API de Java Collections<br>- Operaciones comunes con colecciones<br>- La clase Object |
| Patrón de Diseño Iterator | - Patrón de diseño Iterator |
| Por qué manejar excepciones, Por qué manejar archivos | - Introducción al manejo de excepciones<br>- Consecuencias de no manejar excepciones<br>- Necesidad de persistencia<br>- Problemas comunes al leer/escribir archivos. |
| Excepciones en Java / I/O API | - Jearquía de excepciones<br>- Excepciones comprobadas vs. no comprobadas<br>- Uso de try-catch-finally, throw y throws<br>- Creación de excepciones personalizadas<br>- Lectura y escritura de archivos: API de I/O Java<br>- Buena prática: Cerrar recursos con try-with-resources |
| Patrón de Diseño Template Method | - Patrón de diseño Template Method. |
| Como funcionan los frameworks y bibliotecas populares | - Diferencia entre librería, biblioteca y framework<br>- Principio de inversión de control (IoC)<br>- Qué es una dependencia<br>- Inyección de dependencia<br>- Inversión de dependencia<br>- Ventajas de usar frameworks<br>- Bibliotecas comunes. |
| Creación de anotaciones, Reflection API y genéricos | - Qué es una anotación<br>- Anotaciones estándar<br>- Anotaciones personalizadas<br>- Cómo se procesan las anotaciones<br>- Qué es la reflexión |
| Patrones de diseño Builder y Adapter | - Patrón de diseño Builder: Construcción de objetos complejos paso a paso<br>- Patrón de diseño Adapter: Adapta interfaces incompatibles |

---

## Módulo 2: Spring Framework

#### **Objetivo:**
Aprender a usar Spring Boot de manera práctica para crear APIs REST en Java.

| Tema | Detalles |
| ---- | -------- |
| Qué es Spring Boot: Principios y ventajas  | - Filosofía de Spring y qué resuelve Spring Boot<br>- Auto-configuración y convención sobre configuración<br>- Estructura típica de un proyecto Spring Boot<br>- Primera API con @RestController |
| Configuración y propiedades | - application.properties y application.yml<br>- Perfiles (@Profile), propiedades externas<br>- Validación de configuración (@ConfigurationProperties)<br>- Logging básico |
| Mini proyecto simple con Spring Boot | - API REST básica con operaciones CRUD en memoria<br>- ResponseEntity, manejo de rutas<br>- Presentación con Model, DTO y Service. |
| Introducción a JPA y Spring Data JPA | - Qué es JPA, Qué es Hibernate<br>- Entidades<br>- Repostorios<br>- Configurar base de datos |
| Relaciones y consultas | - Relaciones<br>- Carga rápida vs. carga diferida<br>- Queries con métodos, @Query y JPQL<br>- Paginación con Pageable | 3
| Mini proyecto con base de datos | - Crear y consumir entidades relacionadas<br>- Controladores que persisten, listan y consultan<br>- Validaciones con @Valid |
| Spring MVC y Rest Controllers | - @RestController, @RequestMapping, @GetMapping, etc<br>- @PathVariable, @QueryParam, etc<br>- Ciclo básico de una petición REST |
| Validaciones y excepciones | - @Valid, @NotNull, @Size, etc<br>- Manejo de errores con @ControllerAdvice, @ExceptionHandler, etc<br>- Buenas prácticas para estructurar una respuesta |
| Mini proyecto REST | - [Mini proyecto con buenas prácticas REST](https://github.com/Johao-dev/java-development-course/tree/main/spring_framework/mini_proyectos/Mini_Proyecto_1.md) |
| Fundamentos de seguridad web | - Por qué es necesario la seguridad en una API<br>- Autenticación y autorización<br>- Roles y permisos<br>Qué resueleve Spring Security |
| Introducción práctica a Spring Security | - Configurar autenticación en memoria<br>- Proteger rutas con roles<br>- Seguridad con HTTP Basic<br>- Otras formas de autenticar a un usuario |
| Mini proyecto + repaso del mes | - [Mini proyecto: API REST protegida con roles simples](https://github.com/Johao-dev/java-development-course/tree/main/spring_framework/mini_proyectos/Mini_Proyecto_2.md) |

---

## Módulo 3: Arqutictura y Arquitectura Limpia

#### **Objetivo:**
Aprender a crear sistemas reales, con principios de diseño y arquitectura de software.

| Tema | Detalles |
| ---- | -------- |
| Fundamentos de Arquitectura de Software  | - Qué es la arquitectura de software<br>- Arquitecturas de software<br>- Acoplamiento y cohesión<br>- Separación de responsabilidades<br>- Principio de inversión de dependencia |
| SOLID | - SOLID<br>- Ejemplos de SOLID<br>- Cómo SOLID se relaciona con la arquitectura de software |
| Capas en un sistema y sus responsabilidades | - Capa de dominio<br> Capa de aplicación<br>- Capa de infraestructura<br>- Capa de interfaz<br>- Patrón Service y DTO<br>- Como estructurar un proyecto profesional |
| Qué es un caso de uso | - Qué es un caso de uso<br>- Organizar lógica por intención, no por tecnología<br>- Separar negocio de infraestructura |
| Dominio y entidades ricas | - Qué es DDD<br>- Entidades vs. Value Objects<br>- Modelado de reglas de entidades<br>- Invarianzas y validaciones del dominio<br>- Reglas que no deben ir en los servicios |
| Repositorios y puertos | - Repositorios como interfaces de puertos<br>- Separar interfaces y adaptadores<br>- Inversión de dependencia (uso de interfaces)<br>- Mappers entre dominio y persistencia |
| Introducción a pruebas y TDD | - Por qué escribir tests<br>- Qué testear y que no testear<br>- Tipos de tests<br>- Ciclo de TDD |
| Mockito | - Mockito<br>- Cobertura de código |
| Pruebas de dominio y logica de negocio | - Tests de entidades ricas<br>- Tests de reglas de negocio<br>- TDD |
| Proyecto final | - [PROYECTO FINAL](https://github.com/Johao-dev/java-development-course/tree/main/arquitectura_limpia/proyecto_final/proyecto.md) |

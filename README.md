# Curso de Desarrollo de Software con Java

Las clases se dictarán todos todos los lunes, miércoles y viernes de
10:00 a 12:00 horas.

---

## Introducción

### Formato de las clases

- **10:00 a 10:10 :** Presentación de la clase
- **10:10 a 11:00 :** Primera parte de la clase
- **11:00 a 11:10 :** Descanso
- **11:10 a 12:00 :** Segunda parte de la clase

Debido al tiempo, la idea es que se aprenda uno o dos conceptos por semana.

Como solo tenemos dos horas de clase, el formato de la semana será:

1. **Lunes:** Presentación del problema que resuelve el concepto.
2. **Miércoles:** Presentación de la solución (el concepto en sí mismo).
3. **Viernes:** Presentación de ejemplos reales.

---

### Al final de cada clase

- Escribir un breve resumen con sus propias palabras del concepto aprendido.
- Subir el código al repositorio del curso.

---

### Proyectos de cada mes

1. [Máquina expendedora](https://github.com/Johao-dev/java-development-course/tree/main/junio/proyecto.md)
2. [API REST de gestión de usuarios y productos](https://github.com/Johao-dev/java-development-course/tree/main/julio/proyecto.md)
3. [Sistema de reserva de citas médicas](https://github.com/Johao-dev/java-development-course/tree/main/agosto/proyecto.md)

---

## Temario

## Junio

#### **Objetivo:**
Aprender conceptos de programación orientada a objetos.
Con una pequeña introducción a los conceptos necesarios para introducirse a los frameworks de Java.

| Semana | Día   | Tema | Detalles |
| ------ | ------ | ---- | -------- |
| 1      | Lunes | Programación estructurada | - Que es la programación estructurada<br>- Problemas de la programación estructurada<br>- Como resolver la programación estructurada: POO |
| 1 | Miércoles | Programación Orientada a Objetos | - 4 pilares de la POO<br>- Clases y objetos; diferencia. <br>- Modificadores de acceso<br>- uso de static y final<br>- Jearquía de clases<br>- Comportamientos similares |
| 1 | Viernes | Mini proyecto y patrones de diseño Abstract Factory y Strategy | - Patrón de diseño Abstract Factory<br>- Patrón de diseño Strategy<br>- [Mini proyecto fabrica de muebles](https://github.com/Johao-dev/java-development-course/tree/main/junio/te.txt) |
| 2 | Lunes | Estructuras de datos | - Qué es una estructura de datos<br>- Arrays: Ventajas y limitaciones<br>- Listas, Pilas, Colas, Conjuntos, Diccionarios<br>- Diferencias entre estructuras de datos lineales vs. no lieneales |
| 2 | Miércoles | Framework de Colecciones en Java | - Arquitectura de Java Collection Framework<br>- Interfaces principales de la API de Java Collections<br>- Implementaciones de la API de Java Collections<br>- Operaciones comunes con colecciones<br>- La clase Object |
| 2 | Viernes | Patrón de Diseño Iterator | - Patrón de diseño Iterator |
| 3 | Lunes | Por qué manejar excepciones, Por qué manejar archivos | - Introducción al manejo de excepciones<br>- Consecuencias de no manejar excepciones<br>- Necesidad de persistencia<br>- Problemas comunes al leer/escribir archivos. |
| 3 | Miércoles | Excepciones en Java / I/O API | - Jearquía de excepciones<br>- Excepciones comprobadas vs. no comprobadas<br>- Uso de try-catch-finally, throw y throws<br>- Creación de excepciones personalizadas<br>- Lectura y escritura de archivos: API de I/O Java<br>- Buena prática: Cerrar recursos con try-with-resources |
| 3 | Viernes | Patrón de Diseño Template Method | - Patrón de diseño Template Method. |
| 4 | Lunes | Como funcionan los frameworks y bibliotecas populares | - Diferencia entre librería, biblioteca y framework<br>- Principio de inversión de control (IoC)<br>- Qué es una dependencia<br>- Inyección de dependencia<br>- Inversión de dependencia<br>- Ventajas de usar frameworks<br>- Bibliotecas comunes. |
| 4 | Miércoles | Creación de anotaciones, Reflection API y genéricos | - Qué es una anotación<br>- Anotaciones estándar<br>- Anotaciones personalizadas<br>- Cómo se procesan las anotaciones<br>- Qué es la reflexión |
| 4 | Viernes | Patrones de diseño Builder y Adapter | - Patrón de diseño Builder: Construcción de objetos complejos paso a paso<br>- Patrón de diseño Adapter: Adapta interfaces incompatibles |

---

## Julio

#### **Objetivo:**
Aprender a usar Spring Boot de manera práctica para crear APIs REST en Java.

| Semana | Día   | Tema | Detalles |
| ------ | ------ | ---- | -------- |
| 1      | Lunes | Qué es Spring Boot: Principios y ventajas  | - Filosofía de Spring y qué resuelve Spring Boot<br>- Auto-configuración y convención sobre configuración<br>- Estructura típica de un proyecto Spring Boot<br>- Primera API con @RestController |
| 1 | Miércoles | Configuración y propiedades | - application.properties y application.yml<br>- Perfiles (@Profile), propiedades externas<br>- Validación de configuración (@ConfigurationProperties)<br>- Logging básico |
| 1 | Viernes | Mini proyecto simple con Spring Boot | - API REST básica con operaciones CRUD en memoria<br>- ResponseEntity, manejo de rutas<br>- Presentación con Model, DTO y Service. |
| 2 | Lunes | Introducción a JPA y Spring Data JPA | - Qué es JPA, Qué es Hibernate<br>- Entidades<br>- Repostorios<br>- Configurar base de datos |
| 2 | Miércoles | Relaciones y consultas | - Relaciones<br>- Carga rápida vs. carga diferida<br>- Queries con métodos, @Query y JPQL<br>- Paginación con Pageable | 3
| 2 | Viernes | Mini proyecto con base de datos | - Crear y consumir entidades relacionadas<br>- Controladores que persisten, listan y consultan<br>- Validaciones con @Valid |
| 3 | Lunes | Spring MVC y Rest Controllers | - @RestController, @RequestMapping, @GetMapping, etc<br>- @PathVariable, @QueryParam, etc<br>- Ciclo básico de una petición REST |
| 3 | Miércoles | Validaciones y excepciones | - @Valid, @NotNull, @Size, etc<br>- Manejo de errores con @ControllerAdvice, @ExceptionHandler, etc<br>- Buenas prácticas para estructurar una respuesta |
| 3 | Viernes | Mini proyecto REST | - [Mini proyecto con buenas prácticas REST](https://github.com/Johao-dev/java-development-course/tree/main/julio/te.txt) |
| 4 | Lunes | Fundamentos de seguridad web | - Por qué es necesario la seguridad en una API<br>- Autenticación y autorización<br>- Roles y permisos<br>Qué resueleve Spring Security |
| 4 | Miércoles | Introducción práctica a Spring Security | - Configurar autenticación en memoria<br>- Proteger rutas con roles<br>- Seguridad con HTTP Basic<br>- Otras formas de autenticar a un usuario |
| 4 | Viernes | Mini proyecto + repaso del mes | - [Mini proyecto: API REST protegida con roles simples](https://github.com/Johao-dev/java-development-course/tree/main/julio/te.txt) |

---

## Agosto

#### **Objetivo:**
Aprender a crear sistemas reales, con principios de diseño y arquitectura de software.

| Semana | Día   | Tema | Detalles |
| ------ | ------ | ---- | -------- |
| 1      | Lunes | Fundamentos de Arquitectura de Software  | - Qué es la arquitectura de software<br>- Arquitecturas de software<br>- Acoplamiento y cohesión<br>- Separación de responsabilidades<br>- Principio de inversión de dependencia |
| 1 | Miércoles | SOLID | - SOLID<br>- Ejemplos de SOLID<br>- Cómo SOLID se relaciona con la arquitectura de software |
| 1 | Viernes | Capas en un sistema y sus responsabilidades | - Capa de dominio<br> Capa de aplicación<br>- Capa de infraestructura<br>- Capa de interfaz<br>- Patrón Service y DTO<br>- Como estructurar un proyecto profesional |
| 2 | Lunes | Qué es un caso de uso | - Qué es un caso de uso<br>- Organizar lógica por intención, no por tecnología<br>- Separar negocio de infraestructura |
| 2 | Miércoles | Dominio y entidades ricas | - Qué es DDD<br>- Entidades vs. Value Objects<br>- Modelado de reglas de entidades<br>- Invarianzas y validaciones del dominio<br>- Reglas que no deben ir en los servicios |
| 2 | Viernes | Repositorios y puertos | - Repositorios como interfaces de puertos<br>- Separar interfaces y adaptadores<br>- Inversión de dependencia (uso de interfaces)<br>- Mappers entre dominio y persistencia |
| 3 | Lunes | Introducción a pruebas y TDD | - Por qué escribir tests<br>- Qué testear y que no testear<br>- Tipos de tests<br>- Ciclo de TDD |
| 3 | Miércoles | Mockito | - Mockito<br>- Cobertura de código |
| 3 | Viernes | Pruebas de dominio y logica de negocio | - Tests de entidades ricas<br>- Tests de reglas de negocio<br>- TDD |
| 4 | Lunes | Proyecto final | - [PROYECTO FINAL](https://github.com/Johao-dev/java-development-course/tree/main/agosto/te.txt) |
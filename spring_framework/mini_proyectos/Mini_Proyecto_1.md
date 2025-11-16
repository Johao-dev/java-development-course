# Mini Proyecto 1: API REST para Gestión de Tareas (Todo List)

> **Nivel:** Básico-Intermedio  
> **Objetivo:** Aplicar Spring Boot, Spring MVC (REST), Spring Data JPA, Validaciones y Manejo de Excepciones con `@ControllerAdvice`  
> **Tiempo estimado:** 3-5 horas

---

## Descripción

Debes crear una **API REST completa** para gestionar tareas (Todo List) con las siguientes funcionalidades:

| Funcionalidad | Método HTTP | Endpoint |
|---------------|-------------|----------|
| Listar tareas (con paginación y filtros) | `GET` | `/api/todos` |
| Obtener una tarea por ID | `GET` | `/api/todos/{id}` |
| Crear tarea | `POST` | `/api/todos` |
| Actualizar tarea | `PUT` | `/api/todos/{id}` |
| Marcar como completada/no completada | `PATCH` | `/api/todos/{id}/toggle` |
| Eliminar tarea | `DELETE` | `/api/todos/{id}` |

---

## Requisitos Funcionales

1. **Paginación y ordenamiento** en el listado (`?page=0&size=10&sort=title,asc`)
2. **Filtros opcionales**:
   - Por título (búsqueda parcial, ignorando mayúsculas): `?title=java`
   - Por estado: `?completed=true`
3. **Validaciones** en creación y actualización:
   - Título: obligatorio, 3-100 caracteres.
   - Descripción: opcional, máximo 500 caracteres.
4. **Manejo de errores global** con `@ControllerAdvice`:
   - `404` si no existe la tarea
   - `400` con mensajes claros en validaciones
   - `500` genérico

---

## Tecnologías a Usar

- Spring Boot 3.x
- Spring MVC (REST)
- Spring Data JPA
- MySQL como base de datos
- Spring Validation (`@Valid`, Bean Validation)
- `@ControllerAdvice` para excepciones
- (Opcional) Lombok para reducir boilerplate

---

## Estructura del Proyecto (Sugerida)

```txt
src/main/java/name.projects.todo
├── TodoApplication.java
├── controller/
│   └── TodoController.java
├── persistence/
    ├── repository/
    │   └── TodoRepository.java
    ├── entity/
    │   └── Todo.java
├── service/
│   └── TodoService.java
├── exception/
│   ├── ResourceNotFoundException.java
│   └── GlobalExceptionHandler.java
├── dto/
│   └── TodoRequest.java
```

---

## Configuración del Proyecto

Usa [Spring Initializr](https://start.spring.io/) con:
  - **Project**: Maven
  - **Language**: Java
  - **Spring Boot**: 3.x
  - **Dependencies**:
     - Spring Web
     - Spring Data JPA
     - MySQL Driver
     - Spring Boot DevTools
     - Spring Validation
     - Lombok
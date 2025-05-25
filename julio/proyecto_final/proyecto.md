# API REST de Gestión de Usuarios y Productos

---

## Objetivo

Aprender a desarrollar una API REST con Spring Framework y Spring Boot, aplicando los principios fundamentales del desarrollo backend profesional.

Este proyecto busca que el estudiante trabaje de forma práctica con:

- Controladres REST.
- Persistencia de datos con JPA y Spring Data.
- Validaciones.
- Relaciones entre entidades.
- Manejo de errores.
- Seguridad básica.
- Buenas prácticas y separación de capas.

---

## Descripción del proyecto

Se desarrollará una API REST de gestión de usuarios y productos, donde cada usuario puede registrar sus productos listarlos, actualizarlos o eliminarlos.

#### Ejemplo:

- Usuario: Juan Pérez
- Productos: Celular, Laptop, Teclado

**Cada producto estará asociado a un único usuario.**

### Seguridad

Se deben proteger las operaciones de edición y eliminación de productos. Solo el **usuario dueño del producto** podrá modificarlos o eliminarlos.

---

## Requerimientos funcionales

### usuarios

- Registrar usuario (`POST /api/usuarios`)
- Listar todos los usuarios (`GET /api/usuarios`)
- Ver un usuario especifico (`GET /api/usuarios/{id}`)

### productos

- Registrar producto asociado a un usuario (`POST /api/usuarios/{id}/productos`)
- Listar todos los productos (`GET /api/productos`)
- Ver detalle de un producto especifico (`GET /api/productos/{id}`)
- Editar un producto **(solo su dueño)** (`PUT /api/productos/{id}`)
- Eliminar un producto **(solo su dueño)** (`DELETE /api/productos/{id}`)
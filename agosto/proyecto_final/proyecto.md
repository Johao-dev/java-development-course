# Sistema de Reserva de Citas Médicas

---

## Objetivo

Aplicar todo lo aprendido en el curso Desarrollo de Software con Java.
Este proyecto busca que el estudiante sea capaz de desarrollar sistemas
reales, con principios de diseño y arquitectura de software.

---

## Situación (Ficticia)

El Hospital San Vital, una institución medica de tamaño mediano
ubicada en una zona urbana, enfrenta actualmente varios desafíos
en la gestión de sus citas médicas. La administración de turnos
se realiza de forma manual (cuadernos o llamadas telefónicas),
lo cual ha generado:

- Doble reserva de horarios (conflictos entre pacientes).
- Pérdida de información (citas extraviadas o mal anotadas).
- Tiempo excesivo del personal administrativo en tareas
  repetitivas.
- Poca visibilidad por parte de los pacientes sobre su historial
  de citas o disponibilidad de médicos.
- Imposibilidad de escalar o controlar eficientemente los datos
  generados por consultas médicas.

---

## Solución requerida

El hospital necesita un sistema de reserva de citas médicas que
permita a los pacientes, doctores, administradores de horarios y
administradores generales interactuar con sus respectivas
funcionalidades desde cualquier dispositivo con acceso a
internet. El sistema debe ser seguro, rápido, escalable y fácil
de usar.

---

## Requerimientos funcionales

Usuarios y roles:

### 1. Paciente:

- Registrarse en el sistema.
- Iniciar sesión en el sistema.
- Consultar la disponibilidad de los doctores (horarios).
- Solicitar una nueva cita médica, especificando un doctor y la
  fecha y hora deseada.
- Ver el estado de sus citas (pendiente, confirmada, rechazada,
  cancelada, completada).
- Cancelar citas pendientes o confirmadas (con una semana de
  anticipación).
- Consultar su historial de citas.
- Actualizar su información personal.

### 2. Doctor:

- Registrarse en el sistema (a través de un admin).
- Iniciar sesión en el sistema.
- Ver su historial de citas programadas (confirmadas).
- Ver su disponibilidad horario gestionada por el admin de
  horarios.
- Ver el historial de citas atendidas.
- Actualizar su información personal.

### 3. Administrador de horarios:

- Registrarse en el sistema (a través de un admin).
- Iniciar sesión en el sistema.
- Gestionar la disponibilidad de horarios de los doctores (
  crear, modificar, eliminar horarios disponibles).
- Visualizar las solicitudes de citas pendientes.
- Confirmar o rechazar las solicitudes de citas, basándose en la
  disponibilidad del doctor.
- Ver el estado de las citas.

### 4. Administrador general:

- Registrarse en el sistema.
- Iniciar sesión en el sistema.
- Gestionar las cuentas de todos los usuarios (pacientes,
  doctores, admin de horarios, otros admin generales). (crear,
  editar, eliminar usuarios, asignar roles).
- Monitorear todas las citas realizadas en el sistema (paciente,
  doctor, fecha, hora, estado).
- Ver quien realizó la solicitud de la cita.
- Ver quien confirmó o rechazó cada cita.
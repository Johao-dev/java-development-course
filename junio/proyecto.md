# Máquina expendedora

---

## Objetivo

Aplicar la base fundamental de la programación orientada a objetos, haciendo uso de:

- **Patrones de diseño:** Strategy y Abstract Factory.
- Uso de colecciones genéricas para almacenar datos.
- Implementación de excepciones personalizadas.
- Persistencia y lectura de datos usando archivos.
- Separación de responsabilidades y buen diseño de clases.

---

## Descripción del proyecto

Este sistema será una aplicación de consola que simulará el comportamiento de una máquina expendedora de bebidas.

### Fljo general:

1. Al iniciar, se cargarán desde un archivo los **productos disponibles:** cada uno con un `código`, `nombre`, `precio` y `stock`.
2. Se muestran los productos disponibles agrupados por tipo:

- Gaseosas
- Jugos
- Bebidas energéticas

3. El usuario elige un producto ingresando su código.
4. Luego, selecciona un **método de pago:**
- Efectivo
- Tarjeta de crédito/débito
- Pago móvil (QR, como Yape o Plin)

5. Se aplica el método de pago correspondiente.
6. Se actualiza el stock del producto y se emite el registro de la compra con los resultados del pago en un archivo.

---

## Requerimientos funcionales

- Mostrar menú de productos agrupados por tipo de bebida.
- Permitir al usuario seleccionar un producto ingresando su código.
- Elegir un método de pago.
- Validar si hay stock disponible.
- Realizar el pago (simulado).
- Generar un ticket de compra (mostrar en consola y guardar en archivo).
- Manejo de errores con excepciones personalizadas.

---

## Ejemplo del menú

```text
=== MÁQUINA EXPENDEDORA DE BEBIDAS ===

Código | Producto      | Precio | Stock
---------------------------------------
G01    | Coca-Cola     | 3.50   | 5
G02    | Fanta         | 3.00   | 2
J01    | Jugo de Naranja | 2.50 | 3
E01    | Red Bull      | 5.00   | 4

Ingrese el código del producto: G01

Seleccione método de pago:
1. Efectivo
2. Tarjeta
3. Pago móvil

Monto a pagar: 3.50
¡Pago realizado con éxito!
Gracias por su compra.
```
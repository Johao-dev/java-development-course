package zuzz.test.colecciones.MiguelTareita;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author migue
 */
public class Cliente {

    public static void main(String[] args) {
        //ejercicio1();
        //ejercicio2();
//        Producto producto1 = new Producto("producto1", 10.0);
//        Producto producto2 = new Producto("producto1", 10.0);
//
//        if (producto1 == producto2)// == (comparar direccion en memoria) /equals(compara el contenido)
//        {
//            System.out.println("Son iguales");
//        } else {
//            System.out.println("No son iguales");
//        }
        ejercicioFinal();
    }

    public static void ejercicio1() {
        Producto producto1 = new Producto("producto 1", 12.0);
        Producto producto2 = new Producto("producto 2", 15.0);
        Producto producto3 = new Producto("producto 3", 20.0);
        List<Producto> productos = new ArrayList<>();
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);

        for (Producto producto : productos) {
            System.out.println(producto.toString());
        }
    }

    public static void ejercicio2() {
        Set<Producto> productos = new HashSet<>();
        productos.add(new Producto("Teclado", 25.0));
        productos.add(new Producto("Teclado", 25.0));

        int cantidadElementos = productos.size();
        System.out.println("La coleccion tiene: " + cantidadElementos + " elementos");

    }

    public static void ejercicioFinal() {
        List<Producto> productos = new ArrayList<>();
        Producto producto1 = new Producto("telefono 1", 12.0);
        Producto producto2 = new Producto("computadora 2", 10.0);
        Producto producto3 = new Producto("teclado 3", 20.0);
        Producto producto4 = new Producto("mouse", 10.0);
        Producto producto5 = new Producto("pantalla", 10.0);

        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
        productos.add(producto4);
        productos.add(producto5);
        
        
        for (Producto producto : productos) { 
            System.out.println(producto.toString());
        }
        System.out.println("PRODUCTO ELIMINADO");
        productos.remove(3);
        for (Producto producto : productos) { 
            System.out.println(producto.toString());
        }
        


        System.out.println("===============");
        System.out.println("LO QUE ME VOY A LLEVAR\n");
        // Crear un HashMap
        Map<Producto, Integer> productoSelect = new HashMap<>();
        productoSelect.put(producto3, 2);
        productoSelect.put(producto2, 2);
        double total = 0;
        double subtotal = 0;
        for (Map.Entry<Producto, Integer> entry : productoSelect.entrySet()) {
            Producto producto = entry.getKey();
            int cantidad = entry.getValue();
            double precioProduc = producto.getPrecio() * cantidad;

            subtotal += precioProduc;
            total += subtotal;

            System.out.println("Producto: " + producto.getNombre() + ", Precio: " + producto.getPrecio() + ", Cantidad: " + cantidad);
            System.out.println("subTotal: " + subtotal);

        }
        System.out.println("Total a pagar: " + total);

    }

}

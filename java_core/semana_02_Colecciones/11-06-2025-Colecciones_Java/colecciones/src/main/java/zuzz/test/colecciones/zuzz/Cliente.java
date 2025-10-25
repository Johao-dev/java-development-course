package zuzz.test.colecciones.zuzz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author zuzzDev
 */
public class Cliente extends Object {

    public static void main(String[] args) {
//        ejercicio1();
//        ejercicio2();

//        Producto producto1 = new Producto("producto1", 10.0);
//        Producto producto2 = new Producto("producto1", 10.0);
//        
//        if (producto1.equals(producto2))
//            System.out.println("Son iguales");
//        else
//            System.out.println("No son iguales");

        ejercicioFinal();
    }

    public static void ejercicio1() {
        // 1. Crear 3 productos
        Producto producto1 = new Producto("producto1", 10.0);
        Producto producto2 = new Producto("producto2", 15.0);
        Producto producto3 = new Producto("producto3", 20.0);

        // 2. Agregar a una lista de productos
        List<Producto> productos = new ArrayList<>();

        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);

        // Crea una lista con productos inmutables
        // List<Producto> productos2 = List.of(producto1, producto2, producto3);
        // este bucle for fue inventado especificamente para recorrer colecciones
        for (Producto producto : productos) {
            System.out.println(producto/*.toString()*/);
        }
    }

    public static void ejercicio2() {
        Set<Producto> productos = new HashSet<>();
        productos.add(new Producto("Teclado", 25.0));
        productos.add(new Producto("Teclado", 25.0));
        
        int cantidadElementos = productos.size();
        System.out.println("cantidadElementos = " + cantidadElementos);
    }
    
    public static void ejercicioFinal() {
        // Catalogo de productos
        List<Producto> productos = List.of(
                new Producto("Producto 1", 10.0),
                new Producto("Producto 2", 15.0),
                new Producto("Producto 3", 20.0),
                new Producto("Producto 4", 25.0),
                new Producto("Producto 5", 30.0)
        );
        
        // Carrito
        Map<Producto, Integer> carrito = new HashMap<>();
        
        // Agregar elemento al carrito
        System.out.println("Agregando 3 elementos al carrito");
        
        agregarElemento(productos.get(0), 2, carrito);
        agregarElemento(productos.get(2), 5, carrito);
        agregarElemento(productos.get(4), 3, carrito);
        
        System.out.println("Recorriendolo para verificar si se agregaron los elementos:");
        recorrerCarrito(carrito);
        
        // Eliminar elemento al carrito
        System.out.println("Eliminando el 3 elemento del carrito");
        eliminarElemento(productos.get(2), carrito);
        
        System.out.println("Recorriendolo para verificar si se elimino el elemento:");
        recorrerCarrito(carrito);
        
        double total = calcularTotal(carrito);
        System.out.println("total a pagar = " + total);
    }
    
    public static void agregarElemento(Producto producto, Integer cantidad, Map<Producto, Integer> carrito) {
        carrito.put(producto, cantidad);
    }
    
    public static void eliminarElemento(Producto key, Map<Producto, Integer> carrito) {
        carrito.remove(key);
    }
    
    public static double calcularTotal(Map<Producto, Integer> carrito) {
        double total = 0;
        
        Set<Map.Entry<Producto, Integer>> elementosCarrito = carrito.entrySet();
        for (Map.Entry<Producto, Integer> elemento : elementosCarrito) {
            Producto producto = elemento.getKey();
            double cantidad = elemento.getValue();
            total += producto.getPrecio() * cantidad;
        }
        return total;
    }
    
    public static void recorrerCarrito(Map<Producto, Integer> carrito) {
        Set<Map.Entry<Producto, Integer>> elementosCarrito = carrito.entrySet();
        for (Map.Entry<Producto, Integer> elemento : elementosCarrito) {
            System.out.println(elemento);
        }
    }
}

package zuzz.test.estructura_de_datos.principalesestructuras;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Listas {

    // ArrayList
    private List<String> listaNormal = new ArrayList<>();
    private List<String> listaDoblementeEnlazada = new LinkedList<>();
    private List<String> vector = new Vector<>();

    // LIFO
    private List<String> pila = new Stack<>();

    // FIFO
    private Deque<String> colas = new ArrayDeque<>();

    // principales operaciones con listas
    public void agregar(String nombre) {
        // con .add(E) agrego un elemento
        this.listaNormal.add(nombre);
    }

    public void eliminar(String nombre) {
        // con .remove(O) eliminamos un elemento
        this.listaNormal.remove(nombre);
    }

    public static void main(String[] args) {
        Listas listas = new Listas();

        listas.colas.add("Jose");
        listas.colas.add("Marta");
        listas.colas.add("Enrique");

        Iterator<String> colaIterator = listas.colas.iterator();

        while (colaIterator.hasNext()) {
            System.out.println(colaIterator.next());
        }
        
        for (String elemento : listas.colas) {
            System.out.println(elemento);
        }
    }
}

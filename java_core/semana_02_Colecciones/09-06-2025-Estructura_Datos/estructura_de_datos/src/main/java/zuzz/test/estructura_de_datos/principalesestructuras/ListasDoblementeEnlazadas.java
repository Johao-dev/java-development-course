package zuzz.test.estructura_de_datos.principalesestructuras;

// No ejecutar
public class ListasDoblementeEnlazadas {

    /**
     * Nodo de la lista.
     */
    static class Nodo {

        int num;
        Nodo LLink; // Enlace izquierdo
        Nodo RLink; // Enlace derecho
    }
    static Nodo ptr; // Primer elemento de la lista

    public static void main(String[] args) {
        // Mostrar lista
        mostrarLista();
        // Añadir elementos de prueba (0, 2, 3, 4)
        addElem(0);
        addElem(2);
        addElem(3);
        addElem(4);
        // Mostrar de nuevo la lista
        /**
         * $ 0
         * $ 2
         * $ 3
         * $ 4
         */
        mostrarLista();
    }

    /**
     * Añadir elemento a la lista.
     *
     * @param elem Elemento que sera añadido.
     */
    static void addElem(int elem) {
        Nodo nuevo = new Nodo(); // Crear nuevo nodo

        if (ptr == null) { // Si la lista esta vacía
            nuevo.num = elem;
            ptr = nuevo;
        } else {
            // Si la lista no está vacía la recorremos hasta llegar al final, para agregar el nuevo elemento de último.
            Nodo ant = ptr;
            Nodo p = ptr.RLink;

            while (p != null) {
                ant = p;
                p = p.RLink;
            }

            /**
             * null <-|n|=|ant|-> null              =|ant|<-|nuevo|
          * -|nuevo|-> null =|ant|=|nuevo|->null
             */
            if (p == null) {
                nuevo.num = elem;
                nuevo.LLink = ant;
                nuevo.RLink = null;
                ant.RLink = nuevo;
            }
        }
    }

    /**
     * Mostrar en consola los elementos de la lista.
     */
    static void mostrarLista() {
        if (ptr == null) {
            System.out.println("No hay elementos en la lista");
        } else {
            Nodo p = ptr;
            while (p != null) {
                System.out.println(p.num);
            }
            p = p.RLink;
        }
    }

    /**
     * Buscar un elemento en la lista.
     *
     * @param elem Elemento que sera buscado.
     * @return Falso si no fue encontrado. Verdadero si fue encontrado.
     */
    static boolean buscarElem(int elem) {
        Nodo temp = ptr;
        while (temp != null) {
            if (temp.num == elem) {
                return true;
            }
            temp = temp.RLink;
        }

        return false;
    }
}

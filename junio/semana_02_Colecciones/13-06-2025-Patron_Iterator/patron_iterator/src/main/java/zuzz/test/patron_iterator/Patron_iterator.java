package zuzz.test.patron_iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author zuzzDev
 */
public class Patron_iterator {

    public static void main(String[] args) {
        
        List<String> nombres = List.of(
            "Jose",
                "Juan",
                "Maria",
                "Roberto"
        );
        
        // 1 usando for Each
        System.out.println("For-each:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
        
        // 2. usando for tradicional
        System.out.println("for tradicional:");
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i));
        }
        
        // 3. Forma "correcta" usando el patron Iterator
        System.out.println("Patron iterator:");
        Iterator<String> iterador = nombres.iterator();
        // ListIterator<String> iterador2 = nombres.listIterator();
        while(iterador.hasNext()) {
            System.out.println(iterador.next());
        }
        
        // Recorriendo un mapa
        System.out.println("Recorriendo un mapa");
        Map<String, String> contactos = new HashMap<>();
        contactos.put("Juan", "999999999");
        contactos.put("Jose", "123456789");
        contactos.put("Maria", "987654321");
        contactos.put("Roberto", "156753852");
        
        Set<Map.Entry<String, String>> conjuntoContactos = contactos.entrySet();
        Iterator<Map.Entry<String, String>> iteradorConjunto = conjuntoContactos.iterator();
        
        while (iteradorConjunto.hasNext()) {
            System.out.println(iteradorConjunto.next());
        }
    }
}

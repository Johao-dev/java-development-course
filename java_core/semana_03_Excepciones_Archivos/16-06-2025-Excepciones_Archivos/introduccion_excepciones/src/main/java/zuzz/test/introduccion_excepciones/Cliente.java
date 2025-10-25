package zuzz.test.introduccion_excepciones;

/**
 *
 * @author zuzzDev
 */
public class Cliente {
    
    public void patos() throws Pato {
        System.out.println("Lanzando patos");
        throw new Pato();
    }
}

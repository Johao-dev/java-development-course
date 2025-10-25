package zuzz.test.introduccion_excepciones;

/**
 *
 * @author zuzzDev
 */
// Excepcion comprobada
public class Pato extends Exception {
    
    public Pato() {
        System.out.println("Lanzaste un pato");
    }
}

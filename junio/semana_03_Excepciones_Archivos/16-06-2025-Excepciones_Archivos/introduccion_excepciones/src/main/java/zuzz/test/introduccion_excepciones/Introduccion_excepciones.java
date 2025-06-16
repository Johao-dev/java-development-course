package zuzz.test.introduccion_excepciones;

/**
 *
 * @author zuzzDev
 */
public class Introduccion_excepciones {

    public static void main(String[] args) {
        int r1 = dividir(10, 2);
        System.out.println("r1 = " + r1);
    }

    public static int dividir(int n1, int n2) {
        return n2 == 0 ? 0 : n1 / n2;
    }
}

package zuzz.test.poo.polimorfismo;

/**
 *
 * @author ASUS
 */
public class PagoTarjeta implements Pagar {
 
    @Override
    public void pagar() {
        System.out.println("Pagar con tarjeta");
    }
}

package zuzz.test.poo.polimorfismo;

public class PagoMovil implements Pagar {
    
    @Override
    public void pagar() {
        System.out.println("Pagar con Yape");
    }
}
    
package zuzz.test.poo.polimorfismo;

public class PagoEfectivo implements Pagar {
    
    @Override
    public void pagar() {
        System.out.println("Pago con efectivo");
    }
}


package com.mycompany.tareamiguel;

public class PagoPaypal implements MetodoPago {
    @Override
    public void pagar(double cantidad) {
        System.out.println("Pagando $" + cantidad + " con PayPal.");
    }
}


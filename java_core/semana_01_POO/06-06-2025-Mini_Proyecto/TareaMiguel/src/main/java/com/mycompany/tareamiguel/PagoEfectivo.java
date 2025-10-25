package com.mycompany.tareamiguel;


public class PagoEfectivo implements MetodoPago {
    @Override
    public void pagar(double cantidad) {
        System.out.println("Pagando $" + cantidad + " en efectivo.");
    }
}


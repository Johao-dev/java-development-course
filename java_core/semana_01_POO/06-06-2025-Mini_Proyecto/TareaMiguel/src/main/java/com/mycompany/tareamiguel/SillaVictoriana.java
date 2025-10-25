
package com.mycompany.tareamiguel;

public class SillaVictoriana implements Silla {
    @Override
    public void describir() {
        System.out.println("Silla victoriana: madera tallada y tapizado floral.");
    }
    @Override
    public String obtenerNombre() {
         return "Silla victoriana";
    }
}

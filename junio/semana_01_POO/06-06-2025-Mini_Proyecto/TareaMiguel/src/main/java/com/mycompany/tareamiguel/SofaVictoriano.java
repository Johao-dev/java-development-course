
package com.mycompany.tareamiguel;

public class SofaVictoriano implements Sofa {
    @Override
    public void describir() {
        System.out.println("Sofá victoriano: curvas y tela elegante.");
    }

    @Override
    public String obtenerNombre() {
        return("Sofá victoriano");
    }
    
}


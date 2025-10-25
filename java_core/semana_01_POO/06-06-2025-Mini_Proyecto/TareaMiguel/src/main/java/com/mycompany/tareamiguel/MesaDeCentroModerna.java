
package com.mycompany.tareamiguel;

public class MesaDeCentroModerna implements MesaDeCentro {
    @Override
    public void describir() {
        System.out.println("Mesa de centro moderna: vidrio y patas geométricas.");
    }

    @Override
    public String obtenerNombre() {
        return("Mesa de centro moderna");
    }
}

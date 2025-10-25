
package com.mycompany.tareamiguel;

public class MesaDeCentroVictoriana implements MesaDeCentro {
    @Override
    public void describir() {
        System.out.println("Mesa de centro victoriana: madera oscura y ornamentos.");
    }


    @Override
    public String obtenerNombre() {
        return ("Mesa de centro victoriana");
    }
}
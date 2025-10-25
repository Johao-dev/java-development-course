package com.mycompany.ejemmenu_02;

public class Restaurante {

    private final PrimerPlato primer;
    private final SegundoPlato segundo;

    public Restaurante(MenuFactory factory) {
        this.primer = factory.crearPrimerPlato();
        this.segundo = factory.crearSegundoPlato();
    }

    public void servirComida() {
        primer.servir();
        segundo.servir();
    }

}

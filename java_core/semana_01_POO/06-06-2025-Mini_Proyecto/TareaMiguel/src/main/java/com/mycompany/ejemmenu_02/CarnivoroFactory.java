
package com.mycompany.ejemmenu_02;

public class CarnivoroFactory implements MenuFactory {
    public PrimerPlato crearPrimerPlato() {
        return new SopaDePollo();
    }
    public SegundoPlato crearSegundoPlato() {
        return new Bistec();
    }
}
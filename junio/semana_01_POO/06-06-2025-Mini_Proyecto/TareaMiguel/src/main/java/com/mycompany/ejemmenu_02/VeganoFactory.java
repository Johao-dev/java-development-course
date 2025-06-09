
package com.mycompany.ejemmenu_02;

public class VeganoFactory implements MenuFactory{

    @Override
    public PrimerPlato crearPrimerPlato() {
        return new Ensala();
    }

    @Override
    public SegundoPlato crearSegundoPlato() {
        return new TofuSalteado();
    }
    
}
